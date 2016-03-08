import java.io.*;

public class Giros{
    public void execute() throws IOException, FileNotFoundException{
        FileReader fr = new FileReader("/home/mint/Desktop/archivo.txt");
        BufferedReader br = new BufferedReader(fr);
        String entrada;
        while((entrada = br.readLine()) != null)
        {
            char[] arreglo = {'E','S','W','N','E','S','W'};
            int pos = 3;
            for(int i = 0; i < entrada.length(); ++i)
            {
                switch(entrada.charAt(i))
                {
                    case 'L': 
                        pos--;
                        if(pos == -1)
                            pos = 3;
                    break;
                    case 'R': 
                        pos++;
                        if(pos == 7)
                            pos = 3;
                    break;
                }//switch
            }//for
            System.out.println(arreglo[pos]);
        }//while
    }//execute

    public static void main(String [] args) throws IOException{
        Giros obj = new Giros();
        obj.execute();
    }//main
}//class Giros
