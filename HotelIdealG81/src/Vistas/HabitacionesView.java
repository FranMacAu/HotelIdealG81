package Vistas;

import AccesoADatos.HabitacionData;
import AccesoADatos.HuespedData;
import Entidades.Habitacion;
import Entidades.Huesped;
import java.util.HashSet;
import javax.swing.JOptionPane;
import Entidades.TipoHabitacion;

public class HabitacionesView extends javax.swing.JFrame {

    
    public HabitacionesView() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbCrear = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jtfNombreHab = new javax.swing.JTextField();
        jtfPisoHab = new javax.swing.JTextField();
        jcbTipoHab = new javax.swing.JComboBox<>();
        jBSalir = new javax.swing.JButton();
        jtBuscar = new javax.swing.JButton();
        jtLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("HABITACIONES");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Piso:");

        jLabel4.setText("Tipo Habitación:");

        jbCrear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbCrear.setText("CREAR");
        jbCrear.setMaximumSize(new java.awt.Dimension(91, 23));
        jbCrear.setMinimumSize(new java.awt.Dimension(91, 23));
        jbCrear.setNextFocusableComponent(jbEliminar);
        jbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbEliminar.setText("ELIMINAR");
        jbEliminar.setMaximumSize(new java.awt.Dimension(91, 23));
        jbEliminar.setMinimumSize(new java.awt.Dimension(91, 23));
        jbEliminar.setNextFocusableComponent(jbModificar);
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbModificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbModificar.setText("MODIFICAR");
        jbModificar.setNextFocusableComponent(jtfNombreHab);
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jtfNombreHab.setNextFocusableComponent(jtfPisoHab);

        jtfPisoHab.setNextFocusableComponent(jcbTipoHab);
        jtfPisoHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPisoHabActionPerformed(evt);
            }
        });

        jcbTipoHab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Simple", "Doble", "Triple", "Suite" }));

        jBSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBSalir.setText("SALIR");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jtBuscar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jtBuscar.setText("BUSCAR");
        jtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBuscarActionPerformed(evt);
            }
        });

        jtLimpiar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jtLimpiar.setText("LIMPIAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(125, 125, 125))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbTipoHab, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfNombreHab)
                            .addComponent(jtfPisoHab, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtBuscar)
                            .addComponent(jtLimpiar))
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfNombreHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfPisoHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbTipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbModificar)
                    .addComponent(jBSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfPisoHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPisoHabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPisoHabActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearActionPerformed
        String nombreHabitacion = jtfNombreHab.getText();
        String pisoHabitacion = jtfPisoHab.getText();
        String tipoHabitacion = jcbTipoHab.getSelectedItem().toString();
           
        HabitacionData hd = new HabitacionData (); 
        Habitacion h = new Habitacion(); 
        
        if (nombreHabitacion.isEmpty() || pisoHabitacion.isEmpty() || tipoHabitacion.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
                    
         h.setNombre(nombreHabitacion);
         h.setPiso(Integer.parseInt(pisoHabitacion));
         h.setTipoHab(Integer.parseInt(tipoHabitacion));
         JOptionPane.showMessageDialog(this, "Habitación creada exitosamente.");
         jtfNombreHab.setText("");
         jtfPisoHab.setText("");
         jcbTipoHab.setSelectedIndex(0);
          
        
        }
    }//GEN-LAST:event_jbCrearActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        String nombreStr = jtfNombreHab.getText();     
        
        if (nombreStr.isEmpty()) {
        JOptionPane.showMessageDialog(jtfNombreHab, "Ingresa un nombre de habitación válido");
    } else {
        HabitacionData thd = new HabitacionData();
        Habitacion th = thd.buscarHabitacion(nombreStr);

        if (th != null) {
            int confirmacion = JOptionPane.showConfirmDialog(jtfNombreHab, "¿Estás seguro de que deseas eliminar esta habitación?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {                
               thd.eliminarHabitacion(th.getNombre());               
                    JOptionPane.showMessageDialog(jtfNombreHab, "Habitación eliminada con éxito.");
                    jtfNombreHab.setText("");
                    jtfPisoHab.setText("");
                    jcbTipoHab.setSelectedIndex(0);
               
            
        } else {
            JOptionPane.showMessageDialog(jtfNombreHab, "No se encontró una habitación con ese nombre.");
        }
    }

        
        
        
        
 }    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtBuscarActionPerformed
        String nombreStr = jtfNombreHab.getText();
    
    if (nombreStr.isEmpty()) {
        JOptionPane.showMessageDialog(jtfNombreHab , "Ingresa un numero de DNi valido");
          
        HabitacionData thd  =new HabitacionData();
        
        Habitacion th = thd.buscarHabitacionPorNombre(nombreStr);
        
         try { 
       int nombre = Integer.parseInt(nombreStr);
        if (th != null ) {
        jtfNombreHab.setText(th.getNombre());
        jtfPisoHab.setText(String.valueOf(th.getPiso()));
        //jcbTipoHab.set ;          //Según el registro selecciona la opcion correspondiente del combobox
        }  else {
            JOptionPane.showMessageDialog(jtfNombreHab , "No se encontro ninguna habitacion con ese numero");
        }
   } catch (NumberFormatException ex) { 
       JOptionPane.showMessageDialog(jtfNombreHab , "Ingresa un Numero valido");
     }
   }
    }//GEN-LAST:event_jtBuscarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        
    }//GEN-LAST:event_jbModificarActionPerformed


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
            java.util.logging.Logger.getLogger(HabitacionesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HabitacionesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HabitacionesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HabitacionesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HabitacionesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbCrear;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JComboBox<String> jcbTipoHab;
    private javax.swing.JButton jtBuscar;
    private javax.swing.JButton jtLimpiar;
    private javax.swing.JTextField jtfNombreHab;
    private javax.swing.JTextField jtfPisoHab;
    // End of variables declaration//GEN-END:variables
}
