import java.io.*;

class Read_Key_Write_File{
public static void main(String Ar[]) {
//throws IOException{ 
try{
InputStreamReader r=new InputStreamReader(System.in);
 	BufferedReader br =new BufferedReader(r);
System.out.println("Enter the string ");
String str = br.readLine(); 
FileWriter f=new FileWriter("C:/Users/USER/Desktop/java/hope.txt");// check path
          
	BufferedWriter wr=new BufferedWriter(f);
        wr.write(str);
	wr.append(" existing file use append");
	while((str)!=null){
        		System.out.println(str);break;
		}
	wr.close();
System.out.println("Sucessfully written to the file ");

}catch(IOException w){System.out.println(w);}
}
}

