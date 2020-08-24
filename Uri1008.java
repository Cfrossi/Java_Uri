import java.util.Scanner;

public class Uri1008 {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int NUMBER,HORAS;
        float VALORHORA,SALARY;

        NUMBER = teclado.nextInt();
        HORAS = teclado.nextInt();
        VALORHORA = teclado.nextFloat();

        SALARY = VALORHORA * HORAS;

        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = %.2f", SALARY);

    }
}