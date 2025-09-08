package projetoaulaum.projeto2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("aa");
        
        try { //Espera que o usuário insira um número inteiro, se o usuário inserir um texto, apresenta erro
            int number = scanner.nextInt();

        } catch (InputMismatchException e) { //
            // TODO: handle exception
            System.err.println("taporra");
        }
    }
}
