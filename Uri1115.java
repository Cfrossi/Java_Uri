import java.util.Scanner;

public class Uri1115{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int X,Y;

        X = teclado.nextInt();
        Y = teclado.nextInt();

        while( (X != 0) && (Y !=0) ){
            if ((X >= 0 ) && (Y >=0) ){
                System.out.println("primeiro");
            }
            else if ((X<= 0) && (Y>=0)){
                System.out.println("segundo");
            }
            else if((X<=0)&& (Y<=0)){
                System.out.println("terceiro");
            }
            else if((X>=0) && (Y<=0)){
                System.out.println("quarto");
            }
             X = teclado.nextInt();
             Y = teclado.nextInt();

        }
    }
}