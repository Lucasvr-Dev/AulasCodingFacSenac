package projeto3.aa;

public class Mensagem {
    String mensagem;

    public Mensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public static void main(String[] args) {
        Mensagem m = new Mensagem("Bem-vindos ao POO com JAVA!");
        System.out.println(m.mensagem);
        
    }
}
