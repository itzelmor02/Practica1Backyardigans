import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CrearCSV {
    

	private static void crearArchivoCSV(String nombreDeArchivo) {
		// this also can be "\t" for tab delimitador
		crearArchivoCSV(nombreDeArchivo, ",");
	}
    private static boolean isFileExists(File file) {
        return file.exists() && !file.isDirectory();
    }

	private static void crearArchivoCSV(String file, String delim) {
		final String NEXT_LINE = "\n";
        File nuevofile = new File(file);
        if(isFileExists(nuevofile)){
            try {
				
                FileWriter fw = new FileWriter(file,true);
                fw.append("prueba").append(delim);
				fw.append("325").append(NEXT_LINE);
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
		try {
            FileWriter fw = new FileWriter(file);

			fw.append("testing").append(delim);
			fw.append("123").append(NEXT_LINE);

			fw.append("value1");
			fw.append(delim);
			fw.append("312");
			fw.append(NEXT_LINE);

			fw.append("anotherthing,888\n");

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
		final String nombreDeArchivo = "archivo.csv";
		crearArchivoCSV(nombreDeArchivo);
	}

}