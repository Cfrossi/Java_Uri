import java.util.Scanner;
public class Exercicio5 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        float distancia,velocidadeMedia,tempo, consumo;


        System.out.println("Digito um valor para a distancia: ");
        tempo = teclado.nextFloat();
        System.out.println("Digite um valor para a velocidade : ");
        velocidadeMedia = teclado.nextFloat();

        distancia = velocidadeMedia * tempo;
        consumo = distancia/ 12;

        System.out.println("Voce gastou : " + consumo +" litros de combustivel");

    }
}