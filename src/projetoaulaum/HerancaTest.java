package projetoaulaum;

public class HerancaTest {
    public static void main(String[] args) {
        /*
         * Veiculo meuCarro1 = new Veiculo(); //Declaramos a variável meuCarro1 do tipo
         * Veiculo, e instanciamos o objeto Veícuo.
         * meuCarro1.marca = "Ford"; //Atribuímos a marca Ford ao objeto meuCarro1.
         * meuCarro1.ano = 2025; //Atribuímos o ano 2025 ao objeto meuCarro1.
         * System.out.printf("O carro é da marca: %s, e do ano %s está ",meuCarro1.
         * marca, meuCarro1.ano);
         * meuCarro1.buzinar();
         */

        Carro carro1 = new Carro();

        // Atributos herdados da classe Veiculo
        carro1.marca = "Toyota";
        carro1.ano = 2022;
        carro1.modelo = "Corolla"; // Atributo herdado da classe Veiculo, mas não utiizado na classe Carro.

        // Atributo específico da classe Carro
        carro1.portas = 4;

        // Métodos herdados e próprios da classe Carro
        carro1.exerbirInformacoes(); // Exibe as informações do carro, incluindo os atributos herdados e o atributo
                                     // específico da classe Carro.
        carro1.buzinar();

    }
}
