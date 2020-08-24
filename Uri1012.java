import java.util.Scanner;

public class Uri1012{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double A,B,C,AreaTriRetan,AreaTrapezio,Areaquadrado,AreaCirculo,pi,Arearetangulo;
        pi = 3.14159;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        AreaTriRetan = (A * C) / 2;
        AreaCirculo = pi * (C * C);
        AreaTrapezio = ((A + B) / 2) * C;
        Areaquadrado = B * B;
        Arearetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\n", AreaTriRetan);
        System.out.printf("CIRCULO: %.3f\n",AreaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n",AreaTrapezio);
        System.out.printf("QUADRADO: %.3f\n",Areaquadrado);
        System.out.printf("RETANGULO: %.3f\n",Arearetangulo);
    }
}