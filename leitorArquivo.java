import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class leitorArquivo {
    public static void main(String[] args) {
        try {
            File tmpArquivo = new File("arquivos/arquivo.txt");
            FileReader rdArquivo = new FileReader(tmpArquivo);
            BufferedReader br = new BufferedReader(rdArquivo);
            
            String linha;
            while((linha = br.readLine()) != null) {
                String info[] = linha.split(":");
                Player p = new Player(Integer.parseInt(info[0]), info[1], Float.parseFloat(info[2]));  
                System.out.println(p.showInfo()); 
            }
            rdArquivo.close();
            br.close();

        }
        catch(Exception ex) {
            System.out.println("error:" + ex.getMessage());
        }
        
    }
    
}
