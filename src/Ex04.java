import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = sc.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = sc.nextDouble();


        double delta = calcularDelta(a, b, c);
        System.out.println("Delta (Δ) = " + delta);



        if (delta >= 0) {
            calcularRaizes(a, b, delta);
        } else {
            System.out.println("Não existem raízes reais para a equação.");
        }
    }


    public static double calcularDelta(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }


    public static void calcularRaizes(double a, double b, double delta) {
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes são reais e distintas:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("A equação tem uma raiz real: x = " + x);
        }
    }
}
