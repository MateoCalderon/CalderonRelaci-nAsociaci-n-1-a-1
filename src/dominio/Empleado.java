
package dominio;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {
   private String nombre;
    private Fecha fechaN;
    private Fecha fechaI;
    private Fecha edadE;
    private Fecha tiempoE;

    public Empleado(String nombre, Fecha fechaN, Fecha fechaI) {
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.fechaI = fechaI;
    
        
        
    }

    public Fecha getEdadE() {
        return edadE;
    }

    public Fecha getTiempoE() {
        return tiempoE;
    }

    public Empleado(Fecha edadE, Fecha tiempoE) {
        this.edadE = edadE;
        this.tiempoE = tiempoE;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFechaN() {
        return fechaN;
    }

    public Fecha getFechaI() {
        return fechaI; 
}

    public void verDatos(){
       GregorianCalendar fActual= new GregorianCalendar();
       Date fA = new Date();
       fActual.setTime(fA);
        int anioE,mesE,diaE;
        anioE=fActual.get(Calendar.YEAR)-fechaN.getAnio();
        mesE=(fActual.get(Calendar.MONTH)+1)-fechaN.getMes();
        diaE=fActual.get(Calendar.DAY_OF_MONTH)-fechaN.getDia();
        if(mesE< 0 || (mesE == 0 && diaE < 0)) {
        anioE--;
        }
        if((mesE == 0 && diaE < 0) || (mesE < 0 && diaE == 0) || (mesE < 0 && diaE < 0)) {
        mesE+= 11;
        }else if (mesE < 0 && diaE > 0) {
        mesE+= 12;
        }else if (mesE > 0 && diaE < 0) {
        mesE--;
        }
        if (diaE < 0) {
        diaE+= 31;
        }
        int anioT,mesT,diaT;
        anioT=fActual.get(Calendar.YEAR)-fechaI.getAnio();
        mesT=(fActual.get(Calendar.MONTH)+1)-fechaI.getMes();
        diaT=fActual.get(Calendar.DAY_OF_MONTH)-fechaI.getDia();
        if(mesT< 0 || (mesT == 0 && diaT < 0)) {
        anioT--;
        }
        if((mesT == 0 && diaT < 0) || (mesT < 0 && diaT == 0) || (mesT < 0 && diaT < 0)) {
        mesT+= 11;
        }else if (mesT < 0 && diaT > 0) {
        mesT+= 12;
        }else if (mesT > 0 && diaT < 0) {
        mesT--;
        }
        if (diaT < 0) {
        diaT+= 31;
        }
       System.out.println("Nombre: "+this.nombre);
       System.out.println("Fecha nacimiento:"+fechaN.getAnio()+"/"+fechaN.getMes()+"/"+fechaN.getDia());
       System.out.println("Edad Empleado:"+anioE+" años "+mesE+" meses "+diaE+" dias ");
       System.out.println("Fecha ingreso:"+fechaI.getAnio()+"/"+fechaI.getMes()+"/"+fechaI.getDia());
       System.out.println("Tiempo en la empresa:"+anioT+" años "+mesT+" meses "+diaT+" dias ");
    }
//   @Override
//    public String toString(){
//        return this.nombre+"\n"+this.getFechaN()+"\n"+this.fechaI;
//    }
}