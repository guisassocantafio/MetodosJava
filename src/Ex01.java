import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor;

        System.out.print("Digite um valor: ");
        valor = sc.nextInt();

        dividir(valor);

    }

    public static void dividir(int valor){

        int aux;
        for (int i = 1; i <= valor; i++) {
            aux = valor % i;
            if ((aux) == 0){
                System.out.printf("O número " + i + " é divisor de " + valor);
                System.out.println();
            }
        }
    }
}