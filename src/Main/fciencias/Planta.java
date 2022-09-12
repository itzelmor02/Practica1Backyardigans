package Main.fciencias;

/**
 * Clase para repreentar plantas. una planta tiene id, nombre, género, precio,
 * cuidado, tipo, sustrato, fecha de germinación.
 */
public class Planta {
    
    String idPlanta;
    String nombre;
    String genero;
    String precio;
    String cuidado;
    String tipo;//luz o sombra
    String sustrato;
    String fechaGerminacion;
    String riego;


    public Planta(  String idPlanta,
                    String nombre,
                    String genero,
                    String precio,
                    String cuidado,
                    String tipo,
                    String sustrato,
                    String fechaGerminacion,
                    String riego){

        this.idPlanta = idPlanta;
        this.nombre = nombre;
        this.genero = genero;
        this.precio = precio;
        this.cuidado = cuidado;
        this.tipo = tipo;
        this.sustrato = sustrato;
        this.fechaGerminacion = fechaGerminacion;
        this.riego = riego;

    }

    public String getIdPlanta(){
        return this.idPlanta;
    }
    public void setIdPlanta(String ID){
        this.idPlanta = ID;
    }

    public String getNombrePlanta(){
        return this.nombre;
    }
    public void setNombrePlanta(String Nombre){
        this.nombre = Nombre;
    }

    public String getGeneroPlanta(){
        return this.genero;
    }
    public void setGeneroPlanta(String Genero){
        this.genero = Genero;
    }

    public String getPrecioPlnata(){
        return this.precio;
    }
    public void setPrecioPlanta(String Precio){
        this.precio = Precio;
    }

    public String getCuidadoPlanta(){
        return this.cuidado;
    }
    public void setCuidadoPlanta(String Cuidado){
        this.cuidado = Cuidado;
    }
    public String getTipoPlanta(){
        return this.tipo;
    }
    public void setTipoPlanta(String Tipo){
        this.tipo = Tipo;
    }
    public String getSustratoPlanta(){
        return this.sustrato;
    }
    public void setSustratoPlanta(String Sustrato){
        this.sustrato = Sustrato;
    }
    public String getFechaGerminacionPlanta(){
        return this.fechaGerminacion;
    }
    public void setFechaGerminacionPlanta(String Fecha){
        this.fechaGerminacion = Fecha;
    }
    public String getRiego(){
        return this.riego;
    }
    public void setRiego(String riego){
        this.riego = riego;
    }

    public String toString(){
        String cadena = String.format(
                        "Nombre                 : %s\n"+
                        "Género                 : %s\n"+
                        "Precio                 : %s\n"+
                        "Cuidado                : %s\n"+
                        "Tipo                   : %s\n"+
                        "Sustrato               : %s\n"+
                        "fecha de germinacoión  : %s\n"+
                        "Riego                  :%s\n",
                        nombre, genero, precio, cuidado, tipo, sustrato, fechaGerminacion, riego);
        return cadena;
    }

    public String cadenaPlanta(){
        String cadena = String.format(
                        nombre+","+
                        genero+","+
                        precio+","+
                        cuidado+","+
                        tipo+","+
                        sustrato+","+
                        fechaGerminacion+
                        riego+"\n");
        return cadena;
    }
}
    
