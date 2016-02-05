import java.io.*;

public class RevesCuadrado{
   
    public void executee() throws IOException, FileNotFoundException{
        FileReader fr = new FileReader("/home/xxmasterxassassinxx/Desktop/archivo.txt");
        BufferedReader br = new BufferedReader(fr);
        String entrada;
        while((entrada = br.readLine()) != null)
        {
            try{
                entrada = entrada.trim();
                String s1 = "";
                String s2 = "";
                String fin = "";
                int num;
                if(entrada.indexOf(".") > -1)
                {
                    int index = entrada.indexOf(".");
                    String n1 = entrada.substring(0, index);
                    String n2 = entrada.substring(index+1, entrada.length());
                    for(int i = n1.length() - 1; i >= 0; i--)
                        s1 += n1.charAt(i);
                    for(int i = n2.length() - 1; i >= 0; i--)
                        s2 += n2.charAt(i);
                    fin += s1 + "." + s2;
                    float cuad = Float.parseFloat(fin);
                    float cuadrado = (float)Math.pow(cuad, 2);
                    System.out.printf("\t%s\t%s\t%.4f", entrada, fin, cuadrado);
                    System.out.println();
                }//if
                else{
                    String s3 = "";
                    for(int i = entrada.length() - 1; i >= 0; i--)
                        s3 += entrada.charAt(i);
                    float cuad = Float.parseFloat(s3);
                    float cuadrado = (float)Math.pow(cuad, 2);
                    System.out.printf("\t%s\t%.0f\t%.4f", entrada, cuad, cuadrado);
                    System.out.println();
                }//else
            }catch(StringIndexOutOfBoundsException str){}//catch
        }//while
    }//execute
   
    public static void main(String args[]) throws IOException{
        RevesCuadrado obj = new RevesCuadrado();
        obj.executee();
    }//main
}//class RevesCuadrado
