public class Variaveis {
    public static void main(String args[]) {
        //int a;
        //int b;
        //int c;

        int a,b,c,d,e;

        a = 10;
        b = 8;

        c = a + b;

        System.out.println("Valor do a = " +a); //Concatenei o A a frase
        System.out.println("Valor do b = " +b); 
        System.out.println("Valor do c = " +c); 

        d = a / b;
        e = a % b;

        System.out.println("Valor do c = " +d); 
        System.out.println("resto da divisao = " +e);

        double x,y,z;

        x = 10.0;
        y = 8.0;
        z = x / y;

        // %f - para float/dougble
        // %d - para inteiros

        System.out.printf("Valor de x = %.2f\n", x);
        System.out.printf("Valor de x = %.2f\n", y);
        System.out.printf("Valor de x = %.2f\n", z);

        System.out.printf("Os 3 valores = %.2f %.2f %.2f\n", x,y,z);
    }
}