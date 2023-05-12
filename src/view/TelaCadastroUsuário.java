package view;

import javax.swing.JOptionPane;
import java.sql.*;
import dbc.ModuloConexao;
import java.awt.HeadlessException;

public class TelaCadastroUsuário extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaCadastroUsuário() {
        initComponents();
        conexao = ModuloConexao.conector();
        System.out.println(conexao);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        txtRa = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        txtLogin = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRa.setBackground(java.awt.Color.lightGray);
        getContentPane().add(txtRa, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 100, -1));

        txtNome.setBackground(java.awt.Color.lightGray);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 100, -1));

        txtEmail.setBackground(java.awt.Color.lightGray);
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 100, -1));

        txtSenha.setBackground(java.awt.Color.lightGray);
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 110, 30));

        jButton1.setFont(new java.awt.Font("Showcard Gothic", 2, 24)); // NOI18N
        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 530, 230, 60));

        txtLogin.setBackground(java.awt.Color.lightGray);
        getContentPane().add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 110, 30));

        jButton2.setFont(new java.awt.Font("Showcard Gothic", 2, 24)); // NOI18N
        jButton2.setText("Voltar Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 620, 230, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/9d1de68b7250448032eca19e9e640cd6.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
         //Cadastro//
        try {
            String sql = "insert into Usuários(loginUsuário, senhaUsuário, nomeUsuário, raUsuário, emailUsuário)VALUES(?,?,?,?,?)";
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtLogin.getText());
            pst.setString(2, txtSenha.getText());
            pst.setString(3, txtNome.getText());
            pst.setString(4, txtRa.getText());
            pst.setString(5, txtEmail.getText());

            pst.executeUpdate();

            TelaPrincipal principal = new TelaPrincipal();
            principal.setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuário().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRa;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
