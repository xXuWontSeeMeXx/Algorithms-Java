import java.util.*;
import java.io.*;

public class StringPermutations{
    String vect[];
    int index = 0;

    public void execute() throws FileNotFoundException, IOException{
        FileReader fr = new FileReader("/home/mint/Desktop/archivo.txt");
        BufferedReader br = new BufferedReader(fr);
        String entrada;
        while((entrada = br.readLine()) != null)
        {
            String cadena[] = new String[entrada.length()];
            int tam = getFact(entrada.length());
            vect = new String[tam];
            for(int i = 0; i < entrada.length(); ++i)
                cadena[i] = entrada.charAt(i) + "";
            generateCadena(cadena, "", cadena.length, cadena.length);
            printVector();
            System.out.println();
            vect = new String[tam];
            index = 0;
        }//while
    }//execute

    public int getFact(int n){
        if(n == 1)
            return 1;
        else
            return getFact(n - 1) * n;
    }//getFact

    public void generateCadena(String cadena[], String rnd, int n, int tam){
        if(n == 0)
        {
            vect[index] = rnd;
            index++;
        }//if
        else{
            for(int i = 0; i < tam; ++i)
                if(!rnd.contains(cadena[i]))
                    generateCadena(cadena, rnd + cadena[i], n - 1, tam);
        }//else
    }//generateCadena

    public void printVector(){
        Arrays.sort(vect);
        for(int i = 0; i < vect.length; ++i)
            System.out.print(vect[i] + ", ");
    }//printVector

    public static void main(String args[]) throws IOException{
        StringPermutations obj = new StringPermutations();
        obj.execute();
    }//main
}//class StringPermutations
