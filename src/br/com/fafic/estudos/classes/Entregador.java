package br.com.fafic.estudos.classes;

public class Entregador {
	private Correspondencia vetor[];
	private int tamanhoReal;

	public Entregador(int tamanho) {
		vetor = new Correspondencia[tamanho];
		tamanhoReal = 0;
	}

	public Correspondencia[] getVetor() {
		return vetor;
	}

	public void setVetor(Correspondencia[] vetor) {
		this.vetor = vetor;
	}

	public int getTamanhoReal() {
		return tamanhoReal;
	}

	public void setTamanhoReal(int tamanhoReal) {
		this.tamanhoReal = tamanhoReal;
	}

	public void push(Correspondencia pilha) {
		if (tamanhoReal < vetor.length) {
			vetor[tamanhoReal] = pilha;
			tamanhoReal++;
		}
	}

	public void pop() {
		if (tamanhoReal > 0) {
			tamanhoReal--;
			vetor[tamanhoReal] = null;
		}
	}

	public boolean isEmpty() {
		if (tamanhoReal == 0) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (tamanhoReal == vetor.length) {
			return true;
		}
		return false;
	}

	public void imprimir() {
		int cont = 1;
		for (Correspondencia h : vetor) {
			System.out.println("Correspondência " + cont++ +" > " + h);
			System.out.println();
		}
	}
}
