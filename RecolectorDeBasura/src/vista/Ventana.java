package vista;

import static javax.swing.JOptionPane.showMessageDialog;
import modelo.Usuario;
import serializable.EscribirYLeer;

public class Ventana extends javax.swing.JFrame {
    //TODO: añade login mediante terceros: Google, Facebook...
    //      Pasa esto a clase normal sin formulario una vez terminado y conserva las dos versiones

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Regístrate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 520, 100, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 212, -1));

        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 132, 81));

        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 383, 132, 81));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 413, 212, -1));

        jButton2.setText("Inicia sesión");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 482, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        usuarioIntroducido = jTextField1.getText();
        contraseñaIntroducida = jTextField2.getText();
        if (!compruebaCamposVacios(usuarioIntroducido, contraseñaIntroducida)) {
            Usuario u = new Usuario(usuarioIntroducido, contraseñaIntroducida);
            EscribirYLeer e = new EscribirYLeer();
            String ruta = "D:/Usuarios.dat";
            if (!e.leeFichero(ruta).isEmpty()) {
                e.anhadeFichero(ruta, u);
            } else { //no existe el archivo
                e.escribeFichero(ruta, u);
            }
            System.out.println(e.leeFichero(ruta));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        usuarioIntroducido = jTextField1.getText();
        contraseñaIntroducida = jTextField2.getText();
        if (!compruebaCamposVacios(usuarioIntroducido, contraseñaIntroducida)) {
            if (encuentra(usuarioIntroducido)) { //si no encuentra el usuario no comprueba la contraseña
                if (coincide(contraseñaIntroducida, usuarioIntroducido)) {
                    System.out.println("usuario y contraseña correctos");
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
    
    String usuarioIntroducido = "",
           contraseñaIntroducida = usuarioIntroducido;
    
    public Ventana() {
        initComponents();
    }
    
    boolean encuentra(String usuario) {
        return true;
    }
    
    boolean coincide(String contraseña, String usuario) {
        return true;
    }
    
    private boolean compruebaCamposVacios(String usuarioIntroducido, String contraseñaIntroducida) {
        boolean vacios = true;
        if (!usuarioIntroducido.equals("") && !contraseñaIntroducida.equals("")) {
            vacios = false;
        } else {
            String mensajeError = "Los campos usuario o contraseña no pueden estar vacios";
            //System.out.println(mensajeError);
            showMessageDialog(null, mensajeError);
        }
        return vacios;
    }
    
    /*
    public static void main(String args[]) {
        Ventana v = new Ventana();
        v.setSize(768, 1366); //esto esta bien es la relacion vertical del movil
        v.getContentPane().setBackground(Color.white);
        v.setVisible(true);
    }
    */
}
