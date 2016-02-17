import java.io.*;
import java.util.*;

public class CamelCase{
    public static void main(String args[]) throws IOException, FileNotFoundException{
        FileReader fr = new FileReader("/home/xxmasterxassassinxx/Desktop/archivo.txt");
        BufferedReader br = new BufferedReader(fr);
        String entrada;
        while((entrada = br.readLine()) != null)
        {
            entrada = entrada.trim();
            entrada = entrada.toLowerCase();
            char cadena[] = entrada.toCharArray();
            cadena[0] = Character.toUpperCase(cadena[0]);
            for(int i = 1; i < entrada.length(); ++i)
                if(cadena[i] == ' ')
                    cadena[i + 1] = Character.toUpperCase(cadena[i + 1]);
            for(int i = 0; i < cadena.length; ++i)
            {
                if(cadena[i] == ' '){}//if
                else
                    System.out.print(cadena[i]);
            }//for          
            System.out.println();
        }//while
    }//main
}//class CamelCase
