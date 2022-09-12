package src.Main.fciencias;
/**
 * Clase para repreentar plantas. una planta tiene id, nombre, género, precio,
 * cuidado, tipo, sustrato, fecha de germinación.
 */
public class Planta {
    
    String idPlanta;
    String nombre;
    String genero;
    int precio;
    String cuidado;
    String tipo;//luz o sombra
    String sustrato;
    String fechaGerminacion;


    public Planta(  String idPlanta,
                    String nombre,
                    String genero,
                    int precio,
                    String cuidado,
                    String tipo,
                    String sustrato,
                    String fechaGerminacion){

        this.idPlanta = idPlanta;
        this.nombre = nombre;
        this.genero = genero;
        this.precio = precio;
        this.cuidado = cuidado;
        this.tipo = tipo;
        this.sustrato = sustrato;
        this.fechaGerminacion = fechaGerminacion;

    }

    public String getIdPlanta(){
        return idPlanta;
    }
    public void setIdPlanta(String ID){
        this.idPlanta = ID;
    }

    public String getNombrePlanta(){
        return nombre;
    }
    public void setNombrePlanta(String Nombre){
        this.nombre = Nombre;
    }

    public String getGeneroPlanta(){
        return genero;
    }
    public void setGeneroPlanta(String Genero){
        this.genero = Genero;
    }

    public int getPrecioPlnata(){
        return precio;
    }
    public void setPrecioPlanta(int Precio){
        this.precio = Precio;
    }

    public String getCuidadoPlanta(){
        return cuidado;
    }
    public void setCuidadoPlanta(String Cuidado){
        this.cuidado = Cuidado;
    }
    public String getTipoPlanta(){
        return tipo;
    }
    public void setTipoPlanta(String Tipo){
        this.tipo = Tipo;
    }
    public String getSustratoPlanta(){
        return sustrato;
    }
    public void setSustratoPlanta(String Sustrato){
        this.sustrato = Sustrato;
    }
    public String getFechaGerminacionPlanta(){
        return fechaGerminacion;
    }
    public void setFechaGerminacionPlanta(String Fecha){
        this.fechaGerminacion = Fecha;
    }

}
