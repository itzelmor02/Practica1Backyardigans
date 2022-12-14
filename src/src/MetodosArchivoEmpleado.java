package src;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

public class MetodosArchivoEmpleado {

    Scanner sc = new Scanner(System.in);

    public String validaIdEmpleado(){
        CrearCSVEmpleado csvempleado = new CrearCSVEmpleado();
        LinkedList<Empleado>  empleados = csvempleado.listaEmpleado("src/src/empleados.csv");
        System.out.println("Digite su Id:");
        String Id = sc.nextLine();
        boolean existe = false;
        for(int i=0; i<empleados.size(); i++){
            if(Id.equals(empleados.get(i).getIdEmpleado())){
                existe = true;
            }
        }
        if(Id!=""){
            if(existe==false){
                return Id;
            }else{
                System.out.println("El Id ya existe, eliga otro.");
                Id = validaIdEmpleado();
            }
            
        }else{
            System.out.println("No de puede dejar el Id vacío.");
            Id = validaIdEmpleado();
        }
        return Id;
    }

    /**
     * Método que valida el nombre del empleado.
     * @return el nombre del empleado.
     */
    public String validaNombreEmpleado(){
        System.out.println("Digite su nombre:");
        String nombre = sc.nextLine();
        if(nombre!=""){
            return nombre;
        }else{
            System.out.println("No de puede dejar el nombre vacío.");
            nombre = validaNombreEmpleado();
        }
        return nombre;
    }

    /**
     * Método que valida la dirección del empleado.
     * @return la dirección del empleado.
     */
    public String validaDireccionEmpleado(){
        System.out.println("Digite su dirección:");
        String direccion = sc.nextLine();
        if(direccion!=""){
            if(direccion.contains(",")){
                System.out.println("No se deben poner comas en la dirección.");
                direccion = validaDireccionEmpleado();
            }else{
                return direccion;
            }
            
        }else{
            System.out.println("No de puede dejar la direccion vacía.");
            direccion = validaDireccionEmpleado();
        }
        return direccion;
    }

    /**
     * Método para validar el correo electrónico.
     * @return el correo electrónico.
     */
    public String validaCorreoEmpleado(){
        System.out.println("Digite su correo electrónico:");
        String correo = sc.nextLine();
        if(correo!=""){
            if(correo.contains("@ciencias.unam.mx") ||
                        correo.contains("@gmail.com") ||
                        correo.contains("@hotmail.com") ||
                        correo.contains("@outlook.com.es") ||
                        correo.contains("@adinet.com.uy") ||
                        correo.contains("@vera.com.uy")){

                return correo;
            }else{
                
                System.out.println("Su dominio no existe, intente nuevamente.");
                correo = validaCorreoEmpleado();
            }
            
        }else{
            System.out.println("No de puede dejar la correo vacío.");
            correo = validaCorreoEmpleado();
        }
        return correo;
    }

    /**
     * Método para validar el rol del empleado.
     * @return el rol del empleado
     */
    public String validaRolEmpleado(){
        System.out.println("Digite su rol:");
        String rol = sc.nextLine();
        if(rol!=""){
            if(rol.contains("Gerente del vivero") ||
                        rol.contains("Cuidador de plantas") ||
                        rol.contains("Encargado de mostrar las plantas") ||
                        rol.contains("Cajero del vivero")){

                return rol;
            }else{
                System.out.println("Su rol no existe, los roles existentes son :\nGerente del vivero.\n"+
                                                                                "Cuidador de plantas.\n"+
                                                                                "Encargado de mostrar las plantas.\n"+
                                                                                "Cajero del vivero.");
                rol = validaRolEmpleado();
            }
            
        }else{
            System.out.println("No de puede dejar la rol vacío.");
            rol = validaRolEmpleado();
        }
        return rol;
    }

    /**
     * Método que valida un número telefonico de 10 dígitos
     * @return el número telefónico.
     */
    public String validaTelefonoEmpleado(){
        System.out.println("Digite su número telefónico:");
        String telefono = sc.nextLine();
        int te = telefono.length();
        if(telefono.matches("[+-]?\\d*(\\.\\d+)?")){
            if(te == 10){
                return telefono;
            }else{
                System.out.println("El número debe contener 10 dígitos.");
                telefono = validaTelefonoEmpleado();
            }            
        }else{
            System.out.println("El número no es valido, deben ser datos numericos");
            telefono = validaTelefonoEmpleado();
        }
        return telefono;

    }

    /**
     * Método para validar el sueldo del empleado.
     * @return sueldo del empleado.
     */
    public String validaSueldoEmpleado(){
        System.out.println("Digite su sueldo:");
        String sueldo = sc.nextLine();
        if(sueldo!=""){
            if(sueldo.matches("[+-]?\\d*(\\.\\d+)?")){
                return sueldo;
            }else{
                System.out.println("El sueldo debe ser tipo numérico");
                sueldo = validaSueldoEmpleado();
            }
            
        }else{
            System.out.println("No de puede dejar el sueldo vacío.");
            sueldo = validaSueldoEmpleado();
        }
        return sueldo;
    }

