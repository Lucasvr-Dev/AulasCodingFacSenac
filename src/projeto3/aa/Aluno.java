package projeto3.aa;

//definida no arquivo Aluno.java
public class Aluno {
    
    String nome;
    int idade;

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //representação do texto do objeto
    @Override
    public String toString(){
        return "Aluno {nome = " + nome + ", idade = " + idade + "}"; //sobrescreve o método toString() da classe Object
    }
 
    public static void main(String[] args) {
        Aluno a = new Aluno("Ana",20);
        System.out.println(a); // usa toString()
    }
}
