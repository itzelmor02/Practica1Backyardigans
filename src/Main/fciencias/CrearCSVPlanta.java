package Main.fciencias;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class CrearCSVPlanta {
    
    
    public boolean isFileExists(File file) {
        return file.exists() && !file.isDirectory();
    }

	public void crearArchivoCSVPlanta(String file,String planta) {
		final String NEXT_LINE = "\n";
        File nuevofile = new File(file);
        if(isFileExists(nuevofile)){
            try {
				
                FileWriter fw = new FileWriter(file,true);
                fw.append(planta);
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
		try {
            FileWriter fw = new FileWriter(file);

			fw.append(planta);

			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	}
    
    public LinkedList<Planta> listaPlanta(String file){
        LinkedList<Planta> auxiliar = new LinkedList<>();
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
                    /*crea a los objetos Plantas */
                    Planta e = new Planta(arrSplit[0],
                                        arrSplit[1],
                                        arrSplit[2],
                                        arrSplit[3],
                                        arrSplit[4],
                                        arrSplit[5],
                                        arrSplit[6],
                                        arrSplit[7],
                                        arrSplit[8]);
                    auxiliar.add(e);
                    
                }
                contador++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return auxiliar;
    }

    public void cargaArchvo(LinkedList<Planta> plantas, String file){
        File nuevofile = new File(file);
        if(isFileExists(nuevofile)){
            try {
				
                FileWriter fw = new FileWriter(file);
                for(int i=0;i<plantas.size();i++){
                    fw.append(plantas.get(i).cadenaPlanta());
                }
                
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
		System.out.println("no es posible realizar estaacción");
	}
    }
}
