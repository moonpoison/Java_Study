package Exception;

import java.io.*;

public class Ex1 {
    public static void main(String[] args) {
        File file = new File("a.txt");
        System.out.println("File: "+file.getName());

        Reader reader = null;
        try {
            reader = new FileReader(file);
        }catch (FileNotFoundException e){
            System.out.println("File Not Found");
            return;
        }
        BufferedReader br = new BufferedReader(reader);
        String line = null;
        while(true){
            try{
                line = br.readLine();
                if(line == null) break;
                System.out.println(line);
            }catch (IOException e){
                System.out.println("I/O Error");
                return;
            }
        }
    }
}
