// autor: Jaasiel Antunes

package br.com.fafic.estudos.principal;

import br.com.fafic.estudos.classes.Correspondencia;
import br.com.fafic.estudos.classes.Entregador;

public class Principal {

	public static void main(String[] args) {
		
		Correspondencia correspondencia1 = new Correspondencia("20/08/2021", "Kabum Informática", "José Aldo");
		Correspondencia correspondencia2 = new Correspondencia("27/08/2021", "Magazine Luiza", "Maria da Silva");
		Correspondencia correspondencia3 = new Correspondencia("11/09/2021", "Lojas Americanas", "Pedro Alves");
			
		Entregador entregador = new Entregador(3);
		
		entregador.push(correspondencia1);
		entregador.push(correspondencia2);
		entregador.push(correspondencia3);
		entregador.imprimir();
		
		System.out.println("====== Removendo correspondência 3 ======");
		System.out.println();
		entregador.pop();
		entregador.imprimir();
		
		// verifica se o vetor está vazio
		System.out.println("Vazio: " + entregador.isEmpty());
		System.out.println();
		
		// verifica se o vetor está cheio
		System.out.println("Cheio: " + entregador.isFull());
	}
}
