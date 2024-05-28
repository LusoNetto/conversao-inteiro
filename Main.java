package projeto_new_go_teste;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String entrada = sc.nextLine();		
		boolean notPositivo = true;
		
		// Tamanho da entrada
		int len = entrada.length();
		// o primeiro caracter
		char firstChar = entrada.charAt(0);
		// variavel de controle para repeticão
		int i = 0;
		// verifico se o primeiro caracter é o '-'		
		if(firstChar == '-') {
			// se for '-' eu seto positivo para false
			notPositivo = false;
			// i recebe +1 se tiver o sinal para não converter o sinal em inteiro
			i++;
		}
		
		// valor padrao para saida
        int result = 0;
        // base do numero, esta em base 10
		int radix = 10;
		// Percorre todos os caracteres da string
		while (i < len) {
			// para cada digito ele converte para inteiro por meio do (int) 
            int digit = Character.digit(entrada.charAt(i++), radix);
            // usando a formula para colocar um numero na sua posição certa
            result *= radix;
            // Adcionando o numero no resultado final
            result -= digit;
        }
		if(notPositivo) {
			result*=-1;
		}
		int resultVezesDois = result * 2;
		int resultMenosDois = result - 2;
		int resultVezesMenosUm = result * -1;
		System.out.println("O numero é: " + result + "\nO numero vezes 2 é: " + resultVezesDois
				+ "\nO numero -2 é: " + resultMenosDois + "\nO numero vezes -1 é: " + resultVezesMenosUm);
		
		
	}
}
