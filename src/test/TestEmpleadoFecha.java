
package test;
import dominio.Empleado;
import dominio.Fecha;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class TestEmpleadoFecha {
  public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        GregorianCalendar fActual= new GregorianCalendar();
        Date fA = new Date();
        Fecha fNacimiento;
        Fecha fIngreso;
        fActual.setTime(fA);
        Empleado empleado1;
        int anio, mes, dia;
        String nombre;
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = entrada.nextLine();
        System.out.println("Fecha de nacimiento");
        System.out.print("Anio: ");
        anio = entrada.nextInt();
        System.out.print("Mes: ");
        mes = entrada.nextInt();
        System.out.print("Dia: ");
        dia = entrada.nextInt();
        fNacimiento = new Fecha(anio, mes, dia);
        System.out.println("Fecha de ingreso a la empresa");
        System.out.print("Anio: ");
        anio = entrada.nextInt();
        System.out.print("Mes: ");
        mes = entrada.nextInt();
        System.out.print("Dia: ");
        dia = entrada.nextInt();
        fIngreso = new Fecha(anio, mes, dia);
        empleado1 = new Empleado(nombre, fNacimiento, fIngreso);
        System.out.println("------<>------");
        System.out.println("Fecha actual: "+fActual.get(Calendar.YEAR)+"/"+(fActual.get(Calendar.MONTH)+1)+"/"+fActual.get(Calendar.DAY_OF_MONTH));
        System.out.println("Datos Ingresados: ");
        empleado1.verDatos();
        
    }  
}
