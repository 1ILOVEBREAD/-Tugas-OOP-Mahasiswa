package simakademi.view;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.table.DefaultTableModel;
import simakademi.controller.CourseController;
import simakademi.controller.KrsController;
import simakademi.controller.StudentController;
import simakademi.model.Course;
import simakademi.model.KRS;
import simakademi.model.Student;

/**
 * Panel input nilai mahasiswa.
 */
public class panelInputNilai extends JPanel {

    private final KrsController     krsController     = new KrsController();
    private DefaultTableModel modelTabel;
    private final StudentController studentController = new StudentController();
    private final CourseController  courseController  = new CourseController();

    // Pagination
    private int halamanSaat = 0;
    private final int BARIS_PER_HALAMAN = 10;
    private java.util.List<KRS> dataSekarang = new ArrayList<>();

    // Id KRS yang sedang dipilih di tabel (untuk Ubah)
    private int idTerpilih = -1;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBersihkan;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox cbMahasiswa;
    private javax.swing.JComboBox cbMataKuliah;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHalaman;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblMhs;
    private javax.swing.JLabel lblMk;
    private javax.swing.JLabel lblNilai;
    private javax.swing.JLabel lblSem;
    private javax.swing.JLabel lblTahun;
    private javax.swing.JPanel pnlKartuForm;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtNilai;
    private javax.swing.JTextField txtSemester;
    private javax.swing.JTextField txtTahunAjaran;
    // End of variables declaration//GEN-END:variables

   public panelInputNilai() {
    initComponents();
    customizeComponents();
    modelTabel = new DefaultTableModel();
    tabel.setModel(modelTabel);
    tampilkanData(krsController.cari(null));
}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblJudul = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        pnlKartuForm = new javax.swing.JPanel();
        lblMhs = new javax.swing.JLabel();
        cbMahasiswa = new javax.swing.JComboBox();
        lblMk = new javax.swing.JLabel();
        cbMataKuliah = new javax.swing.JComboBox();
        lblNilai = new javax.swing.JLabel();
        txtNilai = new javax.swing.JTextField();
        lblSem = new javax.swing.JLabel();
        txtSemester = new javax.swing.JTextField();
        lblTahun = new javax.swing.JLabel();
        txtTahunAjaran = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBersihkan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        btnPrev = new javax.swing.JButton();
        lblHalaman = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();

        setBackground(new java.awt.Color(244, 246, 250));

        lblJudul.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblJudul.setText("Input Nilai Mahasiswa");

        btnCari.setBackground(new java.awt.Color(33, 110, 196));
        btnCari.setForeground(new java.awt.Color(255, 255, 255));
        btnCari.setText("Cari");
        btnCari.setFocusPainted(false);
        btnCari.setOpaque(true);

        pnlKartuForm.setBackground(new java.awt.Color(255, 255, 255));

        lblMhs.setText("Mahasiswa");

        lblMk.setText("Mata Kuliah");

        lblNilai.setText("Nilai (0-100)");

        lblSem.setText("Semester");

        lblTahun.setText("Tahun Ajaran");

        txtTahunAjaran.setText("2024/2025");

