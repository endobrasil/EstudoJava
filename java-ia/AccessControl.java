import java.util.Scanner;

public class AccessControl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados do usuário
        boolean hasPermission = scanner.nextBoolean(); // Lê um valor booleano (true ou false)
        int age = scanner.nextInt(); // Lê a idade como inteiro

        // TODO: Verifique condições de acesso
        
        if (hasPermission && age>=18){
          System.out.println("Acesso permitido");
          
        }else if(hasPermission && age<=18){
          System.out.println("Idade insuficiente");
        }else{
          System.out.println("Acesso negado");
        }

        scanner.close();
    }
}