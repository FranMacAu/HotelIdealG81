package Vistas;

import AccesoADatos.HabitacionData;
import AccesoADatos.HuespedData;
import Entidades.Huesped;
import Entidades.Reserva; 
import javax.swing.JOptionPane;
import AccesoADatos.ReservaData;
import AccesoADatos.TipoHabData;
import Entidades.Habitacion;
import Entidades.TipoHabitacion;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.List;


public class ReservaView extends javax.swing.JFrame {

    
    public ReservaView() {
        initComponents();
        armarComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlReservas = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jlDNI = new javax.swing.JLabel();
        jlDomicilio = new javax.swing.JLabel();
        jlEmail = new javax.swing.JLabel();
        jlTelefono = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtDNI = new javax.swing.JTextField();
        jtDomicilio = new javax.swing.JTextField();
        jtEmail = new javax.swing.JTextField();
        jtTelefono = new javax.swing.JTextField();
        jlHuesped = new javax.swing.JLabel();
        jlHabitacion = new javax.swing.JLabel();
        jlTipoHab = new javax.swing.JLabel();
        jlCombCamas = new javax.swing.JLabel();
        jcbTipoHab = new javax.swing.JComboBox<>();
        jcbNumHab = new javax.swing.JComboBox<>();
        jlIngreso = new javax.swing.JLabel();
        jlEgreso = new javax.swing.JLabel();
        jdcIngreso = new com.toedter.calendar.JDateChooser();
        jdcEgreso = new com.toedter.calendar.JDateChooser();
        jlPrecioHab = new javax.swing.JLabel();
        jtfPrecioHab = new javax.swing.JTextField();
        jlPrecioEst = new javax.swing.JLabel();
        jtfPrecioEst = new javax.swing.JTextField();
        jbSalir = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbReservar = new javax.swing.JButton();
        jbCalcular = new javax.swing.JButton();
        jbBusqueda = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jcbTipoCama = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlReservas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlReservas.setText("RESERVAS");

        jlNombre.setText("Nombre/s:");

        jlApellido.setText("Apellido:");

        jlDNI.setText("D.N.I.:");

        jlDomicilio.setText("Domicilio:");

        jlEmail.setText("E-mail:");

        jlTelefono.setText("Teléfono:");

        jtNombre.setNextFocusableComponent(jtApellido);

        jtApellido.setNextFocusableComponent(jtDomicilio);

        jtDNI.setNextFocusableComponent(jbBusqueda);

        jtDomicilio.setNextFocusableComponent(jtEmail);

        jtEmail.setNextFocusableComponent(jtTelefono);

        jlHuesped.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlHuesped.setText("HUÉSPED");

        jlHabitacion.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlHabitacion.setText("HABITACIÓN.");

        jlTipoHab.setText("Tipo de Habitación:");

        jlCombCamas.setText("Tipo de camas:");

        jcbTipoHab.setNextFocusableComponent(jcbNumHab);
        jcbTipoHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoHabActionPerformed(evt);
            }
        });

        jcbNumHab.setNextFocusableComponent(jdcIngreso);
        jcbNumHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNumHabActionPerformed(evt);
            }
        });

        jlIngreso.setText("Fecha de ingreso:");

        jlEgreso.setText("Fecha de salida:");

        jdcIngreso.setNextFocusableComponent(jdcEgreso);

        jlPrecioHab.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlPrecioHab.setText("PRECIO POR HABITACIÓN");

        jtfPrecioHab.setEditable(false);

        jlPrecioEst.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlPrecioEst.setText("PRECIO POR ESTADÍA:");

        jtfPrecioEst.setEditable(false);

        jbSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbSalir.setText("SALIR");
        jbSalir.setNextFocusableComponent(jbEliminar);
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbEliminar.setText("ELIMINAR");
        jbEliminar.setNextFocusableComponent(jtDNI);
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbReservar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbReservar.setText("HACER RESERVA");
        jbReservar.setNextFocusableComponent(jbSalir);
        jbReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReservarActionPerformed(evt);
            }
        });

        jbCalcular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbCalcular.setText("CALCULAR");
        jbCalcular.setNextFocusableComponent(jbReservar);
        jbCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcularActionPerformed(evt);
            }
        });

        jbBusqueda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbBusqueda.setText("BÚSQUEDA");
        jbBusqueda.setNextFocusableComponent(jtNombre);
        jbBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBusquedaActionPerformed(evt);
            }
        });

        jLabel2.setText("Número de habitación:");

        jcbTipoCama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Simple", "Queen", "King" }));
        jcbTipoCama.setNextFocusableComponent(jdcIngreso);
        jcbTipoCama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoCamaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jlHuesped)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlHabitacion)
                .addGap(140, 140, 140))
            .addGroup(layout.createSequentialGroup()
                .addGap(422, 422, 422)
                .addComponent(jlReservas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbEliminar)
                        .addGap(191, 191, 191)
                        .addComponent(jbSalir)
                        .addGap(268, 268, 268))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNombre)
                                    .addComponent(jlApellido)
                                    .addComponent(jlDNI))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                                    .addComponent(jtApellido)
                                    .addComponent(jtDNI))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbBusqueda))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlTelefono)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jlEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlDomicilio, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlEgreso)
                                        .addGap(18, 18, 18)
                                        .addComponent(jdcEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlIngreso)
                                        .addGap(18, 18, 18)
                                        .addComponent(jdcIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlTipoHab)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jcbNumHab, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jcbTipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6))
                                    .addComponent(jlPrecioEst))
                                .addGap(18, 18, 18)
                                .addComponent(jtfPrecioHab))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addComponent(jLabel2))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jlCombCamas)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcbTipoCama, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(178, 178, 178))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jbCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbReservar)
                                            .addComponent(jtfPrecioEst, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 12, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlPrecioHab)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlReservas)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlHabitacion)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jbBusqueda)
                                            .addComponent(jlDNI)
                                            .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlIngreso)))
                                    .addComponent(jdcIngreso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jlNombre)
                                                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jlApellido)
                                                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jdcEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jcbTipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jlDomicilio))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jcbNumHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jlEgreso)
                                        .addGap(18, 18, 18)
                                        .addComponent(jlTipoHab)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlEmail)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jcbTipoCama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlCombCamas)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jlPrecioHab)
                                .addGap(18, 18, 18)
                                .addComponent(jtfPrecioHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlTelefono)
                            .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfPrecioEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlPrecioEst))
                        .addGap(18, 18, 18)
                        .addComponent(jbCalcular)
                        .addGap(18, 18, 18)
                        .addComponent(jbReservar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbEliminar)
                            .addComponent(jbSalir))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlHuesped)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void jbReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReservarActionPerformed
    Huesped huesped = obtenerHuesped(); 
    Habitacion habitacion = obtenerHabitacion(); 

    
    if (huesped == null || habitacion == null) {
        JOptionPane.showMessageDialog(null, "Selecciona un huésped y una habitación válidos.");
        return;
    }

    
    Reserva reserva = new Reserva();
    reserva.setIdHuesped(huesped.getId());
    reserva.setIdHabitacion(habitacion.getId()); 
    
    GuardarReserva(reserva);
}

    private Huesped obtenerHuesped() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Habitacion obtenerHabitacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void GuardarReserva(Reserva reserva) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }//GEN-LAST:event_jbReservarActionPerformed
 
    
    
    
    private void jbBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBusquedaActionPerformed
    String dniStr = jtDNI.getText();
    
    if (dniStr.isEmpty()&& (!dniStr.contains("@") && dniStr.endsWith(".")) ) {
        JOptionPane.showMessageDialog(jtDNI , "Ingresa un numero de DNi valido");
        return; 
    }
   try { 
       int dni = Integer.parseInt(dniStr);
        HuespedData huespedData =new HuespedData();
        Huesped huesped = huespedData.buscarPordni(dni);
        if (huesped != null ) {
         jtNombre.setText(huesped.getNombre());
         jtApellido.setText(huesped.getApellido());
         jtEmail.setText(huesped.getCorreo());
         jtTelefono.setText(String.valueOf(huesped.getTelefono()));   
        } else {
            JOptionPane.showMessageDialog(jtDNI , "No se encontro ningun huesped con ese DNI");
        }
   } catch (NumberFormatException ex) { 
       JOptionPane.showMessageDialog(jtDNI , "Ingresa un DNi valido0");
   }
    }//GEN-LAST:event_jbBusquedaActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
          String dniStr = jtDNI.getText();
          
          if (dniStr.isEmpty()) {
        JOptionPane.showMessageDialog(jlDNI, "Ingresa un numero de DNI valido");
        return; 
    }
         try {
              int dni = Integer.parseInt(dniStr);
              HuespedData huespedData = new HuespedData();
              Huesped huesped = huespedData.buscarPordni(dni);
              if (huesped != null) {                
              int IdReserva = huesped.getIdReserva();
              if (IdReserva > 0) {
              eliminarReserva(IdReserva); 
                JOptionPane.showMessageDialog(jtDNI, "Reserva eliminada con éxito");
            } else {
                JOptionPane.showMessageDialog(jtDNI, "No se encontró una reserva para este DNI");
            }
        } else {
            JOptionPane.showMessageDialog(jtDNI, "No se encontró ninguna persona con este DNI");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(jtDNI, "Ingresa un número de DNI válido");
    }


    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jcbNumHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNumHabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbNumHabActionPerformed

    private void jbCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcularActionPerformed
        
        if (jcbNumHab.getSelectedIndex() == -1 || jcbTipoHab.getSelectedIndex() == -1 ) {
        JOptionPane.showMessageDialog(this, "Ingresa un numero de habitacion y un tipo de habitacion");
        return;
        }
        try {
            LocalDate fechainicio = jdcIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechasalida = jdcEgreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            if (fechasalida.isBefore(fechainicio)){
            JOptionPane.showMessageDialog(this, "Ingresa una de salida valida");
            return;
          }if (fechainicio.isBefore(LocalDate.now(ZoneId.systemDefault()))){
            JOptionPane.showMessageDialog(this, "La fecha no puede ser antes del ingreso");
            return;
          }
         
         int dias = (int)ChronoUnit.DAYS.between(fechainicio, fechasalida) ;
        TipoHabData thd = new TipoHabData ();
        TipoHabitacion th = thd.buscarPorNombre((String) jcbTipoHab.getSelectedItem());
        double Precio = th.getPrecio()*dias;
        jtfPrecioEst.setText(Precio+ "");
        
        
        }catch (NullPointerException e) {
          JOptionPane.showMessageDialog(this, "Ingresa una fecha de inicio y de salida");
            
            
        }
                
       
        
        
    }//GEN-LAST:event_jbCalcularActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcbTipoCamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoCamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoCamaActionPerformed

   
    private void jcbTipoHabActionPerformed(java.awt.event.ActionEvent evt) {
        TipoHabData thd = new TipoHabData ();
        TipoHabitacion th = thd.buscarPorNombre((String) jcbTipoHab.getSelectedItem());
        jtfPrecioHab.setText(th.getPrecio()+"");
        jcbTipoCama.setSelectedItem(th.getTipoCama());
        armarComboDisponibles(th);
   }
          
    
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
            java.util.logging.Logger.getLogger(ReservaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbBusqueda;
    private javax.swing.JButton jbCalcular;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbReservar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcbNumHab;
    private javax.swing.JComboBox<String> jcbTipoCama;
    private javax.swing.JComboBox<String> jcbTipoHab;
    private com.toedter.calendar.JDateChooser jdcEgreso;
    private com.toedter.calendar.JDateChooser jdcIngreso;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlCombCamas;
    private javax.swing.JLabel jlDNI;
    private javax.swing.JLabel jlDomicilio;
    private javax.swing.JLabel jlEgreso;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlHabitacion;
    private javax.swing.JLabel jlHuesped;
    private javax.swing.JLabel jlIngreso;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlPrecioEst;
    private javax.swing.JLabel jlPrecioHab;
    private javax.swing.JLabel jlReservas;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JLabel jlTipoHab;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDNI;
    private javax.swing.JTextField jtDomicilio;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    private javax.swing.JTextField jtfPrecioEst;
    private javax.swing.JTextField jtfPrecioHab;
    // End of variables declaration//GEN-END:variables


    private void armarComboBox(){
            TipoHabData th=new TipoHabData();
            List<TipoHabitacion> lista = th.listarTipoHabitaciones();
            int i;
            for(i=0; i<lista.size(); i++){
                jcbTipoHab.addItem(lista.get(i).getNombre());
            }
        }
    
    private void armarComboDisponibles(TipoHabitacion th) {    
   //TipoHabitacion tipoHabitacionSeleccionado = th.listarTipoHabitaciones().get(jcbTipoHab.getSelectedIndex());
   try { 
   HabitacionData hd = new HabitacionData();
    List<Habitacion> lista = hd.buscarHabitacionesDisponibles(jdcIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), jdcEgreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), th.getCodigo());
    //int i;
    //for (i = 0; i < lista.size(); i++) {
      //  jcbNumHab.addItem(lista.get(i).getNombre());
    //} 
    
        for (Habitacion habitacion : lista) {
        jcbNumHab.addItem(habitacion.getNombre());
        }
            
   } catch (NullPointerException e) {
       
   }
       
       
}

    
    private void eliminarReserva(int idReserva) {
    ReservaData reservaData = new ReservaData();
    reservaData.eliminarReserva(idReserva);
    
    }
    /* tratamos de arreglar*/
 }
