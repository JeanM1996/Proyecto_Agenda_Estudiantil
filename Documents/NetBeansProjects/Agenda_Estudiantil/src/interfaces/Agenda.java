
package interfaces;

import javax.swing.RowFilter;
import interfaces.ListTareas;
import javax.swing.JOptionPane;

/**
 *Intefaz de Login o acceso a la aplicacion
 * @author Jean Mosquera
 */
public class Agenda extends javax.swing.JFrame {

    public Agenda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JFormattedTextField();
        jpassContrasenia = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        tema = new javax.swing.JLabel();
        materia = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acceso Agenda Estudiantil");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 360, 200, 40));
        getContentPane().add(jpassContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 430, 200, 40));

        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 500, 100, 40));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Sistemas Infromáticos y Conputación.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 260, 140));

        tema.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        tema.setForeground(new java.awt.Color(255, 255, 255));
        tema.setText("AGENDA ESTUDIANTIL ");
        getContentPane().add(tema, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, 320, 110));

        materia.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        materia.setForeground(new java.awt.Color(255, 255, 255));
        materia.setText("FUNDAMENTOS DE PROGRAMACIÓN");
        getContentPane().add(materia, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, 340, 50));

        login.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("LOGIN");
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, 70, 40));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USUARIO:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 360, 60, 40));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONTRASEÑA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 450, 80, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/9AEDA435.jpeg"))); // NOI18N
        fondo.setFocusable(false);
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 1540, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       char contrasenia[]=jpassContrasenia.getPassword();// contraseña
       String contraseniadef= new String(contrasenia);
       
       if (txtUsuario.getText().equals("ADMIN")&& contraseniadef.equals("1a2b3c")){
           this. dispose();
           JOptionPane.showMessageDialog(null, "Bienvenido\n"
                    +JOptionPane.INFORMATION_MESSAGE);
                   
                   ListTareas formListTareas = new ListTareas();
                   formListTareas.setVisible(true);

           
       }else{
              JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
                    +JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jpassContrasenia;
    private javax.swing.JLabel login;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel materia;
    private javax.swing.JLabel tema;
    private javax.swing.JFormattedTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
