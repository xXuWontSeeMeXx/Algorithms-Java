import java.io.*;

public class Chairs{
    public void execute() throws FileNotFoundException, IOException{
        FileReader fr = new FileReader("C:\\Users\\PC11-104.CUTONALA\\Downloads\\archivo.txt");
        BufferedReader br = new BufferedReader(fr);
        String entrada;
        while((entrada = br.readLine()) != null)
        {
            int m = Integer.parseInt(entrada);
            if(m == 1)
                System.out.println(0);
            else{
                int notUsed = 0;
                for(int i = 0; i < m - 1; ++i)
                    notUsed += 2;
                System.out.println(notUsed);
            }//else
        }//while
    }//execute

    public static void main(String args[]) throws FileNotFoundException, IOException{
        Chairs obj = new Chairs();
        obj.execute();
    }//main
}//class Chairs
