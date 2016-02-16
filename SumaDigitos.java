import java.util.*;
import java.io.*;

public class SumaDigitos{
    public static void main(String args[]) throws IOException, FileNotFoundException{
        FileReader fr = new FileReader("/home/xxmasterxassassinxx/Desktop/archvo.txt");
        BufferedReader br = new BufferedReader(fr);
        String entrada;
        while((entrada = br.readLine()) != null)
        {
            int num = Integer.parseInt(entrada);
            int suma = 0;
            System.out.print("Sum of " + num + " = ");
            while(num > 0)
            {
                suma += num % 10;
                num /= 10;
            }//while
            System.out.println(suma);
        }//while
    }//main
}//class
