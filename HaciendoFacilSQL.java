import java.io.*;

public class HaciendoFacilSQL{
    public void execute() throws IOException, FileNotFoundException{
        FileReader fr = new FileReader("archivo.txt");
        BufferedReader br = new BufferedReader(fr);
        String entrada;
        while((entrada = br.readLine()) != null)
        {
            System.out.print("SELECT ");
            int idxParentesis = entrada.indexOf("(");
            String tabla = entrada.substring(13, idxParentesis);
            String columnas = entrada.substring(idxParentesis + 1, entrada.length() - 1);
            columnas += ", ";
            int idxSpace = 0;
            int idxComa = 0;
            while(idxSpace != -1 || idxComa != -1)
            {
                idxSpace = columnas.indexOf(" ");
                idxComa = columnas.indexOf(", ");
                if(idxSpace == -1 || idxComa == -1)
                    break;
                idxComa += 2;
                System.out.print(columnas.substring(idxSpace - idxSpace, idxSpace) + ", ");
                String aux = columnas.substring(idxSpace - idxSpace, idxComa);
                columnas = columnas.replace(aux, "");
            }//while
            System.out.println("FROM " + tabla);
        }//while
    }//execute

    public static void main(String args[]) throws IOException, FileNotFoundException{
        HaciendoFacilSQL obj = new HaciendoFacilSQL();
        obj.execute();
    }//main
}//class HaciendoFacilSQL
