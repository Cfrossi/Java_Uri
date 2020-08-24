import java.util.Scanner;

public class Uri1114{
    public static void main(String args[]){
        Scanner teclado;
        teclado  = new Scanner(System.in);

        int senha,num;
        senha = 2002;
        num = 0;

        while(num != senha){
            num = teclado.nextInt();
            if (num == senha){
                System.out.println("Acesso Permitido");
            }
            else{
                System.out.println("Senha Invalida");
            }
            
        }

    }
}