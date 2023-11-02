package Vistas;

import AccesoADatos.HuespedData;
import AccesoADatos.ReservaData;
import Entidades.Huesped;
import javax.swing.JOptionPane;

public class HuespedView extends javax.swing.JFrame {

    public HuespedView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlHuesped = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtDNI = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtTelefono = new javax.swing.JTextField();
        jtEmail = new javax.swing.JTextField();
        jtDireccion = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbCrear = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlHuesped.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlHuesped.setText("Huésped");

        jLabel1.setText("DNI:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellido:");

        jLabel6.setText("Número de teléfono:");

        jLabel7.setText("Correo electrónico:");

        jLabel8.setText("Dirección:");

        jtDNI.setNextFocusableComponent(jtNombre);

        jtNombre.setNextFocusableComponent(jtApellido);

        jtTelefono.setNextFocusableComponent(jtEmail);

        jtEmail.setNextFocusableComponent(jtDireccion);

        jbBuscar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbBuscar.setText("BÚSQUEDA");
        jbBuscar.setNextFocusableComponent(jbSalir);
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbSalir.setText("SALIR");
        jbSalir.setNextFocusableComponent(jtDNI);
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbCrear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbCrear.setText("CREAR");
        jbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbEliminar.setText("ELIMINAR");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbModificar.setText("MODIFICAR");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbLimpiar.setText("LIMPIAR");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jlHuesped)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtApellido)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jtDNI)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbBuscar))
                                    .addComponent(jtNombre)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbCrear)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbModificar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbEliminar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbLimpiar))))
                            .addComponent(jbSalir, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlHuesped)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCrear)
                    .addComponent(jbModificar)
                    .addComponent(jbEliminar)
                    .addComponent(jbLimpiar))
                .addGap(18, 18, 18)
                .addComponent(jbSalir)
                .addGap(36, 36, 36)
                .addComponent(jLabel2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        String dniStr = jtDNI.getText();

        if (dniStr.isEmpty()) {
            JOptionPane.showMessageDialog(jtDNI, "Ingresa un numero de DNI valido");
            return;
        }

        try {
            int dni = Integer.parseInt(dniStr);
            HuespedData huespedData = new HuespedData();
            Huesped huesped = huespedData.buscarPordni(dni);

            if (huesped != null) {
                jtDNI.setText(dniStr);
                jtNombre.setText(huesped.getNombre());
                jtApellido.setText(huesped.getApellido());
                jtEmail.setText(huesped.getCorreo());
                jtTelefono.setText(String.valueOf(huesped.getTelefono()));
                jtDireccion.setText(huesped.getDomicilio());
            } else {
                JOptionPane.showMessageDialog(jtDNI, "No se encontró ningún huésped con ese DNI");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(jtDNI, "Ingresa un DNI válido");
        }

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        int dni = Integer.parseInt(jtDNI.getText());

        HuespedData hd = new HuespedData();
        Huesped h = new Huesped();

        if (jtDNI.getText().isEmpty()) {
            JOptionPane.showMessageDialog(jtDNI, "Ingresa un numero de DNI ");
        } else {
            hd.eliminarHuesped(dni);

        }

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearActionPerformed
        String dniStr = jtDNI.getText();
        String emailStr = jtEmail.getText();

        if (dniStr.isEmpty()) {
            JOptionPane.showMessageDialog(jtDNI, "Ingresa un numero de DNI valido");
            return;
        }
        if (!emailStr.contains("@") || emailStr.endsWith(".")) {
            JOptionPane.showMessageDialog(jtEmail, "Ingresa un correo electrónico válido ");
            return;
        }

        try {
            int dni = Integer.parseInt(dniStr);
            HuespedData huespedData = new HuespedData();
            Huesped huesped = new Huesped();

            huesped.setDni(Integer.parseInt(dniStr));
            huesped.setNombre(jtNombre.getText());
            huesped.setApellido(jtApellido.getText());
            huesped.setCorreo(jtEmail.getText());
            huesped.setDomicilio(jtDireccion.getText());
            huesped.setTelefono(Integer.parseInt(jtTelefono.getText()));

            huespedData.GuardarHuesped(huesped);

            JOptionPane.showMessageDialog(null, "Huésped guardado");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(jtDNI, "Ingresa un DNI valido");
        }
    }//GEN-LAST:event_jbCrearActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        String dniStr = jtDNI.getText();

        if (dniStr.isEmpty()) {
            JOptionPane.showMessageDialog(jtDNI, "Ingresa un numero de DNI valido");
            return;
        }

        try {
            int dni = Integer.parseInt(dniStr);
            HuespedData huespedData = new HuespedData();
            Huesped huesped = new Huesped();

            huesped.setDni(Integer.parseInt(dniStr));
            huesped.setNombre(jtNombre.getText());
            huesped.setApellido(jtApellido.getText());
            huesped.setCorreo(jtEmail.getText());
            huesped.setDomicilio(jtDireccion.getText());
            huesped.setTelefono(Integer.parseInt(jtTelefono.getText()));

            huespedData.modificarHuesped(huesped);

            JOptionPane.showMessageDialog(null, "Huésped modificado exitosamente");
            jtDNI.setText("");
            jtNombre.setText("");
            jtApellido.setText("");
            jtEmail.setText("");
            jtDireccion.setText("");
            jtTelefono.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(jtDNI, "Ingresa un DNI valido");
        }

    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jtDNI.setText("");
        jtNombre.setText("");
        jtApellido.setText("");
        jtEmail.setText("");
        jtTelefono.setText(String.valueOf(""));
        jtDireccion.setText("");
    }//GEN-LAST:event_jbLimpiarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HuespedView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HuespedView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HuespedView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HuespedView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HuespedView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCrear;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlHuesped;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDNI;
    private javax.swing.JTextField jtDireccion;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables
}
