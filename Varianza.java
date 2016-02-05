import java .io.*;
import java.util.*;

public class Varianza{
    Vector vector = new Vector();

    public void execute() throws IOException, FileNotFoundException{
        FileReader fr = new FileReader("/home/xxmasterxassassinxx/Desktop/archivo.txt");
        BufferedReader br = new BufferedReader(fr);
        String entrada;
        while((entrada = br.readLine()) != null)
        {
            int num = Integer.parseInt(entrada);
            inserta(num);
        }//while
        int n = vector.size();
        int suma = 0;
        for(int i = 0; i < n; ++i)
            suma += (int)vector.elementAt(i);
        int media = suma / n;
        int vrz = 0;
        for(int i = 0; i < n; ++i)
            vrz += getVarianza((int)vector.elementAt(i), media);
        System.out.println("Variance: " + vrz / n);
    }//execute

    public void inserta(int num){
        vector.addElement(num);
    }//inserta

    public int getVarianza(int num, int media){
        return (num - media) * (num - media);
    }//getVarianza

    public static void main(String args[]) throws IOException{
        Varianza obj = new Varianza();
        obj.execute();
    }//main
}//class Varianza