        javax.swing.GroupLayout pnlKartuFormLayout = new javax.swing.GroupLayout(pnlKartuForm);
        pnlKartuForm.setLayout(pnlKartuFormLayout);
        pnlKartuFormLayout.setHorizontalGroup(
            pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKartuFormLayout.createSequentialGroup()
                .addGroup(pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMhs)
                    .addComponent(cbMahasiswa, 0, 209, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMk)
                    .addComponent(cbMataKuliah, 0, 209, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNilai)
                    .addComponent(txtNilai, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSem)
                    .addComponent(txtSemester, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTahun)
                    .addComponent(txtTahunAjaran, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))
        );
        pnlKartuFormLayout.setVerticalGroup(
            pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKartuFormLayout.createSequentialGroup()
                .addGroup(pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMhs)
                    .addComponent(lblMk)
                    .addComponent(lblNilai)
                    .addComponent(lblSem)
                    .addComponent(lblTahun))
                .addGap(4, 4, 4)
                .addGroup(pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMataKuliah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTahunAjaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnSimpan.setBackground(new java.awt.Color(33, 110, 196));
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Simpan Nilai");
        btnSimpan.setFocusPainted(false);
        btnSimpan.setOpaque(true);

        btnUbah.setBackground(new java.awt.Color(46, 160, 100));
        btnUbah.setForeground(new java.awt.Color(255, 255, 255));
        btnUbah.setText("Ubah");
        btnUbah.setFocusPainted(false);
        btnUbah.setOpaque(true);

        btnHapus.setForeground(new java.awt.Color(214, 69, 65));
        btnHapus.setText("Hapus Baris Terpilih");
        btnHapus.setFocusPainted(false);
        btnHapus.setOpaque(true);

        btnBersihkan.setForeground(new java.awt.Color(120, 130, 145));
        btnBersihkan.setText("Bersihkan");
        btnBersihkan.setFocusPainted(false);
        btnBersihkan.setOpaque(true);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "Mata Kuliah", "Nilai", "Grade", "Semester", "Tahun Ajaran", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabel);

        btnPrev.setBackground(new java.awt.Color(33, 110, 196));
        btnPrev.setForeground(new java.awt.Color(255, 255, 255));
        btnPrev.setText("< Prev");
        btnPrev.setFocusPainted(false);
        btnPrev.setOpaque(true);

        lblHalaman.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblHalaman.setForeground(new java.awt.Color(120, 130, 145));
        lblHalaman.setText("Halaman 1 / 1");

        btnNext.setBackground(new java.awt.Color(33, 110, 196));
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Next >");
        btnNext.setFocusPainted(false);
        btnNext.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlKartuForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnSimpan)
                        .addGap(6, 6, 6)
                        .addComponent(btnUbah)
                        .addGap(6, 6, 6)
                        .addComponent(btnHapus)
                        .addGap(6, 6, 6)
                        .addComponent(btnBersihkan)
                        .addGap(0, 280, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPrev)
                        .addGap(10, 10, 10)
                        .addComponent(lblHalaman)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext)
                        .addGap(60, 60, 60)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnCari)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(lblJudul)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblJudul)
                .addGap(13, 13, 13)
                .addComponent(pnlKartuForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus)
                    .addComponent(btnBersihkan))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPrev)
                        .addComponent(lblHalaman)
                        .addComponent(btnNext))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCari))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void customizeComponents() {
        // Styling warna/font sudah diatur lewat Design view (initComponents),
        // jadi di sini cukup pasang data & listener saja.

        for (Student s : studentController.cari(null)) cbMahasiswa.addItem(s);
        for (Course  c : courseController.cari(null))  cbMataKuliah.addItem(c);

        tabel.removeColumn(tabel.getColumnModel().getColumn(6)); // sembunyikan kolom ID
        UITheme.styleTable(tabel, 14, 22, 10, 8, 10, 14); // NIM, Mata Kuliah, Nilai, Grade, Semester, Tahun Ajaran
        tabel.getSelectionModel().addListSelectionListener(e -> isiFormDariBaris());

        txtCari.setFont(UITheme.FONT_LABEL);

        btnCari.addActionListener(evt -> tampilkanData(krsController.cari(txtCari.getText())));
        btnSimpan.addActionListener(evt -> simpan());
        btnUbah.addActionListener(evt -> ubah());
        btnHapus.addActionListener(evt -> hapus());
        btnBersihkan.addActionListener(evt -> bersihkanForm());
        btnPrev.addActionListener(evt -> {
            if (halamanSaat > 0) { halamanSaat--; refreshTabel(); }
        });
        btnNext.addActionListener(evt -> {
            int total = (int) Math.ceil((double) dataSekarang.size() / BARIS_PER_HALAMAN);
            if (halamanSaat < total - 1) { halamanSaat++; refreshTabel(); }
        });
    }

    /** Isi form dari baris tabel yang dipilih, termasuk simpan id-nya untuk keperluan Ubah. */
    private void isiFormDariBaris() {
        int row = tabel.getSelectedRow();
        if (row < 0) return;

        String nim = modelTabel.getValueAt(row, 0).toString();
        String namaMk = modelTabel.getValueAt(row, 1).toString();
        idTerpilih = (int) modelTabel.getValueAt(row, 6);

        pilihItemComboBox(cbMahasiswa, nim, true);
        pilihItemComboBox(cbMataKuliah, namaMk, false);

        txtNilai.setText(modelTabel.getValueAt(row, 2).toString());
        txtSemester.setText(modelTabel.getValueAt(row, 4).toString());
        txtTahunAjaran.setText(modelTabel.getValueAt(row, 5).toString());
    }

    /** Cari item di combo box berdasarkan NIM mahasiswa atau nama mata kuliah, lalu set sebagai terpilih. */
    private void pilihItemComboBox(JComboBox<?> combo, String kunci, boolean berdasarkanNim) {
        for (int i = 0; i < combo.getItemCount(); i++) {
            Object item = combo.getItemAt(i);
            if (berdasarkanNim && item instanceof Student) {
                if (((Student) item).getNim().equalsIgnoreCase(kunci)) {
                    combo.setSelectedIndex(i);
                    return;
                }
            } else if (!berdasarkanNim && item instanceof Course) {
                if (((Course) item).getCourseName().equalsIgnoreCase(kunci)) {
                    combo.setSelectedIndex(i);
                    return;
                }
            }
        }
    }

    private void simpan() {
        try {
            Student mahasiswa  = (Student) cbMahasiswa.getSelectedItem();
            Course  mataKuliah = (Course)  cbMataKuliah.getSelectedItem();
            double nilai   = ambilDesimal(txtNilai);
            int    semester = ambilAngka(txtSemester);
            krsController.simpanNilai(
                    mahasiswa != null ? mahasiswa.getNim() : null,
                    mataKuliah, nilai, semester, txtTahunAjaran.getText());
            tampilkanData(krsController.cari(null));
            bersihkanForm();
            info("Nilai berhasil disimpan.");
        } catch (Exception ex) { error(ex.getMessage()); }
    }

    private void ubah() {
        try {
            if (idTerpilih < 0) { error("Pilih baris pada tabel yang akan diubah!"); return; }
            Student mahasiswa  = (Student) cbMahasiswa.getSelectedItem();
            Course  mataKuliah = (Course)  cbMataKuliah.getSelectedItem();
            double nilai    = ambilDesimal(txtNilai);
            int    semester = ambilAngka(txtSemester);
            krsController.ubahNilai(idTerpilih,
                    mahasiswa != null ? mahasiswa.getNim() : null,
                    mataKuliah, nilai, semester, txtTahunAjaran.getText());
            tampilkanData(krsController.cari(null));
            info("Nilai berhasil diubah.");
        } catch (Exception ex) { error(ex.getMessage()); }
    }

    private void hapus() {
        int row = tabel.getSelectedRow();
        if (row < 0) { error("Pilih baris pada tabel yang akan dihapus!"); return; }
        int id = (int) modelTabel.getValueAt(row, 6);
        if (JOptionPane.showConfirmDialog(this, "Hapus nilai ini?", "Konfirmasi",
                JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) return;
        krsController.hapus(id);
        tampilkanData(krsController.cari(null));
        bersihkanForm();
    }

    private void bersihkanForm() {
        if (cbMahasiswa.getItemCount() > 0) cbMahasiswa.setSelectedIndex(0);
        if (cbMataKuliah.getItemCount() > 0) cbMataKuliah.setSelectedIndex(0);
        txtNilai.setText(""); txtSemester.setText("");
        txtTahunAjaran.setText("2024/2025");
        idTerpilih = -1;
        tabel.clearSelection();
    }

    private double ambilDesimal(JTextField f) throws Exception {
        try { return Double.parseDouble(f.getText().trim()); }
        catch (NumberFormatException e) { throw new Exception("Nilai harus berupa angka!"); }
    }

    private int ambilAngka(JTextField f) throws Exception {
        try { return Integer.parseInt(f.getText().trim()); }
        catch (NumberFormatException e) { throw new Exception("Semester harus berupa angka!"); }
    }

    private void tampilkanData(java.util.List<KRS> data) {
    if (modelTabel == null) {
        System.err.println("❌ modelTabel is null!");
        return;
    }
    this.dataSekarang = data;
    this.halamanSaat = 0;
    refreshTabel();
}

   private void refreshTabel() {
    if (modelTabel == null) {
        System.err.println("❌ modelTabel is null in refreshTabel!");
        return;
    }
    modelTabel.setRowCount(0);
    int dari = halamanSaat * BARIS_PER_HALAMAN;
    int sampai = Math.min(dari + BARIS_PER_HALAMAN, dataSekarang.size());
    for (int i = dari; i < sampai; i++) {
        KRS k = dataSekarang.get(i);
        modelTabel.addRow(new Object[]{
            k.getNim(), 
            k.getCourse().getCourseName(), 
            k.getScore(),
            k.getGrade(), 
            k.getSemester(), 
            k.getTahunAjaran(), 
            k.getId()
        });
    }
    int totalHalaman = (int) Math.ceil((double) dataSekarang.size() / BARIS_PER_HALAMAN);
    lblHalaman.setText("Halaman " + (halamanSaat + 1) + " / " + Math.max(totalHalaman, 1));
}

    private void info(String p)  { JOptionPane.showMessageDialog(this, p, "Berhasil", JOptionPane.INFORMATION_MESSAGE); }
    private void error(String p) { JOptionPane.showMessageDialog(this, p, "Gagal",    JOptionPane.ERROR_MESSAGE); }
}
