import java.util.Scanner;

public class Uri1051{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        float salario,imposto,dif,sobra;
        salario = teclado.nextFloat();

        if ((salario >=0) && (salario <=2000)){
            System.out.println("Isento");
        }
        else if((salario > 2000) && (salario <=3000)){
            dif = salario - 2000;
            imposto = (dif * 8) /100;
            System.out.println(imposto);
        }
        else if((salario > 3000) && (salario <=4500)){
            dif = salario - 2000;
            if (dif > 1000){

            }
        }

    }
}