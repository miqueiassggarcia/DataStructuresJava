package base;

import java.util.Arrays;

public class EstruturaEstatica<T> {
	protected T[] elementos;
	protected int tamanho;
	
	@SuppressWarnings("unchecked")
	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public EstruturaEstatica() {
		this(10);
	}
	
	protected boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	protected boolean adiciona(int posicao, T elemento) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		this.aumentaCapacidade();
		
		for(int i = this.tamanho; i >= posicao; i--) {
			this.elementos[i] = this.elementos[i-1];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
	}
	
	protected boolean estaVazia() {
		return this.tamanho == 0;
	}
	
	protected void remove(int pos) {
		if(!(pos >= 0 && pos < tamanho)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		
		for(int i = pos; i < tamanho-1; i++) {
			elementos[i] = elementos[i+1];
		}
		
		tamanho--;
	}
	
	@SuppressWarnings("unchecked")
	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for(int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	protected int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for (int i=0; i<this.tamanho-1; i++){
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if (this.tamanho>0){
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
}
