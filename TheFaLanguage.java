import java.io.*;

public class TheFaLanguage{
	public static void main(String args[]) throws FileNotFoundException, IOException{
		FileReader fr = new FileReader("archivo.txt");
		BufferedReader br = new BufferedReader(fr);
		String entrada;
		while((entrada = br.readLine()) != null)
		{
			for(int i = 0; i < entrada.length(); i++)
			{
				System.out.print(entrada.charAt(i));
				try{
					boolean isVowel = (entrada.charAt(i) == 'a' || entrada.charAt(i) == 'e' || entrada.charAt(i) == 'i' || entrada.charAt(i) == 'o' || 
								   entrada.charAt(i) == 'u' || entrada.charAt(i) == 'A' || entrada.charAt(i) == 'E' || entrada.charAt(i) == 'I' || 
								   entrada.charAt(i) == 'O' || entrada.charAt(i) == 'U');
					boolean isNextVowel = (entrada.charAt(i + 1) == 'a' || entrada.charAt(i + 1) == 'e' || entrada.charAt(i + 1) == 'i' || entrada.charAt(i + 1) == 'o' 	|| 									   entrada.charAt(i + 1) == 'u' || entrada.charAt(i + 1) == 'A' || entrada.charAt(i + 1) == 'E' || entrada.charAt(i + 1) == 'I' 	|| 									   entrada.charAt(i + 1) == 'O' || entrada.charAt(i + 1) == 'U');
					if(isVowel && !isNextVowel)
						System.out.print("f" + entrada.charAt(i));
				}catch(StringIndexOutOfBoundsException str){}				
			}//for
			System.out.println();
		}//while
	}//main
}//class TheFaLanguage
