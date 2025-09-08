package projeto4;

public class Main {
    public static void main(String[] args) {
        
        LampadaIncandescente lampadainc1 = new LampadaIncandescente();
        LampadaFluorescente lampadafluo1 = new LampadaFluorescente();
        LampadaLed lampadaled1 = new LampadaLed();
       
        lampadainc1.mostrarDetalhes("Incandescente");
       
        lampadafluo1.mostrarDetalhes("Fluorescente");
       
        lampadaled1.mostrarDetalhes("Led");
    }
}
