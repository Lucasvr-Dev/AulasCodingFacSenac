package projetoaulaum;

import java.util.Scanner;

public class MainTestOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,total;
        
        
        System.out.println("insira um número: ");
        a = scanner.nextInt();
        System.out.println("Insira outro número: ");;
        b = scanner.nextInt();

        total = a + b;

        System.out.printf("O total é : %s\n",total);
        
    }
}
