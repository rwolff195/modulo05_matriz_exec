package aplicacao;

import java.util.Scanner;

public class ProgPrincipal {

	public static void main(String[] args) {
		/*
		Fazer um programa para ler dois números inteiros M e N, e depois ler uma matriz de M linhas por N colunas contendo números inteiros,
		podendo haver repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para cada ocorrência de X, mostrar os valores à
		esquerda, acima, à direita e abaixo de X, quando houver, conforme exemplo.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		//Parte 1 - Criar a matriz de m e n e enserir os dados
		
		System.out.print("Entre com o numero de linhas da Matriz: ");
		int m = sc.nextInt();
		System.out.print("Entre com o numero de colunas da Matriz: ");
		int n = sc.nextInt();
		
		int[][] matriz = new int[m][n];
		
		for (int i=0; i<matriz.length; i++) {
			System.out.println("Entre com os dados da lina # " + i + " : ");
			for (int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		//Parte 2 - ler um numero e depois exibir a posição e numeros do lados e abaixo e acima
		
		System.out.println();
		System.out.print("Insira um numero que esta na Matriz: ");
		int numero = sc.nextInt();
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				if (matriz[i][j] == numero) {
					System.out.println("Posição = Linha: " + i + " Coluna: " + j);
					if (j > 0) {
					System.out.println("Esquerda: " + matriz[i][j-1]);
					}
					if (i > 0) {
					System.out.println("Esquerda: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length-1) {
					System.out.println("Esquerda: " + matriz[i][j+1]);
					}
					if (i < matriz.length-1) {
					System.out.println("Esquerda: " + matriz[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}
