/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monito;

import java.awt.event.KeyEvent;

/**
 *
 * @author RubenEduardo
 */
public class Int_mon extends javax.swing.JFrame {

    /**
     * Creates new form Int_mon
     */
    public Int_mon() {
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

        jPanel1 = new javax.swing.JPanel();
        Up = new javax.swing.JButton();
        Left = new javax.swing.JButton();
        Right = new javax.swing.JButton();
        Down = new javax.swing.JButton();
        nave = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 350));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
        getContentPane().setLayout(null);

        Up.setText("Up");
        Up.setFocusable(false);
        Up.setMaximumSize(null);
        Up.setMinimumSize(new java.awt.Dimension(40, 20));
        Up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                UpMouseReleased(evt);
            }
        });
        Up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpActionPerformed(evt);
            }
        });
        Up.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UpKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UpKeyReleased(evt);
            }
        });

        Left.setText("Left");
        Left.setFocusable(false);
        Left.setMaximumSize(null);
        Left.setMinimumSize(new java.awt.Dimension(40, 20));
        Left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeftActionPerformed(evt);
            }
        });

        Right.setText("Right");
        Right.setFocusable(false);
        Right.setMaximumSize(null);
        Right.setMinimumSize(new java.awt.Dimension(40, 20));
        Right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RightActionPerformed(evt);
            }
        });

        Down.setText("Down");
        Down.setFocusable(false);
        Down.setMaximumSize(null);
        Down.setMinimumSize(new java.awt.Dimension(40, 20));
        Down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Up, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Down, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Right, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Right, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Down, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(440, 200, 220, 70);

        nave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/extraterrestre-en-nave-espacial_135.png"))); // NOI18N
        nave.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nave.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        nave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                naveKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                naveKeyTyped(evt);
            }
        });
        getContentPane().add(nave);
        nave.setBounds(140, 50, 125, 98);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DownActionPerformed
                nave.setLocation(nave.getX(), nave.getY()+5);
    }//GEN-LAST:event_DownActionPerformed

    private void UpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UpKeyReleased

    }//GEN-LAST:event_UpKeyReleased

    private void UpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UpKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpKeyPressed

    private void UpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpActionPerformed
        // TODO add your handling code here:
        nave.setLocation(nave.getX(), nave.getY()-5);
    }//GEN-LAST:event_UpActionPerformed

    private void UpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpMouseReleased

    }//GEN-LAST:event_UpMouseReleased

    private void UpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UpMouseClicked

    private void naveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_naveKeyPressed

    }//GEN-LAST:event_naveKeyPressed

    private void naveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_naveKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_naveKeyTyped

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int paso = 10;
         if (evt.getKeyCode() == KeyEvent.VK_RIGHT ) {
            //System.out.println(nave.getX()+","+nave.getY());
            nave.setLocation(nave.getX()+paso, nave.getY());
    } else if (evt.getKeyCode() == KeyEvent.VK_LEFT ) {
            //System.out.println(nave.getX()+","+nave.getY());
            nave.setLocation(nave.getX()-paso, nave.getY());
    } else if (evt.getKeyCode() == KeyEvent.VK_UP ) {
            //System.out.println(nave.getX()+","+nave.getY());
            nave.setLocation(nave.getX(), nave.getY()-paso);
    } else if (evt.getKeyCode() == KeyEvent.VK_DOWN ) {
            //System.out.println(nave.getX()+","+nave.getY());
            nave.setLocation(nave.getX(), nave.getY()+paso);
    }
    }//GEN-LAST:event_formKeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        
    }//GEN-LAST:event_formKeyReleased

    private void LeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeftActionPerformed
nave.setLocation(nave.getX()-5, nave.getY());        // TODO add your handling code here:
    }//GEN-LAST:event_LeftActionPerformed

    private void RightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RightActionPerformed
nave.setLocation(nave.getX()+5, nave.getY());        // TODO add your handling code here:
    }//GEN-LAST:event_RightActionPerformed

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
            java.util.logging.Logger.getLogger(Int_mon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Int_mon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Int_mon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Int_mon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Down;
    private javax.swing.JButton Left;
    private javax.swing.JButton Right;
    private javax.swing.JButton Up;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nave;
    // End of variables declaration//GEN-END:variables

    private void printf(String hola) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
