package nilaimahasiswa;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import nilaimahasiswa.view.LoginForm;

/**
 * Kelas utama untuk menjalankan aplikasi Sistem Informasi Nilai Mahasiswa.
 *
 * @author Yogi Apriana
 */
public class NilaiMahasiswa {

    public static void main(String[] args) {
        try {
            // Metal / cross-platform L&F dipakai (bukan System L&F) karena
            // Metal menghormati JButton.setBackground() / setForeground()
            // apa adanya. System L&F (terutama Windows) mengabaikan warna
            // kustom pada JButton kecuali UI tombol di-override manual,
            // sehingga tampilan saat Run bisa beda dari tab Design NetBeans.
            // (Nimbus TIDAK dipakai karena Nimbus juga sering mengabaikan
            // setBackground pada JButton.)
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception ex) {
            // Jika gagal, gunakan tampilan default Swing.
        }
        SwingUtilities.invokeLater(() -> new LoginForm().setVisible(true));
    }
}
