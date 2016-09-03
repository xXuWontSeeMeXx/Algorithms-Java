/*
 *    Bruce Wayne is known as BATMAN and a nocturnal peculiar mammal represents him; the word of that
 *    animal in Spanish consists of 5 consonants and the 5 vowels, from which none of them is repeated. This
 *    word must create an encryption code to transfer text files. These are the following rules:
 *    
 *    0
 *    1
 *    2
 *    3
 *    4
 *    5
 *    6
 *    7
 *    8
 *    9
 *
 *    Each letter of the mysterious word (animal’s name in Spanish) will become a number (0 to 9) and at the
 *    beginning of each word placed in the file should precede the indicator of the length of each word in byte
 *    format. The program must take a text file (WITH WORDS ONLY, NOT NUMBERS) as input and generate
 *    an output file.
 *
 *    The following example is shown for better comprehension:
 *
 *    Input
 *
 *        File name: TEXT.txt containing the following text:
 *
 *        HOLA
 *        QUIERO CONTARTE UN SECRETO
 *
 *    Output
 *
 *        File name: TEXT.crp (Encrypted)
 *
 *        (BYTE 4)H967
 *        (BYTE 6)Q14529(BYTE 8)39NT72T5(BYTE 2)1N(BYTE 7)S5325T0
 */

import java.io.*;

public class Batcode{
    public void execute() throws FileNotFoundException, IOException{
        FileReader fr = new FileReader("archivo.txt");
        BufferedReader br = new BufferedReader(fr);
        String entrada;
        while((entrada = br.readLine()) != null)
        {
            entrada = entrada.toUpperCase().trim();
            entrada += " ";
            String cadena = "";
            for(int i = 0; i < entrada.length(); ++i)
            {
                if(entrada.charAt(i) == ' ')
                {
                    String crypt = cryptCadena(cadena);
                    System.out.print(crypt);
                    cadena = "";
                }//if
                else
                    cadena += entrada.charAt(i) + "";
            }//for
            System.out.println();
        }//while
    }//execute

    public String cryptCadena(String cadena){
        final String KEYWORD = "MURCIELAGO";
        final String DIGITS  = "0123456789";
        String strByte = "(BYTE " + cadena.length() + ")";
        for(int i = 0; i < cadena.length(); ++i)
        {
            for(int j = 0; j < KEYWORD.length(); ++j)
                if(cadena.charAt(i) == KEYWORD.charAt(j))
                    cadena = cadena.replace(cadena.charAt(i), DIGITS.charAt(j));
        }//for
        strByte += cadena;
        return strByte;
    }//cryptCadena

    public static void main(String args[]) throws FileNotFoundException, IOException{
        Batcode obj = new Batcode();
        obj.execute();
    }//main
}//class Batcode
