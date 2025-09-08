package projeto3.matematica;

public class Retangulo {
    double largura;
    double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    double area() {
        return largura * altura;
    }

    double perimetro(){
        return 2 * (largura + altura);
    }
}
