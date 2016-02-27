import java.io.*;

public class RemoveCharacters{
    public void execute() throws IOException, FileNotFoundException{
        FileReader fr = new FileReader("/home/mint/Desktop/archivo.txt");
        BufferedReader br = new BufferedReader(fr);
        String entrada;
        while((entrada = br.readLine()) != null)
        {
            int index = entrada.indexOf(",");
            String cadena = entrada.substring(0, index);
            String limits = entrada.substring(index + 2);
            for(int i = 0; i < cadena.length(); ++i)
            {
                if(compara(cadena.charAt(i) + "", limits)){ }//if
                else
                    System.out.print(cadena.charAt(i));
            }//for
            System.out.println();
        }//while
    }//execute

    public boolean compara(String c, String limits){
        if(limits.contains(c))
            return true;
        else
            return false;
    }//compara

    public static void main(String args[]) throws IOException{
        RemoveCharacters obj = new RemoveCharacters();
        obj.execute();
    }//main
}//class RemoveCharacters
