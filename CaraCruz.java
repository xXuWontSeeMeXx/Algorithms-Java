import java.io.*;

public class CaraCruz{
    public void execute() throws IOException, FileNotFoundException{
        FileReader fr = new FileReader("C:\\Users\\PC7-104\\Desktop\\archivo.txt");
        BufferedReader br = new BufferedReader(fr);
        String entrada;
        while((entrada = br.readLine()) != null)
        {
            int mary = 0;
            int john = 0;
            for(int i = 0; i < entrada.length(); ++i)
            {
                if(entrada.charAt(i) == ' '){ }//if
                else{
                    if(entrada.charAt(i) == '0')
                        mary++;
                    else
                        john++;
                }//else
            }//for
            System.out.println("Mary won " + mary + " times and John won " + john + " times.");
        }//while
    }//execute

    public static void main(String args[]) throws IOException{
        CaraCruz obj = new CaraCruz();
        obj.execute();
    }//main
}//class CaraCruz
