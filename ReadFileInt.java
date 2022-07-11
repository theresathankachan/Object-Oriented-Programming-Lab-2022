import java.util.Scanner;
import java.io.*;

public class ReadFileInt {
   public static void main(String[] args) {
String s="";  int v;

       BufferedReader br = null;
       
       try{	
           br = new BufferedReader(new FileReader("C:/Users/USER/Desktop/java/rint.txt"));		
		while((s=br.readLine())!=null){
		   v=Integer.parseInt(s);
			if (v%2==0)
			System.out.println("Even= "+v);
			else
			System.out.println("ODD= "+v);
}
		 } 
       catch (IOException ioe) 
       {
	   ioe.printStackTrace();
       } 
}}