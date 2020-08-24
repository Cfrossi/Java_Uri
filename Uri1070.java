import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int X,contador;
        contador = 1;

        X = teclado.nextInt();

        if (X % 2 ==0){
            X ++;
        }
        while (contador <=6){
            System.out.println(X);
            X +=2;
            contador ++;
            
        }
    }
}
