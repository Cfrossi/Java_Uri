import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int num,pares;

        pares = 0;

        for (int contador = 1; contador <=5; contador +=1){
            num = teclado.nextInt();
            if ( num % 2 == 0){
                pares = pares + 1;
            }
        }
        System.out.println(pares + " valores pares");
    }
}