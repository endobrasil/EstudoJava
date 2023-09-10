import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Desafio
 * Você está trabalhando para uma empresa que utiliza extensivamente os serviços da AWS,
 * e após algumas análises a equipe de segurança identificou que algumas senhas dos usuários
 * no IAM são fracas e podem representar um risco à segurança dos dados da empresa.
 * Para resolver esse problema, foi solicitado que você desenvolva um programa
 * capaz de analisar as senhas dos usuários e fornecer uma validação de força com base em
 * critérios predefinidos.
 *
 * Requisitos de segurança para a senha:
 *
 * A senha deve ter no mínimo 8 caracteres.
 * A senha deve conter pelo menos uma letra maiúscula (A-Z).
 * A senha deve conter pelo menos uma letra minúscula (a-z).
 * A senha deve conter pelo menos um número (0-9).
 * A senha deve conter pelo menos um caractere especial, como !, @, #, $, %, etc.
 * Saiba mais sobre o Regex em: Java Regular Expressions
 *
 * Entrada
 * A entrada será uma única string representando a senha que precisa ser validada.
 *
 * Saída
 * Seu programa deve retornar uma mensagem indicando se a senha fornecida pelo
 * usuário atende aos requisitos de segurança ou não, juntamente com um feedback
 * explicativo sobre os critérios considerados.
 *
 * Entrada	            Saída
 * 0101	                -> Sua senha e muito curta. Recomenda-se no minimo 8 caracteres.
 * 030609Saturno*	    -> Sua senha atende aos requisitos de seguranca. Parabens!
 * 010203Jupiter	    -> Sua senha nao atende aos requisitos de seguranca.
 *
 *
 * Dado de entrada:
 * 030609Saturno*
 * Saída esperada:
 * Sua senha atende aos requisitos de seguranca. Parabens!
 *
 *
 * Dado de entrada:
 * 010203Jupiter
 * Saída esperada:
 * Sua senha nao atende aos requisitos de seguranca.
 *
 *
 * 0101
 * Saída esperada:
 * Sua senha e muito curta. Recomenda-se no minimo 8 caracteres.
 *
 * System.out.println("A{123456".matches("(?=.*[}{,.^?~=+\\-_\\/*\\-+.\\|])(?=.*[a-zA-Z])(?=.*[0-9]).{8,}")); //exemplo que passa
 *      System.out.println("ASD1ASDA".matches("(?=.*[}{,.^?~=+\\-_\\/*\\-+.\\|])(?=.*[a-zA-Z])(?=.*[0-9]).{8,}")); //exemplo que nao passa (falta caractere especial)
 *      System.out.println("ASDAS^^?".matches("(?=.*[}{,.^?~=+\\-_\\/*\\-+.\\|])(?=.*[a-zA-Z])(?=.*[0-9]).{8,}")); //exemplo que nao passa (falta numero)
 *      System.out.println("123^8542".matches("(?=.*[}{,.^?~=+\\-_\\/*\\-+.\\|])(?=.*[a-zA-Z])(?=.*[0-9]).{8,}")); //exemplo que nao passa (falta letra)
 *      System.out.println("WWEA^^1".matches("(?=.*[}{,.^?~=+\\-_\\/*\\-+.\\|])(?=.*[a-zA-Z])(?=.*[0-9]).{8,}")); //exemplo que nao passa (nao tem minimo de 8 caracteres)
 */
public class VerificandoSenhas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Digite a senha para verificar a força:");
        String senha = scanner.nextLine();
        //scanner.close();

        String resultado = verificarForcaSenha(senha);
        System.out.println(resultado);
    }

    public static String verificarForcaSenha(String senha) {
        int comprimentoMinimo = 8;
        String str=null;

        // Critérios de validação usando expressões regulares

        boolean temLetraMaiuscula = Pattern.compile("[A-Z]").matcher(senha).find();
        boolean temLetraMinuscula = Pattern.compile("[a-z]").matcher(senha).find();
        boolean temNumero = Pattern.compile("\\d").matcher(senha).find();
        boolean temCaractereEspecial = Pattern.compile("(?=.*[@!#$%^&*()/\\\\])").matcher(senha).find();
        boolean temSequenciaComum = senha.matches(".*(?i)123456.*|.*(?i)abcdef.*");
        boolean temPalavraComum = senha.equalsIgnoreCase("password") || senha.equalsIgnoreCase("123456") || senha.equalsIgnoreCase("qwerty");


        boolean teste=temLetraMaiuscula&&temLetraMinuscula&&temNumero&&temCaractereEspecial&&!temSequenciaComum&&!temPalavraComum;


        // TODO: Verifique o comprimento mínimo e critérios de validação

        boolean temComprimentoMinimo=senha.length()>=comprimentoMinimo;

        if(!temComprimentoMinimo){
            str="Sua senha e muito curta. Recomenda-se no minimo 8 caracteres.";
        }else if (teste) {
            str="Sua senha atende aos requisitos de seguranca. Parabens!";
        } else{
            str="Sua senha nao atende aos requisitos de seguranca.";
        }

        return str;
    }
}