package GraphFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GraphLoader {
    public static int[] loadGraphFile(String fileName){
        FileReader read = null;
        BufferedReader br = null;
                
        String [] s = new String[1];
        try { 
            
            read = new FileReader(fileName);
            br = new BufferedReader(read);
            s = br.readLine().split(",");
            br.close();
            read.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        int[] res = stringMatrixToInt(s);
        return res;
        
    }
    
    private static int [] stringMatrixToInt(String [] s){
        
        int[] res = new int[s.length];
        for(int i  = 0 ; i < s.length ; i++){
            res [i] = Integer.parseInt(s[i]);
        }
        return res;
    }
}
