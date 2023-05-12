
package view;

import java.sql.*;
import dbc.ModuloConexao;
import static javax.management.Query.or;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;


public class AdicionarPergunta extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    

    public AdicionarPergunta() {
        initComponents();
        conexao = ModuloConexao.conector();
        System.out.println(conexao);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPergunta = new javax.swing.JTextField();
        txtAlternativaA = new javax.swing.JTextField();
        txtAlternativaB = new javax.swing.JTextField();
        txtAlternativaC = new javax.swing.JTextField();
        txtAlternativaD = new javax.swing.JTextField();
        txtAlternativaCorreta = new javax.swing.JTextField();
        txtEscolhaLinguagem = new javax.swing.JTextField();
        txtEscolhaDificuldade = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerguntaActionPerformed(evt);
            }
        });
        getContentPane().add(txtPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 320, -1));
        getContentPane().add(txtAlternativaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 320, -1));
        getContentPane().add(txtAlternativaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 320, -1));
        getContentPane().add(txtAlternativaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 320, -1));
        getContentPane().add(txtAlternativaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 320, -1));

        txtAlternativaCorreta.setText("A ou B ou C ou D");
        getContentPane().add(txtAlternativaCorreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 620, 220, 30));
        getContentPane().add(txtEscolhaLinguagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 890, 120, -1));
        getContentPane().add(txtEscolhaDificuldade, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 880, 120, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Criar Pergunta");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 110, 580, 250));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Voltar Menu");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 830, 200, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/perguntas novo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerguntaActionPerformed

    }//GEN-LAST:event_txtPerguntaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       //Metodo Adicionar Pergunta//
        
        try {
            String sql = "insert into Questõens(tipoQuestão, perguntaQuestão, AlternativaCorreta, AlternativaA, AlternativaB, AlternativaC, AlternativaD, dificuldadeQuestão)Values(?,?,?,?,?,?,?,?)";
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtEscolhaLinguagem.getText());
            pst.setString(2, txtPergunta.getText());
            pst.setString(3, txtAlternativaCorreta.getText());
            pst.setString(4, txtAlternativaA.getText());
            pst.setString(5, txtAlternativaB.getText());
            pst.setString(6, txtAlternativaC.getText());
            pst.setString(7, txtAlternativaD.getText());
            pst.setString(8, txtEscolhaDificuldade.getText());
            pst.executeUpdate();
            
                JOptionPane.showMessageDialog(null, "Voce adicionou uma Pergunta");
         
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TelaPrincipal principal = new TelaPrincipal();
                principal.setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarPergunta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtAlternativaA;
    private javax.swing.JTextField txtAlternativaB;
    private javax.swing.JTextField txtAlternativaC;
    private javax.swing.JTextField txtAlternativaCorreta;
    private javax.swing.JTextField txtAlternativaD;
    private javax.swing.JTextField txtEscolhaDificuldade;
    private javax.swing.JTextField txtEscolhaLinguagem;
    private javax.swing.JTextField txtPergunta;
    // End of variables declaration//GEN-END:variables
}
