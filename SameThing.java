import java.io.*;

public class SameThing{
    public void execute() throws FileNotFoundException, IOException{
        FileReader fr = new FileReader("/home/mint/Desktop/archivo.txt");
        BufferedReader br = new BufferedReader(fr);
        String entrada;
        while((entrada = br.readLine()) != null)
        {
            int index = entrada.indexOf(".");
            String cadena1 = entrada.substring(0, index);
            String cadena2 = entrada.substring(index + 1);
            System.out.println(procesaCadenas(cadena1, cadena2));
        }//while
    }//execute

    public int procesaCadenas(String cadena1, String cadena2){
        int salida = 0;
        if(cadena1.equals(cadena2))
            salida = 1;
        else{
            String aux = "";
            for(int i = cadena2.length() - 1; i >= 0; --i)
                aux += cadena2.charAt(i) + "";
            if(cadena1.equals(aux))
                salida = 1;
        }//else
        return salida;
    }//procesaCadenas

    public static void main(String args[]) throws FileNotFoundException, IOException{
        SameThing obj = new SameThing();
        obj.execute();
    }//main
}//class SameThing
