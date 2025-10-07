/*programa em java para ler 2 valores no metodo main em seguida, um metodo
devera somar e imprimir os valores
 */

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int num2 = sc.nextInt();

        somar(num1, num2);
    }
    public static void somar(int num1, int num2){
        int resultado = num1 + num2;
        System.out.println("A soma de " + num1 + " + " + num2 + " é igual a " + resultado);
    }
}
