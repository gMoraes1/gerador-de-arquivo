import java.io.*;

public class readBin {

    public static void main(String[] args) {

        try {
            File tmpArq = new File("arquivos/arquivo.bin");
            FileInputStream fsArq = new FileInputStream(tmpArq);
            ObjectInputStream obj = new ObjectInputStream(fsArq);

            while (true) {
                try {
                    Player p = (Player) obj.readObject();
                    System.out.println("LIDO: " + p.showInfo());
                }
                catch (EOFException ex) {
                    System.out.println("Finalizado");
                    break; 
                }
            }

            obj.close();
            fsArq.close();
        }
        catch (Exception ex) {
            System.out.println("Erro geral: " + ex.getMessage());
        }
    }
}