    /**
     * Método que valida la fecha de nacimiento del empleado.
     * @return la fecha de nacimiento del empleado.
     */
    public String validaFechaEmpleado(){
        String dia = "";
        try {
            System.out.println("Digite la fecha en formato dd/mm/aaaa");
            dia = sc.nextLine();
            String[] arr = dia.split("/");      
            LocalDate hoy = LocalDate.parse(arr[2]+"-"+arr[1]+"-"+arr[0]);
            return dia;
        } catch (Exception e) {
            System.out.println("la fehca debe ser formato dd/mm/aaaa");
            dia = validaFechaEmpleado();
        }
        return dia;
    }
    /**
     * Método para agregar un empleado, si existe el archivo lo agrega, si no existe lo crea y agrega.
     * @return el empleado
     */
    public void agregarEmpleado(){
        
        CrearCSVEmpleado csvempleado = new CrearCSVEmpleado();
        String nombreDeArchivo = "src/Main/fciencias/empleados.csv";

        String id = validaIdEmpleado();
        String nombre = validaNombreEmpleado();
        String direccion = validaDireccionEmpleado();
        String correo = validaCorreoEmpleado();
        String rol = validaRolEmpleado();
        String telefono = validaTelefonoEmpleado();
        String sueldo = validaSueldoEmpleado();
        String nacimiento = validaFechaEmpleado();
        
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
        int contador = 0;
        for(int i=0; i<empleados.size(); i++){  
            String id = empleados.get(i).getIdEmpleado();
            if(ID.equals(id)){
                empleados.remove(i);
                break;
            }
            contador++;
        }
        if(contador==empleados.size()){
            System.out.println("No se encontró al empleado con el Id "+ID);
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
        int contador = 0;
        for(int i=0; i<empleados.size(); i++){
            String id = empleados.get(i).getIdEmpleado();
            if(ID.equals(id)){
                empleado = i;
                break;
            }
            contador++;
        }
        if(contador==empleados.size()){
            System.out.println("No se encontró el Id "+ ID);
            return;
        }
        switch(Modificax){
            case "Nombre":
                valor = validaNombreEmpleado();
                empleados.get(empleado).setNombreEmpleado(valor);
                break;
            case "Direccion":
                valor = validaDireccionEmpleado();
                empleados.get(empleado).setDireccionEmpleado(valor);
                break;
            case "Correo":
                valor = validaCorreoEmpleado();
                empleados.get(empleado).setCorreoEmpleado(valor);
                break;
            case "Rol":
                valor = validaRolEmpleado();
                empleados.get(empleado).setRolEmpleado(valor);
                break;
            case "Telefono":
                valor = validaTelefonoEmpleado();
                empleados.get(empleado).setTelefonoEmpleado(valor);
                break;
            case "Sueldo":
                valor = validaSueldoEmpleado();
                empleados.get(empleado).setSueldoEmpleado(valor);
                break;
            case "Fecha":
                valor = validaFechaEmpleado();
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
                boolean val0 = false;
                for(int i=0; i<empleados.size(); i++){
                    if(empleados.get(i).getIdEmpleado().contains(valor)){
                        System.out.println(empleados.get(i));
                        val0 = true;
                    }
                }
                if(val0==true){break;}else{System.out.println("No se encontró el Id: "+valor);}
                break;
            case "Nombre":
                boolean val = false;
                for(int i=0; i<empleados.size(); i++){
                    if(empleados.get(i).getNombreEmpleado().contains(valor)){
                        System.out.println(empleados.get(i));
                        val = true;
                    }
                }
                if(val==true){break;}else{System.out.println("No se encontró el nombre: "+valor);}
                break;
            case "Direccion":
                boolean val1 = false;
                for(int i=0; i<empleados.size(); i++){
                    if(valor.equals(empleados.get(i).getDireccionEmpleado())){
                        System.out.println(empleados.get(i));
                        val1 = true;
                    }
                }
                if(val1){break;}else{System.out.println("No se encontró la dirección: "+valor);}
            
                break;
            case "Correo":
                boolean val2 = false;
                for(int i=0; i<empleados.size(); i++){
                    if(valor.equals(empleados.get(i).getCorreoEMpleado())){
                        System.out.println(empleados.get(i));
                        val2 = true;
                    }
                }
                if(val2){break;}else{System.out.println("No se encontró el correo: "+valor);}
                break;
            case "Rol":
                boolean val3 = false;
                for(int i=0; i<empleados.size(); i++){
                    if(valor.equals(empleados.get(i).getRolEmpleado())){
                        System.out.println(empleados.get(i));
                        val3 = true;
                    }
                }
                if(val3){break;}else{System.out.println("No se encontró el rol: "+valor);}
                break;
            case "Telefono":
                boolean val4 = false;
                for(int i=0; i<empleados.size(); i++){
                    if(valor.equals(empleados.get(i).getTelefonoEmpleado())){
                        System.out.println(empleados.get(i));
                        val4 =true;
                        break;
                    }
                }
                if(val4){break;}else{System.out.println("No se encontró el teléfono: "+valor);}
                break;
            case "Sueldo":
                boolean val5 = false;
                for(int i=0; i<empleados.size(); i++){
                    if(valor.equals(empleados.get(i).getSueldoEmpleado())){
                        System.out.println(empleados.get(i));
                        val5 = true;
                    }
                }
                if(val5){break;}else{System.out.println("No se encontró el sueldo de: "+valor);}
                break;
            case "Fecha":
                boolean val6 = false;
                for(int i=0; i<empleados.size(); i++){
                    if(valor.equals(empleados.get(i).getFechaNacimientoEmpleado())){
                        System.out.println(empleados.get(i));
                        val6 = true;
                    }
                }
                if(val6){break;}else{System.out.println("No se encontró el nombre: "+valor);}
                break;
            default:
            System.out.println("No se pudo encontrar al empleado, verifica el valor de tu busqueda");
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
