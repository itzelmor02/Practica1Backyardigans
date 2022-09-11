package src.Main.fciencias;


/**
 * Clase para representar a los Empleados, un empleado tiene, id, nombre, dirección, correo, rol,
 *  telefono,sueldo y fecha de nacimiento.
 */
public class Empleado {

    /*id del Empleado. */
    private String idEpleado;
    /*Nombre del empleado. */
    private String nombre;
    /*Direccion del empleado. */
    private String dirección;
    /*Correo electronico del empleado. */
    private String correo;
    /*Rol del empleado. */
    private String rol;
    /*Telefono del empleado. */
    private int telefono;
    /*Sueldo del empleado. */
    private int sueldo;
    /*Fecha de nacimiento del empleado. */
    private String fechNacimiento;


    /**
     * Define el estado inicial del empleado.
     * @param idEmpleado id del empleado.
     * @param nombre el dombre del emplado.
     * @param direccion la direccion del empleado.
     * @param correo el correo electrónico del empleado.
     * @param rol el rol del empleado.
     * @param telefono el telefono del empleado.
     * @param sueldo el sueldo del empleado.
     * @param fechNacimiento fecha de nacimiento del empleado.
     */
    public Empleado(String idEmpleado,
                    String nombre,
                    String direccion,
                    String correo,
                    String rol,
                    int telefono,
                    int sueldo,
                    String fechNacimiento ){
                        
        this.idEpleado = idEmpleado; 
        this.nombre = nombre;
        this.dirección = direccion;
        this.correo = correo;
        this.rol = rol;
        this.telefono = telefono;
        this.sueldo = sueldo;
        this.fechNacimiento = fechNacimiento;
    }

    /**
     * Regresa el id del empleado.
     * @return el id del empleado.
     */
    public String getIdEmpleado(){
        return idEpleado;
    }

    /**
     * Define el id del emlpeado.
     * @param id el nuevo id del empleado.
     */
    public void setIdNombre(String id){
        this.idEpleado = id;

    }
    
    /**
     * Regresa el nombre del empleado.
     * @return el nombre del empleado.
     */
    public String getNombreEmpleado(){
        return nombre;
    }

    /**
     * Define el nombre del empleado.
     * @param Nombre el nuevo nombre del empleado.
     */
    public void setNombreEmpleado(String Nombre){
        this.nombre = Nombre;
    }

    /**
     * Regresa la dirección del empleado.
     * @return la direccion del empleado.
     */
    public String getDireccionEmpleado(){
        return dirección;
    }

    /**
     * Define la direccion del empleado.
     * @param Direccion la nueva direccion del empleado.
     */
    public void setDireccionEmpleado(String Direccion){
        this.dirección = Direccion;
    }

    /**
     * Regresa el correo del empleado.
     * @return el correo del empleado.
     */
    public String getCorreoEMpleado(){
        return correo;
    }

    /**
     * Define el correo del empleado.
     * @param Correo el nuevo correo del empleado.
     */
    public void setCorreoEmpleado(String Correo){
        this.correo = Correo;
    }

    /**
     * Regresa el rol del empleado.
     * @return el rol del emppleado.
     */
    public String getRolEmpleado(){
        return rol;
    }

    /**
     * Define el rol del empleado.
     * @param Rol el nuevo rol del empleado.
     */
    public void setRolEmpleado(String Rol){
        this.rol = Rol;
    }

    /**
     * Regresa el telefono del empleado.
     * @return
     */
    public int getTelefonoEmpleado(){
        return telefono;
    }

    /**
     * Define el telefono del empleado.
     * @param Telefono el nuevo telefono del empleado.
     */
    public void setTelefonoEmpleado(int Telefono){
        this.telefono = Telefono;
    }

    /**
     * Regresa el sueldo del empleado.
     * @return el sueldo del empleado.
     */
    public int getSueldoEmpleado(){
        return sueldo;
    }

    /**
     * Define el sueldo del empleado.
     * @param Sueldo el nuevo sueldo del empleado.
     */
    public void setSueldoEmpleado(int Sueldo){
        this.sueldo = Sueldo;
    }

    /**
     * Regresa la fecha de nacimeinto del empleado.
     * @return la fehca de nacimiento del empleado.
     */
    public String getFechaNacimientoEmpleado(){
        return fechNacimiento;
    }

    /**
     * Define la fehca de nacimiento del empleado.
     * @param fecha la nueva fecha de nacimeinto del empleado.
     */
    public void setFechaNacimientoEmpleado(String fecha){
        this.fechNacimiento = fecha;
    }
    

}
