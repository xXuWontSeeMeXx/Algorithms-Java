import java.io.*;

public class CountingBinaries{
    public void execute() throws IOException, FileNotFoundException{
        FileReader fr = new FileReader("archivo.txt");
        BufferedReader br = new BufferedReader(fr);
        String entrada;
        while((entrada = br.readLine()) != null)
        {
            entrada = entrada.trim();
            int num = Integer.parseInt(entrada);
            int counting = 0;
            for(int i = 1; i <= num; ++i)
            {
                String binario = Integer.toBinaryString(i) + "";
                counting += countUnos(binario);
            }//for
            System.out.println(counting);
        }//while
    }//execute

    public int countUnos(String cadena){
        int sum = 0;
        for(int i = 0; i < cadena.length(); ++i)
            if(cadena.charAt(i) == '1')
                sum++;
        return sum;
    }//countUnos

    public static void main(String [] args) throws IOException, FileNotFoundException{
        CountingBinaries obj = new CountingBinaries();
        obj.execute();
    }//main
}//class CountingBinaries
