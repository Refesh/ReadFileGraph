package GraphFile;

import java.io.FileWriter;
import java.io.PrintWriter;

public class GraphSaver {
    public static void saveGraphFile(String fileName,int [] vec1){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(fileName);
            pw = new PrintWriter(fichero);
            for (int i = 0; i < vec1.length-1; i++){
                pw.print(vec1[i] + ",");
                
            }
            pw.print(vec1[vec1.length - 1]);
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero)
                    fichero.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
        }
    }
}
