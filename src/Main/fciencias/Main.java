package Main.fciencias;
import java.sql.Date;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;
import Main.fciencias.Empleado;
import Main.fciencias.CrearCSVEmpleado;
import Main.fciencias.MetodosArchivoEmpleado;

public class Main {


  static Scanner sc = new Scanner(System.in);

  public static void limpiaTerminal(){
    try {
      System.out.println("\033[H\033[2J");
      System.out.flush();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  
  
    
  public static void main(final String[] args) {
   
    CrearCSVEmpleado csvempleado = new CrearCSVEmpleado();
    String nombreDeArchivo = "src/Main/fciencias/empleados.csv";
        
    System.out.println("\n\n\n");

    //----------------------------------------------------------------------------------------------------
    LinkedList<Empleado> listaEmp = csvempleado.listaEmpleado(nombreDeArchivo); //carga el archivo en una lista de empleados
    
    MetodosArchivoEmpleado metodo = new MetodosArchivoEmpleado();
    String file = "src/Main/fciencias/empleados.csv";
    limpiaTerminal();
    
    /**para el numero telefonico */
    //String telefono = "5535541645";
    
    
    

    
    while(true){
      System.out.println("Digita la opcion que deseas realizar\n"+
                        "[1] Agregar un Nuevo Empleado.\n"+
                        "[2] Buscar un empleado.\n"+
                        "[3] Eliminar un empleado.\n"+
                        "[4] Modificar a un empleado.\n"+
                        "[5] Ver a todos los empleados.\n"+
                        "[6] Salir.");
              int opcion = sc.nextInt();
      switch(opcion){
        case 1:
                metodo.agregarEmpleado();
          break;
        case 2: 
                sc.nextLine();
                System.out.println("Digite por cuál valor desea buscar(Id,Nombre,Direccion,Correo,Rol,Telefono,Sueldo,Fecha)");
                String buscaEn = sc.nextLine();
                System.out.println("digite el valor que desa buscar en "+buscaEn);
                String valor = sc.nextLine();
                
                metodo.contieneEmpleado(buscaEn, valor, file);
          break;
        case 3:
                System.out.println("Digite el Id del empleado a eliminar");
                String id = sc.next();
                metodo.eliminaEmpleadoPorId(id, file);
          break;
        case 4:
                sc.nextLine();
                System.out.println("Digite el Id del empleado a modificar.");
                String ID = sc.nextLine();
                System.out.println("Digite el campo que desea modificar(Nombre,Direccion,Correo,Rol,Telefono,Sueldo,Fecha)");
                String Modificax = sc.nextLine();
                System.out.println("Digite el nuevo valor del campo "+ Modificax);
                String valor2 = sc.nextLine();
                metodo.modificaEmpleadoPorId(ID, Modificax, valor2, file);
          break;
        case 5:
                metodo.imprimeEmpleados(file);
          break;
        case 6:
          return;
      }
    }




  }
}


