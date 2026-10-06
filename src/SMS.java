import java.awt.image.ImagingOpException;

public class SMS implements Notificador{
    private String Nome;
    private int numero;

    public SMS(String nome, int numero) {
        Nome = nome;
        this.numero = numero;
    }

    @Override
    public void enviar(String mensagem) {
        IO.println("Para" + Nome);
        IO.println("De" + numero);

    }

    @Override
    public String toString() {
        return "SMS{" +
                "Nome='" + Nome + '\'' +
                ", numero=" + numero +
                '}';
    }
}
