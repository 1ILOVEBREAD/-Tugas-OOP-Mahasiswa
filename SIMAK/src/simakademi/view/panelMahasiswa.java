package simakademi.view;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import simakademi.controller.StudentController;
import simakademi.model.Student;

public class panelMahasiswa extends JPanel {

    private final StudentController controller = new StudentController();
    private DefaultTableModel modelTabel;
    private int halamanSaat = 0;
    private final int BARIS_PER_HALAMAN = 10;
    private java.util.List<Student> dataSekarang = new ArrayList<>();

    // Variables declaration
    private javax.swing.JButton btnBersihkan;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnNext1;
    private javax.swing.JButton btnPrev1;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAngkatan;
    private javax.swing.JLabel lblHalaman1;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNim;
    private javax.swing.JLabel lblProdi;
    private javax.swing.JPanel pnlKartuForm;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField txtAngkatan;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNim;
    private javax.swing.JTextField txtProdi;
    // End of variables declaration

    public panelMahasiswa() {
    initComponents();
    customizeComponents();
    System.out.println("🔧 panelMahasiswa constructor called");
    modelTabel = new DefaultTableModel();
    modelTabel = new DefaultTableModel();
    modelTabel.setColumnIdentifiers(new String[]{"NIM", "Nama", "Program Studi", "Angkatan"});
    tabel.setModel(modelTabel);
    tabel.setModel(modelTabel);
    tabel.revalidate();
    tabel.repaint();
    System.out.println("📊 Calling tampilkanData...");
    tampilkanData(controller.cari(null));
}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        lblJudul = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        pnlKartuForm = new javax.swing.JPanel();
        lblNim = new javax.swing.JLabel();
        txtNim = new javax.swing.JTextField();
        lblNama = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        lblProdi = new javax.swing.JLabel();
        txtProdi = new javax.swing.JTextField();
        lblAngkatan = new javax.swing.JLabel();
        txtAngkatan = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBersihkan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        btnPrev1 = new javax.swing.JButton();
        lblHalaman1 = new javax.swing.JLabel();
        btnNext1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(244, 246, 250));

        lblJudul.setFont(new java.awt.Font("Segoe UI", 1, 20));
        lblJudul.setText("Data Mahasiswa");

        btnCari.setBackground(new java.awt.Color(33, 110, 196));
        btnCari.setForeground(new java.awt.Color(255, 255, 255));
        btnCari.setText("Cari");
        btnCari.setFocusPainted(false);
        btnCari.setOpaque(true);

        pnlKartuForm.setBackground(new java.awt.Color(255, 255, 255));
        lblNim.setText("NIM");
        lblNama.setText("Nama");
        lblProdi.setText("Program Studi");
        lblAngkatan.setText("Angkatan");

        javax.swing.GroupLayout pnlKartuFormLayout = new javax.swing.GroupLayout(pnlKartuForm);
        pnlKartuForm.setLayout(pnlKartuFormLayout);
        pnlKartuFormLayout.setHorizontalGroup(
            pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKartuFormLayout.createSequentialGroup()
                .addGroup(pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNim)
                    .addComponent(txtNim, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNama)
                    .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProdi)
                    .addComponent(txtProdi, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAngkatan)
                    .addComponent(txtAngkatan, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
        );
        pnlKartuFormLayout.setVerticalGroup(
            pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKartuFormLayout.createSequentialGroup()
                .addGroup(pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNim)
                    .addComponent(lblNama)
                    .addComponent(lblProdi)
                    .addComponent(lblAngkatan))
                .addGap(4, 4, 4)
                .addGroup(pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAngkatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnTambah.setBackground(new java.awt.Color(33, 110, 196));
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("Tambah");
        btnTambah.setFocusPainted(false);
        btnTambah.setOpaque(true);

        btnUbah.setBackground(new java.awt.Color(46, 160, 100));
        btnUbah.setForeground(new java.awt.Color(255, 255, 255));
        btnUbah.setText("Ubah");
        btnUbah.setFocusPainted(false);
        btnUbah.setOpaque(true);

        btnHapus.setBackground(new java.awt.Color(214, 69, 65));
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.setFocusPainted(false);
        btnHapus.setOpaque(true);

        btnBersihkan.setText("Bersihkan");

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"NIM", "Nama", "Program Studi", "Angkatan"}
        ));
        tabel.setGridColor(new java.awt.Color(224, 224, 224));
        jScrollPane1.setViewportView(tabel);

        btnPrev1.setBackground(new java.awt.Color(33, 110, 196));
        btnPrev1.setForeground(new java.awt.Color(255, 255, 255));
        btnPrev1.setText("< Prev");
        btnPrev1.setFocusPainted(false);
        btnPrev1.setOpaque(true);

        lblHalaman1.setFont(new java.awt.Font("Segoe UI", 0, 12));
        lblHalaman1.setForeground(new java.awt.Color(120, 130, 145));
        lblHalaman1.setText("Halaman 1 / 1");

        btnNext1.setBackground(new java.awt.Color(33, 110, 196));
        btnNext1.setForeground(new java.awt.Color(255, 255, 255));
        btnNext1.setText("Next >");
        btnNext1.setFocusPainted(false);
        btnNext1.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlKartuForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTambah)
                        .addGap(6, 6, 6)
                        .addComponent(btnUbah)
                        .addGap(6, 6, 6)
                        .addComponent(btnHapus)
                        .addGap(6, 6, 6)
                        .addComponent(btnBersihkan)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPrev1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHalaman1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext1)
                        .addGap(81, 81, 81)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnCari)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(lblJudul)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblJudul)
                .addGap(18, 18, 18)
                .addComponent(pnlKartuForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus)
                    .addComponent(btnBersihkan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCari))
                    .addComponent(btnNext1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHalaman1)
                        .addComponent(btnPrev1)))
                .addContainerGap())
        );
    }// </editor-fold>

    private void customizeComponents() {
    System.out.println("🔧 customizeComponents called");
    tabel.getSelectionModel().addListSelectionListener(e -> {
        if (!e.getValueIsAdjusting()) {
            int row = tabel.getSelectedRow();
            if (row >= 0) {
                txtNim.setText(modelTabel.getValueAt(row, 0).toString());
                txtNama.setText(modelTabel.getValueAt(row, 1).toString());
                txtProdi.setText(modelTabel.getValueAt(row, 2).toString());
                txtAngkatan.setText(modelTabel.getValueAt(row, 3).toString());
            }
        }
    });
    
    btnCari.addActionListener(evt -> {
        System.out.println("🔍 Search clicked: " + txtCari.getText());
        tampilkanData(controller.cari(txtCari.getText()));
    });
    btnTambah.addActionListener(evt -> tambah());
    btnUbah.addActionListener(evt -> ubah());
    btnHapus.addActionListener(evt -> hapus());
    btnBersihkan.addActionListener(evt -> bersihkanForm());
    btnPrev1.addActionListener(evt -> {
        if (halamanSaat > 0) { halamanSaat--; refreshTabel(); }
    });
    btnNext1.addActionListener(evt -> {
        int total = (int) Math.ceil((double) dataSekarang.size() / BARIS_PER_HALAMAN);
        if (halamanSaat < total - 1) { halamanSaat++; refreshTabel(); }
    });
}
    private void tambah() {
        try {
            System.out.println("➕ Adding student: " + txtNim.getText());
            controller.tambah(txtNim.getText(), txtNama.getText(), txtProdi.getText(), txtAngkatan.getText());
            tampilkanData(controller.cari(null));
            bersihkanForm();
            JOptionPane.showMessageDialog(this, "Data mahasiswa berhasil ditambahkan.", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void ubah() {
        try {
            controller.update(txtNim.getText(), txtNama.getText(), txtProdi.getText(), txtAngkatan.getText());
            tampilkanData(controller.cari(null));
            JOptionPane.showMessageDialog(this, "Data mahasiswa berhasil diubah.", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void hapus() {
    try {
        // Get selected row from table
        int selectedRow = tabel.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Pilih data pada tabel terlebih dahulu!", "Gagal", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Get NIM from the selected row
        String nim = modelTabel.getValueAt(selectedRow, 0).toString();
        
        // Confirm deletion
        if (JOptionPane.showConfirmDialog(this, "Hapus mahasiswa dengan NIM " + nim + "?", "Konfirmasi",
                JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) return;
        
        // Delete
        controller.hapus(nim);
        tampilkanData(controller.cari(null));
        bersihkanForm();
        JOptionPane.showMessageDialog(this, "Data mahasiswa berhasil dihapus.", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, ex.getMessage(), "Gagal", JOptionPane.ERROR_MESSAGE);
    }
}

    private void bersihkanForm() {
        txtNim.setText("");
        txtNama.setText("");
        txtProdi.setText("");
        txtAngkatan.setText("");
        tabel.clearSelection();
    }

    private void tampilkanData(java.util.List<Student> data) {
        System.out.println("📊 tampilkanData called with " + data.size() + " records");
        this.dataSekarang = data;
        this.halamanSaat = 0;
        refreshTabel();
    }

    private void refreshTabel() {
    System.out.println("🔄 refreshTabel called, data size: " + dataSekarang.size());
    if (modelTabel == null) {
        System.err.println("❌ modelTabel is NULL!");
        return;
    }
    modelTabel.setRowCount(0);
    for (Student s : dataSekarang) {
        System.out.println("  ➕ Adding row: " + s.getNim() + " - " + s.getName());
        modelTabel.addRow(new Object[]{
            s.getNim(),
            s.getName(),
            s.getStudyProgram(),
            s.getAngkatan()
        });
    }
    int totalHalaman = (int) Math.ceil((double) dataSekarang.size() / BARIS_PER_HALAMAN);
    lblHalaman1.setText("Halaman " + (halamanSaat + 1) + " / " + Math.max(totalHalaman, 1));
    System.out.println("✅ refreshTabel complete, rows in table: " + modelTabel.getRowCount());
    
    tabel.setModel(modelTabel);
    tabel.revalidate();
    tabel.repaint();
}
}
