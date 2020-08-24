import java.util.Scanner;

public class Uri1144{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int X,num,valor;

        valor = 1;
        num  = 1;


        X = teclado.nextInt();

        do{
            //System.out.print(num + " ");
            //num +=1;
            //System.out.print(num + " ");
            //num +=1;
            //System.out.print(num + " ");
            
            //System.out.print("PUM\n");
            System.out.println(num + " " + (num * num) + " " +(num * num * num));
            System.out.println(num + " " + ((num * num) + 1) + " " +((num * num * num) +1));
            num +=1;
            valor +=1;
        } while (valor <=X);
    }
}