package Main;

import AccesoADatos.HabitacionData;
import AccesoADatos.HuespedData;
import Entidades.Habitacion;
import Entidades.Huesped;

class HotelIdealG81 {


    public static void main(String[] args) {
       
                        //  PRUEBAS PARA HUSPEDDATA
                        
//       HuespedData hd= new HuespedData();
//       Huesped h= new Huesped();
//       
//       Huesped D = new Huesped ("Nombre", "Apellido", 98653287, "Calle 123", "originalmariacalores@hotmail.com", 353478962, true);
//       
//       hd.GuardarHuesped(D);
//       
//       D.setApellido("Alto Apellido");
//       hd.modificarHuesped(D);
       
       //hd.eliminarHuesped();
       //System.out.println(D.getIdHuesped());
       
                        //  PRUEBAS PARA HABITACIONDATA
                        
    HabitacionData hd = new HabitacionData();
    Habitacion h = new Habitacion();
    
    Habitacion S = new Habitacion("Serena", 2, 2, true);
    
    hd.guardarHabitacion(S);        // Arroja una excepción, a revisar
    
    
    
   // ReservaData rd   
       
  }

    public HotelIdealG81() {
    }
    
}