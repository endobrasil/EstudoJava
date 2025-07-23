/*
 * Desafio
Você está encarregado de depurar um módulo de processamento de pedidos em um sistema de vendas.
 O código atual contém erros de lógica e de sintaxe, e sua missão é corrigi-los para que as regras 
 de negócio funcionem corretamente.

Regras de negócio:
Se o valor dos itens (itemsValue) for maior ou igual a R$200, o frete deve ser gratuito.
Se for a primeira compra do cliente (firstPurchase), aplicar 5% de desconto sobre o valor dos itens.
O valor final do pedido deve ser: valor com desconto + frete (ou zero, se frete grátis).
💡 Uma opção para te ajudar durante o processo de depuração é o uso do GitHub Copilot, que pode sugerir correções de código.

Entrada
A entrada é composta por:

double itemsValue: valor total dos produtos comprados.
double shipping: valor do frete.
boolean firstPurchase: se é a primeira compra do cliente.
Saída
Exibir o valor final do pedido, com duas casas decimais, após aplicar as regras de desconto e frete.

Exemplos
Entrada	    Saída
250.00
20.00
false	    250.00
210.00
30.00
true	    199.50
100.00
15.00
false	    115.00
 */

import java.util.Scanner;

public class OrderProcessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        double itemsValue = scanner.nextDouble();
        double shipping = scanner.nextDouble();
        boolean firstPurchase = scanner.nextBoolean();

        double discount = 0.0;

        if (firstPurchase == true) {
            discount = itemsValue * 0.05;
        }

        double discountedValue = itemsValue - discount;
    

        if (itemsValue > 200.0) {
            shipping = 0;
        }

        double finalValue = discountedValue + shipping;
        

         
         String numeroFormatado = String.format("%.2f", finalValue);
         System.out.println(numeroFormatado);

        scanner.close();
    }
}