import java.util.Scanner;

public class Uri1060{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        float num,somapositivo;
        int contador,positivo;
        contador = 1;
        positivo = 0;
        somapositivo = 0;

        while( contador <=6){
            num = teclado.nextFloat();
            contador +=1;
        if (num > 0){
            positivo +=1;
            somapositivo +=num;
        }

        }
        System.out.println(positivo + " valores positivos");

    }

}