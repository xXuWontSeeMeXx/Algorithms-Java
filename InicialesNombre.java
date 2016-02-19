import java.io.*;

public class InicialesNombre{
    public void execute() throws FileNotFoundException, IOException{
        FileReader fr = new FileReader("/home/mint/Desktop/archivo.txt");
        BufferedReader br = new BufferedReader(fr);
        String entrada;
        while((entrada = br.readLine()) != null)
        {
            char cadena[] = entrada.toCharArray();
            System.out.print(Character.toUpperCase(cadena[0]));
            for(int i = 1; i < cadena.length; ++i)
            {
                if(cadena[i] == ' ')
                {
                    System.out.printf("%s%s", cadena[i], Character.toUpperCase(cadena[i + 1]));
                    ++i;
                }//if
                else
                    System.out.print(cadena[i]);
            }//for
            System.out.println();
        }//while
    }//execute

    public static void main(String args[]) throws IOException{
        InicialesNombre obj = new InicialesNombre();
        obj.execute();
    }//main
}//class InicialesNombre
