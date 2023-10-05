package Main;

import AccesoADatos.HuespedData;
import Entidades.Huesped;

class HotelIdealG81 {


    public static void main(String[] args) {
       HuespedData hd= new HuespedData();
       Huesped h= new Huesped();
       
       Huesped D = new Huesped ("Maria", "de las Calores", 00000011, "Colon 1232", "originalmariacalores@hotmail.com", 353478962, true);
       HuespedData hue = new HuespedData();
       
       //hd.GuardarHuesped(D);
       //hd.modificarHuesped(D);
       //hd.eliminarHuesped(8);
       //System.out.println(D.getIdHuesped());
  }
    
}