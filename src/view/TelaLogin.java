package view;

import javax.swing.JOptionPane;
import java.sql.*;
import dbc.ModuloConexao;
import javax.swing.JTextField;

public class TelaLogin extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String loginpontuação;
    TelaLogin dados;

    String txtLogin3;
    

    public void logar() {
       //Método Logar//
        
        String sql = "select * from usuários where loginUsuário=? and senhaUsuário=?";
        try {
            
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtLogin2.getText());
            pst.setString(2, txtSenha2.getText());   
            rs = pst.executeQuery();      
            if (rs.next()) {
                
                
                TelaPrincipal principal = new TelaPrincipal();
                principal.setVisible(true);
                TelaLogin login = new TelaLogin();
                login.setVisible(false);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario e/ou senha incorreto(s)");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

 

    public TelaLogin() {
    

        initComponents();
        conexao = ModuloConexao.conector();
        System.out.println(conexao);
        
 

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtLogin2 = new javax.swing.JTextField();
        txtSenha2 = new javax.swing.JPasswordField();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Nome do Jogo");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtLogin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLogin2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtLogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 610, 230, 30));

        txtSenha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenha2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 730, 230, 30));

        jButton6.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jButton6.setText("Registrar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 790, 80, 30));

        jButton5.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jButton5.setText("Entrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 660, 100, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aaaa.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(1539, 953));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TelaCadastroUsuário cadastro = new TelaCadastroUsuário();
        cadastro.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        logar();
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtSenha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenha2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenha2ActionPerformed

    private void txtLogin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLogin2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLogin2ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JTextField txtLogin2;
    private javax.swing.JPasswordField txtSenha2;
    // End of variables declaration//GEN-END:variables

   

    String txtLogin3() {
        return txtLogin3;
    }

}
