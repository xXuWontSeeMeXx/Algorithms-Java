import java.io.*;

public class CountingPalindromesNumbers{
    public void execute() throws FileNotFoundException, IOException{
        FileReader fr = new FileReader("archivo.txt");
        BufferedReader br = new BufferedReader(fr);
        String entrada;
        while((entrada = br.readLine()) != null)
        {
            entrada = entrada.trim();
            int digitos = Integer.parseInt(entrada);
            int limite = getLimite(digitos);
            System.out.println(getCounting(limite));
        }//while
    }//execute

    public int getLimite(int digitos){
        String limite = "";
        for(int i = 0; i < digitos; ++i)
            limite += "9";
        return Integer.parseInt(limite);
    }//getLimite

    public int getCounting(int limite){
        int conteo = 0;
        for(int i = 0; i <= limite; ++i)
            conteo += comparaDigito(i +  "");
        return conteo;
    }//getCounting

    public int comparaDigito(String num){
        String aux = num;
        int counting = 0;
        num = "";
        for(int i = aux.length() - 1; i >= 0; --i)
            num += aux.charAt(i) + "";
        if(aux.equals(num))
            counting = 1;
        return counting;
    }//comparaDigito

    public static void main(String args[]) throws FileNotFoundException, IOException{
        CountingPalindromesNumbers obj = new CountingPalindromesNumbers();
        obj.execute();
    }//main
}//class CountingPalindromesNumbers
