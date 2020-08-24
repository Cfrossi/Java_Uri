import java.util.Scanner;

public class Uri1067{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int X,impar;
        X = teclado.nextInt();
        impar = 1;

        for( int contador = 1; contador <=X; contador ++ ){
                System.out.println(impar);
                impar +=2;
                contador +=1;

        }
                
            

    }
}


