import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Ex06 {
    public static void main(String[] args) {

    }
    public static void preencherMatriz(int[][] m){
        Random rd = new Random();
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m.length; j++){
                m[i][j] = rd.nextInt(50);
            }
        }
    }
    public static void imprimirMatriz(int[][] m){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m.length; j++){
                System.out.println(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void maiorValor(){

    }
    public static void imprimirMaior(){

    }
}
