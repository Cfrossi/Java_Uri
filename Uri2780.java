import java.util.Scanner;

public class Uri2780{
public static void main(String args[]){
    Scanner teclado;
    teclado = new Scanner(System.in);

    int valor;
    valor = teclado.nextInt();

        if (valor <= 800) {
            System.out.println("1");
        }
        else if ( valor <= 1400){
            System.out.println("2");
        }
        else if( valor <= 2000){
            System.out.println("3");
        }

    }
}