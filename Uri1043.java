import java.util.Scanner;
public class Uri1043 {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        float A,B,C;
        float perimetro,area;

        A = teclado.nextFloat();
        B = teclado.nextFloat();
        C = teclado.nextFloat();

        if ((A + B > C) && (B + C > A) && (C + A > B)){
            perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f\n",perimetro);
        }
        else{
            area = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f\n", area);
        }
    }

}