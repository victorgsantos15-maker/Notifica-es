//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Email email = new Email("Victor", "seila@gmail.com");
    SMS sms = new SMS ("Alisson", 976456798);

    String mensagemEmail = IO.readln();
    String mensagemSms = IO.readln();

    sms.enviar("Mensagem enviada");
    email.enviar("Mensagem enviada");


}
