import java.io.*;
import java.util.*;

public class GreatestCommonDivisor{
    Vector A = new Vector();
    Vector B = new Vector();
    Vector C = new Vector();

    public void execute() throws FileNotFoundException, IOException{
        FileReader fr = new FileReader("C:\\Users\\PC11-104.CUTONALA\\Downloads\\archivo.txt");
        BufferedReader br = new BufferedReader(fr);
        String entrada;
        while((entrada = br.readLine()) != null)
        {
            entrada += " ";
            String cadena = "";
            boolean bandera = true;
            for(int i = entrada.indexOf("A") + 2; i < entrada.length(); ++i)
            {
                if(entrada.charAt(i) == ' ' && bandera)
                {
                    A.addElement(Integer.parseInt(cadena.trim()));
                    cadena = "";
                }//if
                if(entrada.charAt(i) == ' ' && !bandera)
                {
                    B.addElement(Integer.parseInt(cadena.trim()));
                    cadena = "";
                }//if
                else if(entrada.charAt(i) == 'B')
                {
                    bandera = false;
                    i++;
                }//else if
                else
                    cadena += entrada.charAt(i);
            }//for
            getGCD();
            printVectores();
        }//while
    }//execute

    public void printVectores(){
        for(int i = 0; i < A.size(); ++i)
        {
            System.out.print("A = " + A.elementAt(i) + "  B = " + B.elementAt(i) + "  C = " + C.elementAt(i));
            System.out.println();
        }//for
    }//printVectores

    public void getGCD(){
        for(int i = 0; i < A.size(); ++i)
        {
            int mayor = Math.max((int)A.elementAt(i), (int)B.elementAt(i));
            boolean bandera = true;
            while(bandera)
            {
                if((int)A.elementAt(i) % mayor == 0 && (int)B.elementAt(i) % mayor == 0)
                {
                    C.addElement(mayor);
                    bandera = false;
                }//if
                else
                    mayor--;
            }//while
        }//for
    }//getGCD

    public static void main(String [] args) throws FileNotFoundException, IOException{
        GreatestCommonDivisor obj = new GreatestCommonDivisor();
        obj.execute();
    }//main
}//class GreatestCommonDivisor
