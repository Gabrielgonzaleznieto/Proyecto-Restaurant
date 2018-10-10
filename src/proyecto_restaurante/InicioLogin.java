
package proyecto_restaurante;

import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import proyecto_restaurante.Ventana_Productos;

/**
 *
 * @author gabriel gonzalez
 */
public class InicioLogin extends javax.swing.JFrame {

    private Timer tiempo;                         //VARIABLE GLOBAL PARA LA BARRA DE PROGRESO.
    int cont;                                    //VARIABLE GLOBAL PARA LA BARRA DE PROGRESO.
    public final static int TWO_SECOND = 20;    //VARIABLE GLOBAL PARA LA BARRA DE PROGRESO MARCA EL TIEMPO EN QUE TARDA EN CARGARSE.
    
    int posx, posy;
    
 
    public InicioLogin() {
        initComponents();
      //  cursores();
        this.setLocationRelativeTo(null); // CON ESTA SENTENCIA EL FRAME APARECE CENTRADO.  
        
        Toolkit lo = Toolkit.getDefaultToolkit();                                          //AQUI LE DOY UN ICONO AL PROGRAMA.
        setIconImage(lo.getImage(getClass().getResource("/Imagenes/Portada.jpg")));       //AQUI LE DOY UN ICONO AL PROGRAMA.
    }
    
    
   /* public void cursores() {
        Cursor cursor;
        ImageIcon imagen = new ImageIcon("src\\Imagenes\\Cursor.png");
        Toolkit t = Toolkit.getDefaultToolkit();
        cursor =t.createCustomCursor(imagen.getImage(), new Point(1,1),"Cursor");
        setCursor(cursor);
    } */

  
    class TimerListener implements ActionListener{
       public void actionPerformed(ActionEvent e){
           cont ++;
           Barra.setValue(cont);
           if(cont ==100){
               tiempo.stop();
               esconder_barra();
               
               Ventana_Productos ventana = new Ventana_Productos(); 
               ventana.setVisible (true); 
               setVisible(false);
           }
       } 
    }
    
    public void esconder_barra(){
        this.setVisible(false);
    }
    
     public void activar_barra(){
        tiempo.start();
    }
            
    public void validar(){
        
        String usu = txtusuario.getText().trim();
        String paswor = txtcontraseña.getText().trim();
        
        if(!usu.equals("ADMINISTRADOR")) {
            
            JOptionPane.showMessageDialog(null, "USUARIO INCORRECTO");
            
        } else if(usu.equals("ADMINISTRADOR") && paswor.equals("SANSRATS")){
           /* Ventana_Productos ventana = new Ventana_Productos(); 
            ventana.setVisible (true);    */
        
            cont= -1;
            Barra.setValue(0);
            Barra.setStringPainted(true);
            tiempo = new Timer(TWO_SECOND, new TimerListener());
            activar_barra();
           
        } else if(!paswor.equals("SANSRATS")){
        
            JOptionPane.showMessageDialog(null, "CONTRASEÑA INCORRECTO");
    }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MINIMIZAR = new javax.swing.JLabel();
        CERRAR = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtcontraseña = new javax.swing.JPasswordField();
        Barra = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(575, 1050));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MINIMIZAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MINIMIZAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MINIMIZARMouseClicked(evt);
            }
        });
        getContentPane().add(MINIMIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 50, 50));

        CERRAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CERRAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CERRARMouseClicked(evt);
            }
        });
        getContentPane().add(CERRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 50, 50));

        txtusuario.setBackground(new java.awt.Color(244, 245, 199));
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 230, 30));

        txtcontraseña.setBackground(new java.awt.Color(245, 245, 199));
        txtcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraseñaActionPerformed(evt);
            }
        });
        txtcontraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcontraseñaKeyPressed(evt);
            }
        });
        getContentPane().add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 230, 30));

        Barra.setBackground(new java.awt.Color(231, 227, 227));
        Barra.setForeground(new java.awt.Color(255, 96, 1));
        Barra.setBorderPainted(false);
        getContentPane().add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 240, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login.png"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        posx = evt.getX();
        posy = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int xp = evt.getXOnScreen() -posx;
        int yp = evt.getXOnScreen() -posy;
        this.setLocation(xp, yp);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void CERRARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CERRARMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CERRARMouseClicked

    private void MINIMIZARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINIMIZARMouseClicked
        setExtendedState(JFrame.CROSSHAIR_CURSOR);
    }//GEN-LAST:event_MINIMIZARMouseClicked

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void txtcontraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontraseñaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){   //ACA AL COLOCAR LA CONTRASEÑA Y PULSAR ENTER DEL TECLADO SE ACCEDE PARA ELLO DEBEMOS DECLARAR UN EVENTO.
            validar();
        }
    }//GEN-LAST:event_txtcontraseñaKeyPressed

    private void txtcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(InicioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioLogin().setVisible(true);
            }
        });
        
    }
    
      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Barra;
    private javax.swing.JLabel CERRAR;
    private javax.swing.JLabel MINIMIZAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
