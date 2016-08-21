/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javax.swing.AbstractButton;
import javax.swing.JLabel;

/**
 *
 * @author Hekatonkiros
 */
public class View extends javax.swing.JFrame {
    /**
     * Creates new form View
     */
    public View() {
        initComponents();
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(5, 3));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        getContentPane().add(jButton1);

        jButton2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        getContentPane().add(jButton2);

        jButton3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        getContentPane().add(jButton3);

        jButton4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        getContentPane().add(jButton4);

        jButton5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        getContentPane().add(jButton5);

        jButton6.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        getContentPane().add(jButton6);

        jButton7.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        getContentPane().add(jButton7);

        jButton8.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        getContentPane().add(jButton8);

        jButton9.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        getContentPane().add(jButton9);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Player (");
        getContentPane().add(jLabel1);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ties");
        getContentPane().add(jLabel2);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Computer (");
        getContentPane().add(jLabel3);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("0");
        getContentPane().add(jLabel4);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("0");
        getContentPane().add(jLabel5);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("0");
        getContentPane().add(jLabel6);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }
    
    public void AddListenrToAllButtons(){
    jButton1.addActionListener(new BtnListener());
    jButton2.addActionListener(new BtnListener());
    jButton3.addActionListener(new BtnListener());
    jButton4.addActionListener(new BtnListener());
    jButton5.addActionListener(new BtnListener());
    jButton6.addActionListener(new BtnListener());
    jButton7.addActionListener(new BtnListener());
    jButton8.addActionListener(new BtnListener());
    jButton9.addActionListener(new BtnListener());
    }
    
    public AbstractButton getButton1(){
    return jButton1;
    }
    
    public AbstractButton getButton2(){
    return jButton2;
    }
    
    public AbstractButton getButton3(){
    return jButton3;
    }
    
    public AbstractButton getButton4(){
    return jButton4;
    }
    
    public AbstractButton getButton5(){
    return jButton5;
    }
    
    public AbstractButton getButton6(){
    return jButton6;
    }

    public AbstractButton getButton7(){
    return jButton7;
    }
    
    public AbstractButton getButton8(){
    return jButton8;
    }

    public AbstractButton getButton9(){
    return jButton9;
    }
    
    public JLabel getLblPlayer1(){
    return jLabel4;
    }
    public JLabel getLblPlayer2(){
    return jLabel6;
    }
    public JLabel getLblTies(){
    return jLabel5;
    }
    
    public void SetLblPlayerOneSymbol(){
    jLabel1.setText(jLabel1.getText() + Main.CG.PlayerOneSymbol + ")");
    }
    public void SetLblPlayerTwoSymbol(){
    jLabel3.setText(jLabel3.getText() + Main.CG.PlayerTwoSymbol + ")");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
    
    
}
