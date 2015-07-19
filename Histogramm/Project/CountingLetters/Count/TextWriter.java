package Count;

import java.io.*;
public class TextWriter
{
    public TextWriter(){}
    
    
   // Writes to file
    public void writeToFile(){
        boolean finished = false;
        String inputLine = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("files/selfmade1.txt")));
            while(!finished){
                inputLine = reader.readLine();
                if(inputLine.toLowerCase().equals("ende")){
                    finished = true;
                }
                writer.println(inputLine);
                writer.close();
            }
        }catch(java.io.IOException exc) {
                System.out.println("There was an error during reading: ");
        }
    }
}