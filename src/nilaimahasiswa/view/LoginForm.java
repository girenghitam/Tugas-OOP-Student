package nilaimahasiswa.view;

import nilaimahasiswa.controller.UserController;
import nilaimahasiswa.model.User;

public class LoginForm extends javax.swing.JFrame {

    private final UserController userController = new UserController();

    public LoginForm() {
        initComponents();
        getRootPane().setDefaultButton(btnLogin);
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBranding = new javax.swing.JPanel();
        lblIkon = new javax.swing.JLabel();
        lblJudul = new javax.swing.JLabel();
        lblSub = new javax.swing.JLabel();
        pnlForm = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblCaption = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblPesan = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        pnlKartu = new javax.swing.JPanel();
        lblHint = new javax.swing.JLabel();
        lblFooter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - Sistem Nilai Mahasiswa");
        setMinimumSize(new java.awt.Dimension(420, 580));
        setResizable(false);

        pnlBranding.setBackground(new java.awt.Color(45, 60, 50));
        pnlBranding.setPreferredSize(new java.awt.Dimension(420, 160));

        lblIkon.setFont(new java.awt.Font("Segoe UI Emoji", 0, 42)); // NOI18N
        lblIkon.setForeground(new java.awt.Color(255, 255, 255));
        lblIkon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblJudul.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblJudul.setForeground(new java.awt.Color(255, 255, 255));
        lblJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJudul.setText("SIAKAD");

        lblSub.setForeground(new java.awt.Color(195, 210, 195));
        lblSub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSub.setText("Kelola akademik mahasiswa dengan mudah");

        javax.swing.GroupLayout pnlBrandingLayout = new javax.swing.GroupLayout(pnlBranding);
        pnlBranding.setLayout(pnlBrandingLayout);
        pnlBrandingLayout.setHorizontalGroup(
            pnlBrandingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIkon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlBrandingLayout.setVerticalGroup(
            pnlBrandingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBrandingLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblIkon)
                .addGap(6, 6, 6)
                .addComponent(lblJudul)
                .addGap(4, 4, 4)
                .addComponent(lblSub)
                .addGap(24, 24, 24))
        );

        getContentPane().add(pnlBranding, java.awt.BorderLayout.NORTH);

        pnlForm.setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(20, 40, 35));
        lblTitle.setText("Masuk ke Akun");

        lblCaption.setForeground(new java.awt.Color(80, 110, 85));
        lblCaption.setText("Silakan masukkan username dan password Anda");

        lblUser.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblUser.setText("Username");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        lblPass.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblPass.setText("Password");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        lblPesan.setForeground(new java.awt.Color(214, 69, 65));
        lblPesan.setText(" ");

        btnLogin.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        btnLogin.setBackground(new java.awt.Color(80, 110, 85));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("MASUK");
        btnLogin.setFocusPainted(false);
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(true);
        btnLogin.setOpaque(true);
        btnLogin.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        pnlKartu.setBackground(new java.awt.Color(245, 246, 243));

        lblHint.setForeground(new java.awt.Color(100, 130, 120));
        lblHint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHint.setText("<html><center>Akun contoh: admin / admin1234<br>atau dosen / dosen1234</center></html>");

        javax.swing.GroupLayout pnlKartuLayout = new javax.swing.GroupLayout(pnlKartu);
        pnlKartu.setLayout(pnlKartuLayout);
        pnlKartuLayout.setHorizontalGroup(
            pnlKartuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHint, javax.swing.GroupLayout.PREFERRED_SIZE, 348, Short.MAX_VALUE)
        );
        pnlKartuLayout.setVerticalGroup(
            pnlKartuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKartuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        lblFooter.setForeground(new java.awt.Color(80, 110, 85));
        lblFooter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFooter.setText("Dibuat oleh Yogi Apriana");

        javax.swing.GroupLayout pnlFormLayout = new javax.swing.GroupLayout(pnlForm);
        pnlForm.setLayout(pnlFormLayout);
        pnlFormLayout.setHorizontalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addComponent(lblCaption)
                    .addComponent(lblUser)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPass)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPesan)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlKartu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        pnlFormLayout.setVerticalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitle)
                .addGap(4, 4, 4)
                .addComponent(lblCaption)
                .addGap(20, 20, 20)
                .addComponent(lblUser)
                .addGap(6, 6, 6)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(lblPass)
                .addGap(6, 6, 6)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lblPesan)
                .addGap(8, 8, 8)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(pnlKartu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(lblFooter)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        getContentPane().add(pnlForm, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        prosesLogin();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void prosesLogin() {
        String username = txtUsername.getText().trim();
        String password = new String(txtPassword.getPassword());

        if (username.isEmpty() || password.isEmpty()) {
            lblPesan.setForeground(new java.awt.Color(214, 69, 65));
            lblPesan.setText("Username dan password wajib diisi!");
            return;
        }

        User user = userController.login(username, password);
        if (user == null) {
            lblPesan.setForeground(new java.awt.Color(214, 69, 65));
            lblPesan.setText("Username atau password salah!");
            return;
        }

        lblPesan.setText(" ");
        dispose();
        java.awt.EventQueue.invokeLater(() -> new Dashboard(user).setVisible(true));
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new LoginForm().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblCaption;
    private javax.swing.JLabel lblFooter;
    private javax.swing.JLabel lblHint;
    private javax.swing.JLabel lblIkon;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblPesan;
    private javax.swing.JLabel lblSub;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlBranding;
    private javax.swing.JPanel pnlForm;
    private javax.swing.JPanel pnlKartu;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
