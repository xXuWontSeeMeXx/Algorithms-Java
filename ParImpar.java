import java.io.*;

public class ParImpar{
    public void execute() throws IOException, FileNotFoundException{
        FileReader fr = new FileReader("/home/mint/Desktop/archivo.txt");
        BufferedReader br = new BufferedReader(fr);
        String entrada;
        while((entrada = br.readLine()) != null)
        {
            entrada += " ";
            String n = "";
            String cadena = "";
            for(int i = 0; i < entrada.length(); ++i)
            {
                n += entrada.charAt(i) + "";
                if(entrada.charAt(i) == ' ')
                {
                    n = n.trim();
                    int num = Integer.parseInt(n);
                    cadena += verificaNum(num);
                    n = "";
                }//if
            }//for
            if(!cadena.contains("11") && !cadena.contains("00"))
                System.out.println("Correcto");
            else
                System.out.println("Incorrecto");
        }//while
    }//execute

    public String verificaNum(int num){
        if(num % 2 == 0)
            return "0";
        else
            return "1";
    }//verificaNum

    public static void main(String args[]) throws IOException{
        ParImpar obj = new ParImpar();
        obj.execute();
    }//main
}//class ParImpar
