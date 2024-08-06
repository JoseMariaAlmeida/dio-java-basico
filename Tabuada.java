import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário o número para o qual deseja a tabuada
        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = scanner.nextInt();
        
        // Gera a tabuada de 1 a 10 para o número fornecido
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
        scanner.close();
    }
}