import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class arquivo {
    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);
            File tmpArquivo = new File("arquivos/arquivo.txt");
            FileWriter wtArquivo = new FileWriter(tmpArquivo, true);
            int inicio, fim;

            System.out.println("digite o id inicial: ");
            inicio = teclado.nextInt();

            System.out.println("digite o id final: ");
            fim = teclado.nextInt();

            for (int i = inicio; i <= fim; i++) {
                Player p = new Player(i, "Player"+i, i );
                wtArquivo.write(p+"\n");

            }

            wtArquivo.close();
            teclado.close();

        }
        catch(Exception ex) {
            System.out.println("erro: " + ex.getMessage());
        }
    }
    
}
