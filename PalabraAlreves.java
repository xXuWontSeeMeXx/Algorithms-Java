import java.util.*;
import java.io.*;

class PalabraAlreves{
    static Vector vector = new Vector();

    public static void insertVector(String cadena){
        vector.addElement(cadena);
    }//insertVector

    public static void printVector(){
        for(int i = vector.size() - 1; i >= 0; --i)
            System.out.print(vector.elementAt(i) + " ");
        System.out.println();
    }//printVector

    public static void main(String args[]) throws IOException, FileNotFoundException{
        FileReader fr = new FileReader("/home/xxmasterxassassinxx/Desktop/archvo.txt");
        BufferedReader br = new BufferedReader(fr);
        String entrada;
        while((entrada = br.readLine()) != null)
        {
            entrada += " .";
            String cadena = "";
            for(int i = 0; i < entrada.length(); ++i)
            {
                if(entrada.charAt(i) == '.')
                    insertVector("\n");
                else if(entrada.charAt(i) == ' ')
                {
  		    insertVector(cadena);
                    cadena = "";
                }//if
                else
                    cadena += entrada.charAt(i);
            }//for
        }//while
        printVector();
    }//main
}//class PalabraAlreves
