import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numero1 = 0, numero2 = 0, resultado = 0;
        char operador;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Digite o primeiro número: ");
                numero1 = input.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Você deve digitar um número.");
                input.next();
            }
        }

        System.out.print("Coloque um operador: (+, -, *, /) ");
        operador = input.next().charAt(0);

        validInput = false;
        while (!validInput) {
            try {
                System.out.print("Segundo número: ");
                numero2 = input.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Essa calculadora sabe ler apenas números!");
                input.next();
            }
        }

        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro: Dividir por zero dá erro no sistema!");
                    System.exit(1);
                }
                break;
            default:
                System.out.println("Erro: Operador inválido.");
                System.exit(1);
        }

        System.out.println("Resultado: " + resultado);

        input.close();
        System.exit(0);
    }
}
