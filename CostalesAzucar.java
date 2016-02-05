import java.io.*;

public class CostalesAzucar{
    public void execute() throws IOException, FileNotFoundException{
        FileReader fr = new FileReader("/home/xxmasterxassassinxx/Desktop/archivo.txt");
        BufferedReader br = new BufferedReader(fr);
        String entrada;
        while((entrada = br.readLine()) != null)
        {
            try{
                entrada = entrada.trim();
                int index = entrada.indexOf(" ");
                String n1 = entrada.substring(0, index);
                String n2 = entrada.substring(index + 1);
                int cantidad = Integer.parseInt(n1);
                int toneladas = Integer.parseInt(n2);
                System.out.println("Bags of sugar full: " + cantidad / toneladas);
                System.out.println("Tonnes left: " + cantidad % toneladas);
            }catch(StringIndexOutOfBoundsException str){}//catch
        }//while
    }//execute
  
    public static void main(String args[]) throws IOException{
        CostalesAzucar obj = new CostalesAzucar();
        obj.execute();
    }//main
}//class CostalesAzucar
