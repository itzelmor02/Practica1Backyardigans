package src.Main.fciencias;
import java.util.Scanner;
import src.Main.fciencias.Empleado;
import src.Main.fciencias.CrearCSVEmpleado;


public class Main {


  static Scanner sc = new Scanner(System.in);

  public static void Ingrsar_datos(){

    System.out.println("Digite su Nombre");
    String nombre = sc.next();
  }
  /**
   * Metodo para crear un nuevo empleado
   * @return
   */
  public static Empleado agregarEmpleado(){
    
    System.out.println("Digite su id");
    String id = sc.nextLine();
    System.out.println("Digite su nombre: ");
    String nombre = sc.nextLine();
    System.out.println("Digite su dirección: ");
    String direccion = sc.nextLine();
    System.out.println("Digite su correo electrónico: ");
    String correo = sc.nextLine();
    System.out.println("Digite su rol: ");
    String rol = sc.nextLine();
    System.out.println("Digite su Telefono: ");
    int telefono = sc.nextInt();
    System.out.println("Digite su sueldo: ");
    int sueldo = sc.nextInt();
    System.out.println("Digite su fecha de nacimiento en dd/mm/aaaa: ");
    String nacimiento = sc.next();
    
      Empleado empleado = new Empleado(id, nombre, direccion, correo, rol, telefono, sueldo, nacimiento);
    
      return empleado;
  
    
  }
    
  public static void main(final String[] args) {
   
   //Ingrsar_datos();
    //System.out.println("Hello, World!  ");

    //Empleado empleado = new Empleado("318","Josue","xochimilco","sistemas",55355,3600,"19/08/2002");
    Empleado empleado = agregarEmpleado();
    System.out.println("Nombre de empleado: "+empleado.getNombreEmpleado()+
                      "\nDireccion :"+empleado.getDireccionEmpleado()+
                      "\nCorreo electrónico: "+empleado.getCorreoEMpleado()+
                      "\nRol :"+ empleado.getRolEmpleado()+
                      "\nTelefono:"+empleado.getTelefonoEmpleado()+
                      "\nSueldo :"+empleado.getSueldoEmpleado()+
                      "\nNacimiento :"+empleado.getFechaNacimientoEmpleado()+"\n\n");

    System.out.println( empleado.toString()+"\n\n");
    String linea = empleado.cadenaEmpleado();//empleado datos
    System.out.println(linea);
    CrearCSVEmpleado csvempleado = new CrearCSVEmpleado();
    String nombreDeArchivo = "src/Main/fciencias/empleados.csv";
    csvempleado.crearArchivoCSVEmpleado(nombreDeArchivo,linea);
                      
  }
    
 /** String archCSV = "D:\\ISO-Codes.csv";
  CSVWriter writer = new CSVWriter(new FileWriter(archCSV));

writer.writeNext(pais);

writer.close();*/

}


