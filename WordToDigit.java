import java.io.*;

public class WordToDigit{
    public void execute() throws IOException, FileNotFoundException{
        FileReader fr = new FileReader("C:\\Users\\PC18-104\\Desktop\\archivo.txt");
        BufferedReader br = new BufferedReader(fr);
        String entrada;
        while((entrada = br.readLine()) != null)
        {
            entrada += ";";
            String numero = "";
            for(int i = 0; i < entrada.length(); ++i)
            {
                if(entrada.charAt(i) == ';')
                {
                    printDigit(numero);
                    numero = "";
                }//if
                else
                    numero += entrada.charAt(i);
            }//for
            System.out.println();
        }//while
    }//execute

    public void printDigit(String numero){
        if(numero.equals("zero")) System.out.print("0");
        if(numero.equals("one")) System.out.print("1");
        if(numero.equals("two")) System.out.print("2");
        if(numero.equals("three")) System.out.print("3");
        if(numero.equals("four")) System.out.print("4");
        if(numero.equals("five")) System.out.print("5");
        if(numero.equals("six")) System.out.print("6");
        if(numero.equals("seven")) System.out.print("7");
        if(numero.equals("eight")) System.out.print("8");
        if(numero.equals("nine")) System.out.print("9");
    }//printDigit

    public static void main(String args[]) throws IOException{
        WordToDigit obj = new WordToDigit();
        obj.execute();
    }//main
}//WordToDigit
