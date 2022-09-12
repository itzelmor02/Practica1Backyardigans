package src.Main.fciencias;

import java.util.LinkedList;
import java.util.Scanner;

public class MetodosArchivoEmpleado {

    /**
     * Método para agregar un empleado, si existe el archivo lo agrega, si no existe lo crea y agrega.
     * @return el empleado
     */
    public void agregarEmpleado(){
        Scanner sc = new Scanner(System.in);
        CrearCSVEmpleado csvempleado = new CrearCSVEmpleado();
        String nombreDeArchivo = "src/Main/fciencias/empleados.csv";

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
        String linea = empleado.cadenaEmpleado();
        csvempleado.crearArchivoCSVEmpleado(nombreDeArchivo,linea);//crea el archivo y si ya existe lo agrega
        
    }
    
    /**
     * Metodo que elimina a un empleado por su id.
     * @param ID el id del empleado.
     * @param file el archivo csv de empleados
     */
    public void eliminaEmpleadoPorId(String ID, String file){
        CrearCSVEmpleado csvempleado = new CrearCSVEmpleado();
        LinkedList<Empleado>  empleados = csvempleado.listaEmpleado(file);
        /*recorrera la lista de los empleados hasta hacer match con el que coincida el Id */
        for(int i=0; i<empleados.size(); i++){  
            String id = empleados.get(i).getIdEmpleado();
            if(ID.equals(id)){
                empleados.remove(i);                
            }
        }
        
        csvempleado.cargaArchvo(empleados, file);
    }

    /**
     * Metodo que modifica puede modificar nombre, dirección, correo, rol
     * teléfono, sueldo y fecha de nacimiento.
     * @param ID el id del empleado a modificar.
     * @param Modificax lo que se quiere modificar.(Nombre, Direccion, Correo, Rol, etc)
     * @param valor el nuevo por el que se cambiará.
     * @param file el nombre del archivo.
     */
    public void modificaEmpleadoPorId(String ID,String Modificax,String valor, String file){
        CrearCSVEmpleado csvempleado = new CrearCSVEmpleado();
        LinkedList<Empleado>  empleados = csvempleado.listaEmpleado(file);

        int empleado = 0;
        for(int i=0; i<empleados.size(); i++){
            String id = empleados.get(i).getIdEmpleado();
            if(ID.equals(id)){
                empleado = i;
                break;
            }
        }
        switch(Modificax){
            case "Nombre":
                empleados.get(empleado).setNombreEmpleado(valor);
                break;
            case "Direccion":
                empleados.get(empleado).setDireccionEmpleado(valor);
                break;
            case "Correo":
                empleados.get(empleado).setCorreoEmpleado(valor);
                break;
            case "Rol":
                empleados.get(empleado).setRolEmpleado(valor);
                break;
            case "Telefono":
            empleados.get(empleado).setTelefonoEmpleado(Integer.parseInt(valor));
                break;
            case "Sueldo":
                empleados.get(empleado).setSueldoEmpleado(Integer.parseInt(valor));
                break;
            case "Fecha":
                empleados.get(empleado).setFechaNacimientoEmpleado(valor);
                break;
            default:
            System.out.println("No se pudo modificar el empleado, verifica el Id");
        }
        csvempleado.cargaArchvo(empleados, file);
    }

    /**
     * Método que buscara los empleados con valor solicitado.
     * @param buscaEn valor que se buscara.
     * @param valor valor que se buscara entre los empleados.
     * @param file nombre del archivo.
     */
    public void contieneEmpleado(String buscaEn, String valor, String file){
        CrearCSVEmpleado csvempleado = new CrearCSVEmpleado();
        LinkedList<Empleado>  empleados = csvempleado.listaEmpleado(file);

        switch(buscaEn){
            case "Id":
                break;
            case "Nombre":

                for(int i=0; i<empleados.size(); i++){
                    if(valor.equals(empleados.get(i).getNombreEmpleado())){
                        System.out.println(empleados.get(i));
                    }
                }
                break;
            case "Direccion":
                for(int i=0; i<empleados.size(); i++){
                    if(valor.equals(empleados.get(i).getDireccionEmpleado())){
                        System.out.println(empleados.get(i));
                    }
                }    
            
                break;
            case "Correo":
                for(int i=0; i<empleados.size(); i++){
                    if(valor.equals(empleados.get(i).getCorreoEMpleado())){
                        System.out.println(empleados.get(i));
                    }
                }
                break;
            case "Rol":
                for(int i=0; i<empleados.size(); i++){
                    if(valor.equals(empleados.get(i).getRolEmpleado())){
                        System.out.println(empleados.get(i));
                    }
                }
                break;
            case "Telefono":
                for(int i=0; i<empleados.size(); i++){
                    if(Integer.parseInt(valor) == (empleados.get(i).getTelefonoEmpleado())){
                        System.out.println(empleados.get(i));
                        break;
                    }
                }
                break;
            case "Sueldo":
                for(int i=0; i<empleados.size(); i++){
                    if(Integer.parseInt(valor) == empleados.get(i).getSueldoEmpleado()){
                        System.out.println(empleados.get(i));
                    }
                }
                break;
            case "Fecha":
                for(int i=0; i<empleados.size(); i++){
                    if(valor.equals(empleados.get(i).getFechaNacimientoEmpleado())){
                        System.out.println(empleados.get(i));
                    }
                }
                break;
            default:
            System.out.println("No se pudo modificar el empleado, verifica el Id");
            return;
        }        
    }

    /**
     * Método que imprime todos los emplados en el archivo.
     * @param file el nombre del archivo
     */
    public void imprimeEmpleados(String file){
        CrearCSVEmpleado csvempleado = new CrearCSVEmpleado();
        LinkedList<Empleado>  empleados = csvempleado.listaEmpleado(file);
        for(int i=0; i<empleados.size();i++){
            System.out.println(empleados.get(i));
        }
    }


}
