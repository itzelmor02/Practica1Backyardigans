import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
			// Error al crear el archivo, por ejemplo, el archivo 
			// está actualmente abierto.
			e.printStackTrace();
		}
	}
	}


	public static void main(String[] args) {
	//	final String nombreDeArchivo = "src/Main/fciencias/empleados.csv";
		//crearArchivoCSVEmpleado(nombreDeArchivo,);
	}
}
