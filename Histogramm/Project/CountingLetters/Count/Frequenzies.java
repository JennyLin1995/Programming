package Count;

import java.io.*;

public class Frequenzies{
    
	private int[] frequenzies = new int[26];
    
	public Frequenzies(){}
    
    // Empties Array
    public void emptyArray(){
        for(int i=0;i<25;i++){
                frequenzies[i]=0;
        }
    }
     
    // Selfmade normalizing methode
    public char toLowerCaseSelfmade(char bearbeiten){
        int neu;
        if((int)bearbeiten<97){
            neu = (int)bearbeiten+32;
        }else{
            neu=(int)bearbeiten;
        }
        char lower=(char)neu;
        return lower;
    }
    
    // Count Letter and write into file and print to terminal
    public void doCounting(String name, String read){
        emptyArray();
        countLetters(read);
        writeToFileFrequenzies("Freq"+name);
        writeToFileHistogram(("Histo"+name));
        System.out.println(printArray());
        System.out.println(printHistogram());
    }
    
    // Counts Letters and writes into Array
    public void countLetters(String file){
         try{
             BufferedReader inputText= new BufferedReader(new FileReader(file));
             String line;
             boolean isEmpty= true;
             while((line = inputText.readLine()) != null){
                 for(char ch:line.toCharArray()){
                     if(Character.isLetter(ch)&&(int)ch<123){
                         ch = toLowerCaseSelfmade(ch);
                         frequenzies[ch-97]++;
                        }
                 }
                 isEmpty = false;
             }
             if(isEmpty){
            	 System.out.println("This file is empty!");  
             }
             inputText.close();
        }catch(IOException e)
        {
            System.out.println("File error!");
        }
    }
    
    // Writes Freqeunzies to new file
    public void writeToFileFrequenzies(String name){
        String inputLine = "";
        String file="Count/files/"+name+".txt";
        try{
            PrintWriter writer = new PrintWriter(file);
            inputLine = printArray();
            writer.println(inputLine);
            writer.close();
        }catch(java.io.IOException exc) {
                System.out.println("There was an error during writing! ");
        }
    }
    
    // Writes Histogram to new file
    public void writeToFileHistogram(String name){
        String inputLine = "";
        String file="Count/files/"+name+".txt";
        try{
            PrintWriter writer = new PrintWriter(file);
            inputLine = printHistogram();
            writer.println(inputLine);
            writer.close();
        }catch(java.io.IOException exc) {
                System.out.println("There was an error during writing! ");
        }
    }
    
    // Prints Array
    public String printArray(){
        String toReturn= "Frequenzies:\r\n";
        for(int i=0;i<26;i++){
                int count=frequenzies[i];
                char buchstabe=(char)(i+97);
                toReturn+=(buchstabe+": "+count+"\r\n" );
        }
        return toReturn;
    }
    
    // Prints Histogram
    public String printHistogram(){
        String toReturn= "Histogram:\r\n";
        for(int i=0;i<26;i++){
                int count=frequenzies[i];
                char buchstabe=(char)(i+97);
                toReturn+=(buchstabe+": ");
                int g=0;
                while(g<count && g!= count){
                    toReturn+="*";
                    g++;
                }
                toReturn+="\r\n";
        }
        return toReturn;
    }
}