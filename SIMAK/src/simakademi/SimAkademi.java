package simakademi;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import simakademi.view.LoginForm;

/*
 * Kelas utama untuk menjalankan aplikasi Sistem Informasi Nilai Mahasiswa.
 */
public class SimAkademi {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            // Jika gagal, gunakan tampilan default Swing.
        }
        SwingUtilities.invokeLater(() -> new LoginForm().setVisible(true));
    }
}
