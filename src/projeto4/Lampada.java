package projeto4;


//Definida no arquivo Lampada.java
public class Lampada {
    boolean ligada = false;
    int tempoDeVida = 0; // horas 

    public Lampada(int tempoDeVida) {
        this.tempoDeVida = tempoDeVida;
    }

    //métodos
    public void ligar() {
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void status(){
        if (ligada){
            System.out.println("Ligada");
        }else{
            System.out.println("Desligada");
        }
    }
    public static void main(String[] args) {
        Lampada l = new Lampada(0);
        l.status();
        l.ligar();
    }

    public void mostrarDetalhes(String tipo){
        System.out.printf("%s | Tempo de vida: %s \n" ,tipo,tempoDeVida);
    }

}

