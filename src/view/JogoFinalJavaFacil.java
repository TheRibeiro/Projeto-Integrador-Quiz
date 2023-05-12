/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dbc.ModuloConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class JogoFinalJavaFacil extends javax.swing.JFrame {

    String textoPergunta;
    String alternativaCorreta;
    String alternativaA;
    String alternativaB;
    String alternativaC;
    String alternativaD;
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public JogoFinalJavaFacil() {
        initComponents();
        conexao = ModuloConexao.conector();
        System.out.println(conexao);
    }

    public void pergunta1() {
        try {
            String sql = "Select idQuestão,tipoQuestão, perguntaQuestão, AlternativaCorreta, AlternativaA, AlternativaB, AlternativaC, AlternativaD, dificuldadeQuestão from Questõens where tipoQuestão = \"Java\" and dificuldadeQuestão = \"Fácil\" and idQuestão = 11 ";
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                textoPergunta = (rs.getString(3));
                alternativaCorreta = rs.getString(4);
                alternativaA = (rs.getString(5));
                alternativaB = (rs.getString(6));
                alternativaC = (rs.getString(7));
                alternativaD = (rs.getString(8));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    public void pergunta2() {
        try {
            String sql = "Select idQuestão,tipoQuestão, perguntaQuestão, AlternativaCorreta, AlternativaA, AlternativaB, AlternativaC, AlternativaD, dificuldadeQuestão from Questõens where tipoQuestão = \"Java\" and dificuldadeQuestão = \"Fácil\" and idQuestão = 12 ";
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                textoPergunta = (rs.getString(3));
                alternativaCorreta = rs.getString(4);
                alternativaA = (rs.getString(5));
                alternativaB = (rs.getString(6));
                alternativaC = (rs.getString(7));
                alternativaD = (rs.getString(8));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    public void pergunta3() {
        try {
            String sql = "Select idQuestão,tipoQuestão, perguntaQuestão, AlternativaCorreta, AlternativaA, AlternativaB, AlternativaC, AlternativaD, dificuldadeQuestão from Questõens where tipoQuestão = \"Java\" and dificuldadeQuestão = \"Fácil\" and idQuestão = 13 ";
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                textoPergunta = (rs.getString(3));
                alternativaCorreta = rs.getString(4);
                alternativaA = (rs.getString(5));
                alternativaB = (rs.getString(6));
                alternativaC = (rs.getString(7));
                alternativaD = (rs.getString(8));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    public void pergunta4() {
        try {
            String sql = "Select idQuestão,tipoQuestão, perguntaQuestão, AlternativaCorreta, AlternativaA, AlternativaB, AlternativaC, AlternativaD, dificuldadeQuestão from Questõens where tipoQuestão = \"Java\" and dificuldadeQuestão = \"Fácil\" and idQuestão = 14 ";
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                textoPergunta = (rs.getString(3));
                alternativaCorreta = rs.getString(4);
                alternativaA = (rs.getString(5));
                alternativaB = (rs.getString(6));
                alternativaC = (rs.getString(7));
                alternativaD = (rs.getString(8));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    public void pergunta5() {
        try {
            String sql = "Select idQuestão,tipoQuestão, perguntaQuestão, AlternativaCorreta, AlternativaA, AlternativaB, AlternativaC, AlternativaD, dificuldadeQuestão from Questõens where tipoQuestão = \"Java\" and dificuldadeQuestão = \"Fácil\" and idQuestão = 15 ";
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                textoPergunta = (rs.getString(3));
                alternativaCorreta = rs.getString(4);
                alternativaA = (rs.getString(5));
                alternativaB = (rs.getString(6));
                alternativaC = (rs.getString(7));
                alternativaD = (rs.getString(8));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        começarJogo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        começarJogo.setBackground(new java.awt.Color(0, 0, 0));
        começarJogo.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        começarJogo.setForeground(new java.awt.Color(255, 255, 255));
        começarJogo.setText("Começar");
        começarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                começarJogoActionPerformed(evt);
            }
        });
        getContentPane().add(começarJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 400, 340, 270));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Voltar Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 780, 270, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Começar Java.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void começarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_começarJogoActionPerformed
        int pontuacao = 0;

        pergunta1();

        //PERGUNTA DE NUMERO 1//
        String rP1 = JOptionPane.showInputDialog("\n Sua pontuação é de :" + pontuacao + "\n Pergunta = " + textoPergunta + "\n \n \n \n A ." + alternativaA + "\n \n B ." + alternativaB
                + "\n \n C ." + alternativaC
                + "\n \n D ." + alternativaD
                + "\n \n");

        if (rP1.equals(alternativaCorreta)) {
            JOptionPane.showMessageDialog(null, "Resposta Correta");
            pontuacao = pontuacao + 75;
        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incorreta");

        }
        //PERGUNTA DE NUMERO 2//
        pergunta2();

        String rP2 = JOptionPane.showInputDialog("\n Sua pontuação é de :" + pontuacao + "\n Pergunta = " + textoPergunta + "\n \n \n \n A ." + alternativaA + "\n \n B ." + alternativaB
                + "\n \n C ." + alternativaC
                + "\n \n D ." + alternativaD
                + "\n \n");

        if (rP2.equals(alternativaCorreta)) {
            JOptionPane.showMessageDialog(null, "Resposta Correta");
            pontuacao = pontuacao + 75;
        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incorreta");

        }

        //PERGUNTA DE NUMERO 3//
        pergunta3();
        String rP3 = JOptionPane.showInputDialog("\n Sua pontuação é de :" + pontuacao + "\n Pergunta = " + textoPergunta + "\n \n \n \n A ." + alternativaA + "\n \n B ." + alternativaB
                + "\n \n C ." + alternativaC
                + "\n \n D ." + alternativaD
                + "\n \n");

        if (rP3.equals(alternativaCorreta)) {
            JOptionPane.showMessageDialog(null, "Resposta Correta");
            pontuacao = pontuacao + 75;
        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incorreta");

        }

        //PERGUNTA DE NUMERO 4//
        pergunta4();
        String rP4 = JOptionPane.showInputDialog("\n Sua pontuação é de :" + pontuacao + "\n Pergunta = " + textoPergunta + "\n \n \n \n A ." + alternativaA + "\n \n B ." + alternativaB
                + "\n \n C ." + alternativaC
                + "\n \n D ." + alternativaD
                + "\n \n");

        if (rP4.equals(alternativaCorreta)) {
            JOptionPane.showMessageDialog(null, "Resposta Correta");
            pontuacao = pontuacao + 75;
        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incorreta");

        }

        //PERGUNTA DE NUMERO 5//
        pergunta5();
        String rP5 = JOptionPane.showInputDialog("\n Sua pontuação é de :" + pontuacao + "\n Pergunta = " + textoPergunta + "\n \n \n \n A ." + alternativaA + "\n \n B ." + alternativaB
                + "\n \n C ." + alternativaC
                + "\n \n D ." + alternativaD
                + "\n \n");
        
        JOptionPane.showMessageDialog(null, "Uma segunda autenticação é necessaria!! \n Porfavor insira seus dados");
        
        String tstLogin = JOptionPane.showInputDialog("Login:");
        String tstSenha = JOptionPane.showInputDialog("Senha:");
        String tstRa = JOptionPane.showInputDialog("Ra:");

    

        if (rP5.equals(alternativaCorreta)) {
            JOptionPane.showMessageDialog(null, "Resposta Correta");
            pontuacao = pontuacao + 75;

            try {

                String sql = "insert into Ranking(loginUsuário,pontuaçãoUsuario,raUsuário)VALUES(?,?,?)";
                pst = conexao.prepareStatement(sql);
                pst.setString(1, tstLogin);
                pst.setInt(2, pontuacao);
                pst.setString(3, tstRa);

                int adicionar = pst.executeUpdate();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);

            }

            JOptionPane.showMessageDialog(null, "Seu resultado final foi de: " + pontuacao + "\n Parabéns");
        } else {
            String pontos = String.valueOf(pontuacao);

            JOptionPane.showMessageDialog(null, "Resposta Incorreta");

            try {
                String sql = "insert into Ranking(loginUsuário,pontuaçãoUsuario,raUsuário)VALUES(?,?,?)";
                pst = conexao.prepareStatement(sql);
                pst.setString(1, tstLogin);
                pst.setInt(2, pontuacao);
                pst.setString(3, tstRa);

                int adicionar = pst.executeUpdate();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);

            }
            JOptionPane.showMessageDialog(null, "Seu resultado final foi de:" + pontuacao + "\n Parabéns");
        }
    }//GEN-LAST:event_começarJogoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaPrincipal principal = new TelaPrincipal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JogoFinalJavaFacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoFinalJavaFacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoFinalJavaFacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoFinalJavaFacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoFinalJavaFacil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton começarJogo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
