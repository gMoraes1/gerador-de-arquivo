import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class binWriter {
    public static void main (String[]args ) {
        try {

            File tmpArquivo = new File("arquivos/arquivo.bin");
            FileOutputStream fsArq = new FileOutputStream(tmpArquivo); 
            ObjectOutputStream obj = new ObjectOutputStream(fsArq);
            Scanner teclado = new Scanner(System.in); 

            int inicio, fim;

            System.out.println("digite o id inicial: ");
            inicio = teclado.nextInt();

            System.out.println("digite o id final: ");
            fim = teclado.nextInt();

            for (int i = inicio; i <= fim; i++) {
                Player p = new Player(i, "Player"+i, i );
                obj.writeObject(p);

            }

            obj.close();
            fsArq.close();

        }
        catch(Exception ex) {
            System.out.println("Erro:" + ex.getMessage());
        }
    }
    
}
