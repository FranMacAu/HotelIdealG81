package Main;

import AccesoADatos.HabitacionData;
import AccesoADatos.HuespedData;
import AccesoADatos.ReservaData;
import AccesoADatos.TipoHabData;
import Entidades.Habitacion;
import Entidades.Huesped;
import Entidades.Reserva;
import Entidades.TipoHabitacion;
import java.time.LocalDate;

class HotelIdealG81 {


    public static void main(String[] args) {
       
                        //  PRUEBAS PARA HUSPEDDATA
                        
//       HuespedData hd= new HuespedData();
//       Huesped h= new Huesped();
       
  //     Huesped D = new Huesped ("Nombre", "Apellido", 87553218, "Calle 123", "originalmariacalores@hotmail.com", 353478962, true);
       
 //      hd.GuardarHuesped(D);
//       
//       D.setApellido("Alto Apellido");
//       hd.modificarHuesped(D);
       
//       hd.eliminarHuesped();
//       System.out.println(D.getIdHuesped());
       
       
       
                        //  PRUEBAS PARA HABITACIONDATA
                        
 //   HabitacionData hd1 = new HabitacionData();
//    Habitacion h = new Habitacion();
//    
  //  Habitacion S = new Habitacion("12", 2, 2, true);
//    
  //  hd1.guardarHabitacion(S);       
//    
//    S.setNombre("nombre");
//    hd.modificarHabitacion(S);
//    
//    hd.eliminarHabitacion(S.getIdHabitacion());
    
    
    
                        //Prueba para ReservaData rd   
                        
    ReservaData rd= new ReservaData();
////    Reserva r= new Reserva();
//    
    Reserva R = new Reserva(40, 12, LocalDate.of(2023, 10, 31), LocalDate.of(2023, 11, 7), 80999.0, 0.0, true);//        
    rd.GuardarReserva(R);
////    
//    
    
  

                    // PRUEBAS TIPOHABDATA
                    
//    TipoHabData th = new TipoHabData();
//    TipoHabitacion t = new TipoHabitacion();
//    
//    TipoHabitacion T = new TipoHabitacion("Doble Luxury", 2, 1, "Queen", 85);
//    
//    th.guardarTipoHab(T);
//    th.cambiarPrecioPorTipo(T, 118.35);
//
//    TipoHabitacion ha=th.buscarTipoHab(2);
//    System.out.println("id: "+ha.getCodigo()+" nombre: "+ha.getNombre()+" capacidad: "+ha.getCapacidad()+
//            " tipo de camas: "+ha.getTipoCama()+" precio: "+ha.getPrecio());
//    
//    
    }
}