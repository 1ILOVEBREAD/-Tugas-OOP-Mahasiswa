package simakademi.view;

import java.util.ArrayList;
import java.awt.Dimension;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.table.DefaultTableModel;
import simakademi.controller.CourseController;
import simakademi.model.Course;

/**
 * Panel pengelolaan data Mata Kuliah.
 */
public class panelMataKuliah extends JPanel {

    private final CourseController controller = new CourseController();
    private DefaultTableModel modelTabel;

    // Pagination
    private int halamanSaat = 0;
    private final int BARIS_PER_HALAMAN = 10;
    private java.util.List<Course> dataSekarang = new ArrayList<>();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBersihkan;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHalaman;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblKode;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblSemester;
    private javax.swing.JLabel lblSks;
    private javax.swing.JPanel pnlKartuForm;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtSemester;
    private javax.swing.JTextField txtSks;
    // End of variables declaration//GEN-END:variables

    public panelMataKuliah() {
        initComponents();
        customizeComponents();
        tampilkanData(controller.cari(null));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblJudul = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        pnlKartuForm = new javax.swing.JPanel();
        lblKode = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        lblNama = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        lblSks = new javax.swing.JLabel();
        txtSks = new javax.swing.JTextField();
        lblSemester = new javax.swing.JLabel();
        txtSemester = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
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
        lblJudul.setText("Data Mata Kuliah");

        btnCari.setBackground(new java.awt.Color(33, 110, 196));
        btnCari.setForeground(new java.awt.Color(255, 255, 255));
        btnCari.setText("Cari");
        btnCari.setFocusPainted(false);
        btnCari.setOpaque(true);

        pnlKartuForm.setBackground(new java.awt.Color(255, 255, 255));

        lblKode.setText("Kode");

        lblNama.setText("Nama Mata Kuliah");

        lblSks.setText("SKS");

        lblSemester.setText("Semester");

        javax.swing.GroupLayout pnlKartuFormLayout = new javax.swing.GroupLayout(pnlKartuForm);
        pnlKartuForm.setLayout(pnlKartuFormLayout);
        pnlKartuFormLayout.setHorizontalGroup(
            pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKartuFormLayout.createSequentialGroup()
                .addGroup(pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKode)
                    .addComponent(txtKode, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNama)
                    .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSks)
                    .addComponent(txtSks, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSemester)
                    .addComponent(txtSemester, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)))
        );
        pnlKartuFormLayout.setVerticalGroup(
            pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKartuFormLayout.createSequentialGroup()
                .addGroup(pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKode)
                    .addComponent(lblNama)
                    .addComponent(lblSks)
                    .addComponent(lblSemester))
                .addGap(4, 4, 4)
                .addGroup(pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        btnBersihkan.setForeground(new java.awt.Color(120, 130, 145));
        btnBersihkan.setText("Bersihkan");
        btnBersihkan.setFocusPainted(false);
        btnBersihkan.setOpaque(true);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode", "Nama Mata Kuliah", "SKS", "Semester"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabel);
        modelTabel = (DefaultTableModel) tabel.getModel();

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblJudul)
                        .addGap(282, 282, 282))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnPrev)
                        .addGap(10, 10, 10)
                        .addComponent(lblHalaman)
                        .addGap(10, 10, 10)
                        .addComponent(btnNext)
                        .addGap(18, 18, 18)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(btnCari))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTambah)
                .addGap(6, 6, 6)
                .addComponent(btnUbah)
                .addGap(6, 6, 6)
                .addComponent(btnHapus)
                .addGap(6, 6, 6)
                .addComponent(btnBersihkan)
                .addGap(208, 208, 208))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btnTambah)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus)
                    .addComponent(btnBersihkan))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrev)
                    .addComponent(lblHalaman)
                    .addComponent(btnNext)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void customizeComponents() {
        // Styling warna/font sudah diatur lewat Design view (initComponents),
        // jadi di sini cukup pasang listener & logic saja.

        UITheme.styleTable(tabel, 16, 38, 12, 16); // Kode, Nama Mata Kuliah, SKS, Semester
        tabel.getSelectionModel().addListSelectionListener(e -> isiFormDariBaris());
        txtCari.setFont(UITheme.FONT_LABEL);

        btnCari.addActionListener(evt -> tampilkanData(controller.cari(txtCari.getText())));
        btnTambah.addActionListener(evt -> tambah());
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

    private void isiFormDariBaris() {
        int row = tabel.getSelectedRow();
        if (row < 0) return;
        txtKode.setText(modelTabel.getValueAt(row, 0).toString());
        txtNama.setText(modelTabel.getValueAt(row, 1).toString());
        txtSks.setText(modelTabel.getValueAt(row, 2).toString());
        txtSemester.setText(modelTabel.getValueAt(row, 3).toString());
    }

    private void tambah() {
        try {
            controller.tambah(txtKode.getText(), txtNama.getText(), ambilAngka(txtSks), ambilAngka(txtSemester));
            tampilkanData(controller.cari(null)); bersihkanForm(); info("Mata kuliah berhasil ditambahkan.");
        } catch (Exception ex) { error(ex.getMessage()); }
    }

    private void ubah() {
        try {
            controller.update(txtKode.getText(), txtNama.getText(), ambilAngka(txtSks), ambilAngka(txtSemester));
            tampilkanData(controller.cari(null)); info("Mata kuliah berhasil diubah.");
        } catch (Exception ex) { error(ex.getMessage()); }
    }

    private void hapus() {
        try {
            if (txtKode.getText().trim().isEmpty()) { error("Pilih data pada tabel terlebih dahulu!"); return; }
            if (JOptionPane.showConfirmDialog(this, "Hapus mata kuliah ini?", "Konfirmasi",
                    JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) return;
            controller.hapus(txtKode.getText());
            tampilkanData(controller.cari(null)); bersihkanForm(); info("Mata kuliah berhasil dihapus.");
        } catch (Exception ex) { error(ex.getMessage()); }
    }

    private int ambilAngka(JTextField f) throws Exception {
        try { return Integer.parseInt(f.getText().trim()); }
        catch (NumberFormatException e) { throw new Exception("SKS dan Semester harus berupa angka!"); }
    }

    private void bersihkanForm() {
        txtKode.setText(""); txtNama.setText(""); txtSks.setText(""); txtSemester.setText("");
        tabel.clearSelection();
    }

    private void tampilkanData(java.util.List<Course> data) {
        this.dataSekarang = data;
        this.halamanSaat = 0;
        refreshTabel();
    }

    private void refreshTabel() {
        modelTabel.setRowCount(0);
        int dari = halamanSaat * BARIS_PER_HALAMAN;
        int sampai = Math.min(dari + BARIS_PER_HALAMAN, dataSekarang.size());
        for (int i = dari; i < sampai; i++) {
            Course c = dataSekarang.get(i);
            modelTabel.addRow(new Object[]{c.getCode(), c.getCourseName(), c.getSKS(), c.getSemester()});
        }
        int totalHalaman = (int) Math.ceil((double) dataSekarang.size() / BARIS_PER_HALAMAN);
        lblHalaman.setText("Halaman " + (halamanSaat + 1) + " / " + Math.max(totalHalaman, 1));
    }

    private void info(String p)  { JOptionPane.showMessageDialog(this, p, "Berhasil", JOptionPane.INFORMATION_MESSAGE); }
    private void error(String p) { JOptionPane.showMessageDialog(this, p, "Gagal",    JOptionPane.ERROR_MESSAGE); }
}
