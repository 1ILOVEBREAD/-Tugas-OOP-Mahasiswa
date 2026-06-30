package simakademi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import simakademi.model.Student;
import simakademi.util.DatabaseConnection;

public class StudentDAO {

    private Student map(ResultSet rs) throws SQLException {
        return new Student(
            rs.getString("nim"),
            rs.getString("nama"),
            rs.getString("prodi"),
            rs.getString("angkatan")
        );
    }

    public List<Student> findAll() {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT nim, nama, prodi, angkatan FROM mahasiswa ORDER BY nim";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Student s = map(rs);
                list.add(s);
            }
        } catch (SQLException e) {
            System.err.println("StudentDAO.findAll error: " + e.getMessage());
        }
        return list;
    }

    public List<Student> findByKeyword(String keyword) {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT nim, nama, prodi, angkatan FROM mahasiswa "
                   + "WHERE LOWER(nim) LIKE ? OR LOWER(nama) LIKE ? ORDER BY nim";
        String like = "%" + keyword.toLowerCase() + "%";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, like);
            ps.setString(2, like);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) list.add(map(rs));
            }
        } catch (SQLException e) {
            System.err.println("StudentDAO.findByKeyword error: " + e.getMessage());
        }
        return list;
    }

    public boolean isNimExists(String nim) {
        String sql = "SELECT 1 FROM mahasiswa WHERE TRIM(nim) = ?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nim.trim());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            System.err.println("StudentDAO.isNimExists error: " + e.getMessage());
        }
        return false;
    }

    public int count() {
        String sql = "SELECT COUNT(*) FROM mahasiswa";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            if (rs.next()) return rs.getInt(1);
        } catch (SQLException e) {
            System.err.println("StudentDAO.count error: " + e.getMessage());
        }
        return 0;
    }

    public void insert(Student s) {
        String sql = "INSERT INTO mahasiswa (nim, nama, prodi, angkatan) VALUES (?, ?, ?, ?)";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, s.getNim().trim());
            ps.setString(2, s.getName().trim());
            ps.setString(3, s.getStudyProgram().trim());
            ps.setString(4, s.getAngkatan().trim());
            int rows = ps.executeUpdate();
            System.out.println("✅ Inserted " + rows + " row(s)");
        } catch (SQLException e) {
            System.err.println("StudentDAO.insert error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void update(Student s) {
        String sql = "UPDATE mahasiswa SET nama=?, prodi=?, angkatan=? WHERE TRIM(nim) = ?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, s.getName().trim());
            ps.setString(2, s.getStudyProgram().trim());
            ps.setString(3, s.getAngkatan().trim());
            ps.setString(4, s.getNim().trim());
            int rowsAffected = ps.executeUpdate();
            System.out.println("✅ Updated " + rowsAffected + " row(s) with NIM: " + s.getNim());
        } catch (SQLException e) {
            System.err.println("StudentDAO.update error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void delete(String nim) {
        System.out.println("🔍 DELETE called with NIM: '" + nim + "'");
        if (nim == null) {
            System.err.println("❌ NIM is null!");
            return;
        }
        String trimmedNim = nim.trim();
        System.out.println("🔍 Trimmed NIM: '" + trimmedNim + "'");
        
        // First, check if the NIM exists (with TRIM to handle spaces)
        String checkSql = "SELECT nim FROM mahasiswa WHERE TRIM(nim) = ?";
        boolean exists = false;
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(checkSql)) {
            ps.setString(1, trimmedNim);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String dbNim = rs.getString("nim");
                System.out.println("🔍 Found in database: '" + dbNim + "' (length: " + dbNim.length() + ")");
                exists = true;
            } else {
                System.out.println("⚠️ NIM not found in database");
            }
        } catch (SQLException e) {
            System.err.println("❌ Error checking NIM: " + e.getMessage());
        }
        
        if (!exists) {
            System.err.println("⚠️ No rows deleted! NIM: " + trimmedNim + " not found.");
            return;
        }
        
        // Delete from krs first using TRIM
        String deleteKrsSql = "DELETE FROM krs WHERE TRIM(nim) = ?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(deleteKrsSql)) {
            ps.setString(1, trimmedNim);
            int krsDeleted = ps.executeUpdate();
            System.out.println("🗑️ Deleted " + krsDeleted + " KRS record(s) for NIM: " + trimmedNim);
        } catch (SQLException e) {
            System.err.println("❌ Error deleting KRS: " + e.getMessage());
            e.printStackTrace();
        }
        
        // Delete from mahasiswa with TRIM
        String deleteMahasiswaSql = "DELETE FROM mahasiswa WHERE TRIM(nim) = ?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(deleteMahasiswaSql)) {
            ps.setString(1, trimmedNim);
            int rowsAffected = ps.executeUpdate();
            System.out.println("🗑️ Deleted " + rowsAffected + " student(s) with NIM: " + trimmedNim);
            if (rowsAffected == 0) {
                System.err.println("⚠️ No rows deleted from mahasiswa! NIM: " + trimmedNim + " not found.");
            }
        } catch (SQLException e) {
            System.err.println("❌ StudentDAO.delete error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}