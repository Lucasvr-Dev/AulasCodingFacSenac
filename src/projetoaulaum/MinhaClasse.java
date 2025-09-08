package projetoaulaum;

public class MinhaClasse {

    static int a = 10;  //qualquer função consegue acessar e alterar as variáveis globais (definidas fora da função, mas dentro da classe)
    static int b = 12;
    static int total = a + b;
    static String name = "Lucas";

    public static void main(String[] args) {
        
        System.out.println("Meu nome é: " + name + "!, total: "+ total);
    }
}
