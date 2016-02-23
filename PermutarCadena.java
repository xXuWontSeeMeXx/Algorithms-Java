public class PermutarCadena{
    public static void generaCadena(String cadenas[], String rnd, int n, int tam){
        if(n == 0)
            System.out.println(printCadena(rnd));
        else{
            for(int i = 0; i < tam; ++i)
                if(!rnd.contains(cadenas[i]))
                    generaCadena(cadenas, rnd + cadenas[i], n - 1, tam);
        }//else
    }//generaCadena

    static String printCadena(String cadena){
        return cadena;
    }//printCadena

    public static void main(String args[]){
        String cadena = "abcd";
        String cadenas[] = new String[cadena.length()];
        for(int i = 0; i < cadena.length(); ++i)
            cadenas[i] = cadena.charAt(i) + "";
        generaCadena(cadenas, "", cadenas.length, cadenas.length);
    }//main
}//class PermutarCadena
