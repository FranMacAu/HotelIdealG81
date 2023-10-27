package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class HotelIdealGeneral extends javax.swing.JFrame {

    public HotelIdealGeneral() {
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

        ImageIcon icono = new ImageIcon(getClass().getResource("/Recursos/HotelIdeal.jpg"));
        Image miImagen=icono.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent (Graphics g){

                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);
            }

        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuReservas = new javax.swing.JMenu();
        jMIReservas = new javax.swing.JMenuItem();
        jMenuHabitaciones = new javax.swing.JMenu();
        jMIHab = new javax.swing.JMenuItem();
        jMITipoHab = new javax.swing.JMenuItem();
        jMenuHuespedes = new javax.swing.JMenu();
        jMIHuesped = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMISalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 292, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );

        jMenuReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/libro-alt.png"))); // NOI18N
        jMenuReservas.setNextFocusableComponent(jMIHab);

        jMIReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/reservar-usuario.png"))); // NOI18N
        jMIReservas.setText("Reservas");
        jMIReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIReservasActionPerformed(evt);
            }
        });
        jMenuReservas.add(jMIReservas);

        jMenuBar1.add(jMenuReservas);

        jMenuHabitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cama.png"))); // NOI18N
        jMenuHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuHabitacionesActionPerformed(evt);
            }
        });

        jMIHab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cama-alternativa.png"))); // NOI18N
        jMIHab.setText("Habitaciones");
        jMIHab.setNextFocusableComponent(jMITipoHab);
        jMIHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIHabActionPerformed(evt);
            }
        });
        jMenuHabitaciones.add(jMIHab);

        jMITipoHab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/litera.png"))); // NOI18N
        jMITipoHab.setText("Tipo de Habitaciones");
        jMITipoHab.setNextFocusableComponent(jMIHuesped);
        jMITipoHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMITipoHabActionPerformed(evt);
            }
        });
        jMenuHabitaciones.add(jMITipoHab);

        jMenuBar1.add(jMenuHabitaciones);

        jMenuHuespedes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/usuarios-alt.png"))); // NOI18N
        jMenuHuespedes.setNextFocusableComponent(jMISalir);

        jMIHuesped.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/personas.png"))); // NOI18N
        jMIHuesped.setText("Huéspedes");
        jMIHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIHuespedActionPerformed(evt);
            }
        });
        jMenuHuespedes.add(jMIHuesped);

        jMenuBar1.add(jMenuHuespedes);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/rectangulo-xmark.png"))); // NOI18N
        jMenu4.setNextFocusableComponent(jMIReservas);

        jMISalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/marca-x-rectangular.png"))); // NOI18N
        jMISalir.setText("Salir");
        jMenu4.add(jMISalir);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIReservasActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        ReservaView reserva = new ReservaView();
        reserva.setVisible(true);
        jDesktopPane1.add(reserva);
    }//GEN-LAST:event_jMIReservasActionPerformed

    private void jMenuHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHabitacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuHabitacionesActionPerformed

    private void jMITipoHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMITipoHabActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        TipoHabitación TipHab = new TipoHabitación();
        TipHab.setVisible(true);
        jDesktopPane1.add(TipHab);
    }//GEN-LAST:event_jMITipoHabActionPerformed

    private void jMIHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIHuespedActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        HuespedView Huesped = new HuespedView();
        Huesped.setVisible(true);
        jDesktopPane1.add(Huesped);
    }//GEN-LAST:event_jMIHuespedActionPerformed

    private void jMIHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIHabActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        HabitacionesView Habitacion = new HabitacionesView();
        Habitacion.setVisible(true);
        jDesktopPane1.add(Habitacion);
    }//GEN-LAST:event_jMIHabActionPerformed

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
            java.util.logging.Logger.getLogger(HotelIdealGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HotelIdealGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HotelIdealGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HotelIdealGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HotelIdealGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuItem jMIHab;
    private javax.swing.JMenuItem jMIHuesped;
    private javax.swing.JMenuItem jMIReservas;
    private javax.swing.JMenuItem jMISalir;
    private javax.swing.JMenuItem jMITipoHab;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuHabitaciones;
    private javax.swing.JMenu jMenuHuespedes;
    private javax.swing.JMenu jMenuReservas;
    // End of variables declaration//GEN-END:variables
}
