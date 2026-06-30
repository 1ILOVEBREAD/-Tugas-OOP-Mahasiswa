package simakademi.controller;

import java.util.List;
import simakademi.dao.KrsDAO;
import simakademi.model.Course;
import simakademi.model.KRS;

/**
 * Logika bisnis untuk input dan rekap nilai mahasiswa.
 */
public class KrsController {

    private final KrsDAO dao = new KrsDAO();

    public static String hitungGrade(double score) {
        if (score >= 85) return "A";
        if (score >= 70) return "B";
        if (score >= 55) return "C";
        if (score >= 40) return "D";
        return "E";
    }

    public void simpanNilai(String nim, Course course, double score,
            int semester, String tahunAjaran) throws Exception {
        validasiInput(nim, course, score, semester, tahunAjaran);
        dao.insert(new KRS(0, nim, course, score, semester, tahunAjaran));
    }

    public void ubahNilai(int id, String nim, Course course, double score,
            int semester, String tahunAjaran) throws Exception {
        validasiInput(nim, course, score, semester, tahunAjaran);
        if (!dao.isIdExists(id)) {
            throw new Exception("Data nilai dengan id " + id + " tidak ditemukan!");
        }
        dao.update(new KRS(id, nim, course, score, semester, tahunAjaran));
    }

    public void hapus(int id) {
        dao.delete(id);
    }

    public List<KRS> semua() {
        return dao.findAll();
    }

    public List<KRS> milik(String nim) {
        return dao.findByNim(nim);
    }

    public List<KRS> cari(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            return dao.findAll();
        }
        return dao.findByKeyword(keyword.trim());
    }

    private void validasiInput(String nim, Course course, double score,
            int semester, String tahunAjaran) throws Exception {
        if (nim == null || nim.trim().isEmpty())
            throw new Exception("Pilih mahasiswa terlebih dahulu!");
        if (course == null)
            throw new Exception("Pilih mata kuliah terlebih dahulu!");
        if (score < 0 || score > 100)
            throw new Exception("Nilai harus di antara 0 - 100!");
        if (semester <= 0 || semester > 14)
            throw new Exception("Semester tidak valid! (1-14)");
        if (tahunAjaran == null || tahunAjaran.trim().isEmpty())
            throw new Exception("Tahun ajaran tidak boleh kosong!");
        if (!tahunAjaran.trim().matches("\\d{4}/\\d{4}"))
            throw new Exception("Format tahun ajaran salah! Contoh: 2024/2025");
    }
}
