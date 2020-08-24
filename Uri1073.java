import java.util.Scanner;

public class Uri1073{
    public static void main(String args[]){
        Scanner teclado;
        teclado  = new Scanner(System.in);

        int N,num;
        
        N = teclado.nextInt();

        for(int contador =1; contador <=N; contador++){
            num = teclado.nextInt();
            if ((num % 2 ==0) && (num > 0)){
                System.out.println("EVEN POSITIVE");
            }
            else if ((num % 2 ==0) && (num < 0)){
                System.out.println("EVEN NEGATIVE");
            }
            else if ((num % 2 != 0) && (num > 0)){
                System.out.println("ODD POSITIVE");
            }
            else if ((num % 2 != 0) && (num < 0)){
                System.out.println("ODD NEGATIVE");
            }
            else if ((num % 2 == 0) && (num == 0)){
                System.out.println("NULL");
            }
        }

    }

}