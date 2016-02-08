import java.io.*;
import java.util.*;

public class Diamante{
    Stack cadena = new Stack();
    Stack espacios = new Stack();
    Stack ultima = new Stack();
    String spc = "";

    public void execute() throws IOException, FileNotFoundException{
        FileReader fr = new FileReader("/Users/Kratos/Desktop/archivo.txt");
        BufferedReader br = new BufferedReader(fr);
        String entrada;
        while((entrada = br.readLine()) != null)
        {
            for(int i = 0; i < entrada.length(); ++i)
            {
                cadena.push(entrada.charAt(i));
                espacios.push(" ");
            }//for
            espacios.pop();
            String palabra = "";
            String reversa = "";
            while(!cadena.isEmpty())
            {
                try{
                    printEspacios();
                    String c = cadena.pop() + "";
                    reversa += c;
                    palabra = makePalabra(reversa);
                    System.out.print(palabra);
                    System.out.print(reversa);
                    espacios.pop();                
                    System.out.println();
                }catch(EmptyStackException stk){}//catch
            }//while
            String fin = palabra + reversa;            
            System.out.println();
            for(int i = 0; i < fin.length(); ++i)
                ultima.push(fin.charAt(i));
            while(!ultima.isEmpty())
            {    
                printReverse();
                ultima.pop();
                ultima.removeElementAt(0);
            }//while
            spc = "";
        }//while        
    }//execute

    public void printEspacios(){
        for(int i = 0; i < espacios.size(); ++i)
            System.out.print(espacios.elementAt(i));
    }//printEspacios

    public String makePalabra(String palabra){
        String nueva = "";
        for(int i = palabra.length() - 1; i >= 0; --i)
            nueva += palabra.charAt(i);
        return nueva;
    }//makePalabra;

    public void printReverse(){
        System.out.print(spc);
        for(int i = 0; i < ultima.size(); ++i)
            System.out.print(ultima.elementAt(i));
        System.out.println();
        spc += " ";
    }//printReverse

	public static void main(String args[]) throws IOException{
        Diamante obj = new Diamante();
        obj.execute();
	}//main
}//class Diamante
