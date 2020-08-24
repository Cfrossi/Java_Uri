import java.util.Scanner;

/*

*/

public class Exercicio3 {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        float SalarioMin,ConsumoKw ,ValorKw,Conta,ContaDesconto;

        System.out.println("Entre com o valor do salario minimo: ");
        SalarioMin = teclado.nextFloat();

        System.out.println("Entre com o kw gasto: ");
        ConsumoKw = teclado.nextFloat();

        ValorKw = SalarioMin / 700.0f;
        Conta = ConsumoKw * ValorKw;

        ContaDesconto = Conta - (Conta * (10f /100f));

        System.out.println("Preço por Kw: " + ValorKw);
        System.out.println("Valor da conta: R$" + Conta);
        System.out.println("Conta com desconto: R$" + ContaDesconto);
    }
}