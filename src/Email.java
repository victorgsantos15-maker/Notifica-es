import java.security.PrivateKey;

public class Email implements Notificador{
    private String Nome;
    private String Email;

    public Email(String nome, String email) {
        Nome = nome;
        Email = email;
    }

    @Override
    public String toString() {
        return "Email{" +
                "Nome='" + Nome + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }

    @Override
    public void enviar(String mensagem) {
        IO.println("Para" + Nome);
        IO.println("De" + Email);

    }
}
