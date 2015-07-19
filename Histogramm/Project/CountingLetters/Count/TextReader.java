package Count;

import java.io.*;
public class TextReader
{
    public TextReader(){}
    
    //Prints out the characters of a file "test"
    public void getNextChar(){
        try{
             BufferedReader inputText= new BufferedReader(new FileReader("files/Test1.txt"));
             System.out.println("File loaded");
             String line;
             boolean isEmpty= true;
             // Gets the next line of document
             while((line = inputText.readLine()) != null){
                 // Creates Array of characters of the line and prints out one after the other
                 for(char ch:line.toCharArray()){
                     System.out.println(ch);
                 }
                 isEmpty = false;
             }
             //If document is empty (absolutly no charakters) it prints that its empty
             if(isEmpty){
              System.out.println("This file is empty!");  
             }
             inputText.close();
        }catch(IOException e)
        {
            System.out.println("File error!");
        }
    }
}