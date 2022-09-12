package src.Main.fciencias;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class CrearCSVEmpleado {
    
    
    public boolean isFileExists(File file) {
        return file.exists() && !file.isDirectory();
    }

	public void crearArchivoCSVEmpleado(String file,String empleado) {
		final String NEXT_LINE = "\n";
        File nuevofile = new File(file);
        if(isFileExists(nuevofile)){
            try {
				
                FileWriter fw = new FileWriter(file,true);
                fw.append(empleado);
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
		try {
            FileWriter fw = new FileWriter(file);

			fw.append(empleado);

			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	}
    
    public LinkedList<Empleado> listaEmpleado(String file){
        LinkedList<Empleado> auxiliar = new LinkedList<>();
        try {
            FileReader read = new FileReader(file);
            BufferedReader bufer = new BufferedReader(read);
            String temp =" ";
            int contador = 0;
            while(temp!=null){
                temp = bufer.readLine();
                String x = temp;
                if(temp!=null){
                    String[] arrSplit = x.split(",");
                    /*crea a los objetos Empleados */
                    Empleado e = new Empleado(arrSplit[0],
                                        arrSplit[1],
                                        arrSplit[2],
                                        arrSplit[3],
                                        arrSplit[4],
                                        Integer.parseInt(arrSplit[5]),
                                        Integer.parseInt(arrSplit[6]),
                                        arrSplit[7]);
                    auxiliar.add(e);
                    
                }
                contador++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return auxiliar;
    }

    public void cargaArchvo(LinkedList<Empleado> empleados, String file){
        File nuevofile = new File(file);
        if(isFileExists(nuevofile)){
            try {
				
                FileWriter fw = new FileWriter(file);
                for(int i=0;i<empleados.size();i++){
                    fw.append(empleados.get(i).cadenaEmpleado());
                }
                
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
		System.out.println("no es posible realizar estaacción");
	}
    }



	public static void main(String[] args) {
	//	final String nombreDeArchivo = "src/Main/fciencias/empleados.csv";
		//crearArchivoCSVEmpleado(nombreDeArchivo,);
	}
}
