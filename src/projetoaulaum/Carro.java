package projetoaulaum;

public class Carro extends Veiculo {
    int portas = 4; //Atributo específico da classe Carro, indicando o número de portas.

    public void exerbirInformacoes() {
        System.out.println("Marca: " +marca); //Exibe a marca do carro, herdada da classe Veiculo.
        System.out.println("Ano: "+ano); //Exibe o ano do carro, herdado da classe Veiculo.
        System.out.println("Portas: "+portas); //Exibe o número de portas do carro, atributo específico da classe Carro.
    }
        
}

