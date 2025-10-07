/*Programa em java contendo metodo. o metodo devera fazer a entrada de um
valor inteiro e fazer a impres]ao da tabuada do mesmo*/

import java.util.Scanner;

public class Exemplo01{
    public static void main(String[] args) {
        calcular();
    }
    public static void calcular(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero*i));
        }
    }
}