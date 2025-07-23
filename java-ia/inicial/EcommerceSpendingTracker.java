/* 
Desafio
Você está desenvolvendo um sistema simples para um e-commerce que deseja registrar os valores das compras realizadas por um cliente ao longo de um único dia. O sistema deve primeiro receber a quantidade total de compras realizadas e, em seguida, solicitar o valor de cada uma dessas compras. Ao final, o sistema deve exibir o total gasto no dia e a média de valor por compra.

Entrada
A entrada deve receber:

Um número inteiro N que indica a quantidade de compras realizadas no dia.
Em seguida, N números do tipo double, cada um representando o valor de uma compra.
Saída
O programa deverá retornar:

O total das compras com duas casas decimais
A média de valor por compra com duas casas decima
Se N for 0 (ou seja, nenhuma compra registrada), o programa deverá exibir: "Nenhuma compra registrada."
Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada			Saída
3
100.00
200.50
50.00			350.50
				116.83
1
79.90			79.90
79.90
0				Nenhuma compra registrada.
*/


import java.util.Scanner;
import java.util.Locale;

public class EcommerceSpendingTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int purchaseCount = scanner.nextInt();

        if (purchaseCount == 0) {
            System.out.println("Nenhuma compra registrada.");
        } else {
            double totalSpent = 0.0;

            for (int i=0; i<purchaseCount;i++ ) {
            	totalSpent+=scanner.nextDouble();            	
            }

            System.out.printf("%.2f%n", totalSpent);
            System.out.printf("%.2f%n", totalSpent/purchaseCount); // TODO: Imprima a média
        }

        scanner.close();
    }
}