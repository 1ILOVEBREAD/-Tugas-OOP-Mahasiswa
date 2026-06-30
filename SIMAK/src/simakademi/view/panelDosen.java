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
import simakademi.controller.LecturerController;
import simakademi.model.Lecturer;

/**
 * Panel pengelolaan data Dosen.
 */
public class panelDosen extends JPanel {

    private final LecturerController controller = new LecturerController();
    private DefaultTableModel modelTabel;

    // Pagination
    private int halamanSaat = 0;
    private final int BARIS_PER_HALAMAN = 10;
    private java.util.List<Lecturer> dataSekarang = new ArrayList<>();

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
    private javax.swing.JLabel lblHp;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblKeahlian;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNidn;
    private javax.swing.JPanel pnlKartuForm;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtHp;
    private javax.swing.JTextField txtKeahlian;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNidn;
    // End of variables declaration//GEN-END:variables

    public panelDosen() {
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
        lblNidn = new javax.swing.JLabel();
        txtNidn = new javax.swing.JTextField();
        lblNama = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        lblKeahlian = new javax.swing.JLabel();
        txtKeahlian = new javax.swing.JTextField();
        lblHp = new javax.swing.JLabel();
        txtHp = new javax.swing.JTextField();
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
        lblJudul.setText("Data Dosen");

        btnCari.setBackground(new java.awt.Color(33, 110, 196));
        btnCari.setForeground(new java.awt.Color(255, 255, 255));
        btnCari.setText("Cari");
        btnCari.setFocusPainted(false);
        btnCari.setOpaque(true);

        pnlKartuForm.setBackground(new java.awt.Color(255, 255, 255));

        lblNidn.setText("NIDN");

        lblNama.setText("Nama");

        lblKeahlian.setText("Bidang Keahlian");

        lblHp.setText("No. HP");

        javax.swing.GroupLayout pnlKartuFormLayout = new javax.swing.GroupLayout(pnlKartuForm);
        pnlKartuForm.setLayout(pnlKartuFormLayout);
        pnlKartuFormLayout.setHorizontalGroup(
            pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKartuFormLayout.createSequentialGroup()
                .addGroup(pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNidn)
                    .addComponent(txtNidn, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNama)
                    .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKeahlian)
                    .addComponent(txtKeahlian, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHp)
                    .addComponent(txtHp, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
        );
        pnlKartuFormLayout.setVerticalGroup(
            pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKartuFormLayout.createSequentialGroup()
                .addGroup(pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNidn)
                    .addComponent(lblNama)
                    .addComponent(lblKeahlian)
                    .addComponent(lblHp))
                .addGap(4, 4, 4)
                .addGroup(pnlKartuFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNidn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKeahlian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                "NIDN", "Nama", "Bidang Keahlian", "No. HP"
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(lblJudul)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnPrev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHalaman)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCari)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBersihkan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUbah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTambah)
                        .addGap(197, 197, 197))))
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
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPrev)
                        .addComponent(lblHalaman)
                        .addComponent(btnNext))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCari)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void customizeComponents() {
        // Styling warna/font sudah diatur lewat Design view (initComponents),
        // jadi di sini cukup pasang listener & logic saja.

        UITheme.styleTable(tabel, 18, 26, 30, 18); // NIDN, Nama, Bidang Keahlian, No. HP
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
        txtNidn.setText(modelTabel.getValueAt(row, 0).toString());
        txtNama.setText(modelTabel.getValueAt(row, 1).toString());
        txtKeahlian.setText(modelTabel.getValueAt(row, 2).toString());
        txtHp.setText(modelTabel.getValueAt(row, 3).toString());
    }

    private void tambah() {
        try {
            controller.tambah(txtNidn.getText(), txtNama.getText(), txtKeahlian.getText(), txtHp.getText());
            tampilkanData(controller.cari(null)); bersihkanForm(); info("Data dosen berhasil ditambahkan.");
        } catch (Exception ex) { error(ex.getMessage()); }
    }

    private void ubah() {
        try {
            controller.update(txtNidn.getText(), txtNama.getText(), txtKeahlian.getText(), txtHp.getText());
            tampilkanData(controller.cari(null)); info("Data dosen berhasil diubah.");
        } catch (Exception ex) { error(ex.getMessage()); }
    }

    private void hapus() {
        try {
            if (txtNidn.getText().trim().isEmpty()) { error("Pilih data pada tabel terlebih dahulu!"); return; }
            if (JOptionPane.showConfirmDialog(this, "Hapus dosen ini?", "Konfirmasi",
                    JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) return;
            controller.hapus(txtNidn.getText());
            tampilkanData(controller.cari(null)); bersihkanForm(); info("Data dosen berhasil dihapus.");
        } catch (Exception ex) { error(ex.getMessage()); }
    }

    private void bersihkanForm() {
        txtNidn.setText(""); txtNama.setText(""); txtKeahlian.setText(""); txtHp.setText("");
        tabel.clearSelection();
    }

    private void tampilkanData(java.util.List<Lecturer> data) {
        this.dataSekarang = data;
        this.halamanSaat = 0;
        refreshTabel();
    }

    private void refreshTabel() {
        modelTabel.setRowCount(0);
        int dari = halamanSaat * BARIS_PER_HALAMAN;
        int sampai = Math.min(dari + BARIS_PER_HALAMAN, dataSekarang.size());
        for (int i = dari; i < sampai; i++) {
            Lecturer l = dataSekarang.get(i);
            modelTabel.addRow(new Object[]{l.getNidn(), l.getName(), l.getExpertise(), l.getNoHp()});
        }
        int totalHalaman = (int) Math.ceil((double) dataSekarang.size() / BARIS_PER_HALAMAN);
        lblHalaman.setText("Halaman " + (halamanSaat + 1) + " / " + Math.max(totalHalaman, 1));
    }

    private void info(String p)  { JOptionPane.showMessageDialog(this, p, "Berhasil", JOptionPane.INFORMATION_MESSAGE); }
    private void error(String p) { JOptionPane.showMessageDialog(this, p, "Gagal",    JOptionPane.ERROR_MESSAGE); }
}
