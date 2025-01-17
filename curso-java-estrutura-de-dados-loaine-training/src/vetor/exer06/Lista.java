package vetor.exer06;

import java.lang.reflect.Array;

public class Lista<T> {


	private T[] elementos; 
	private int tamanho;

	// M�TODOS DOS EXERC�CIOS

	public boolean contem(T elemento) {

		return busca(elemento) >-1;

		//		MODO MAIS LONGO
		//		int posicao = this.busca(elemento);
		//		
		//		if (posicao!=-1) {
		//			return true;
		//		} else {
		//			return false;
		//		}

	}

	public int ultimoIndice(T elemento) {


		int ultimaPosicao = -1;

		for (int i=(this.tamanho-1); i>0; i--){
			if (this.elementos[i].equals(elemento)){
				ultimaPosicao = i;
				return ultimaPosicao;
			}
		}

		return ultimaPosicao;

		// 		MANEIRA MAIS SIMPLES, POR�M MAIS DEMORADO, POIS ITERA O ARRAY INTEIRO. A MELHOR MANEIRA � ITERAR DE TR�S PRA FRENTE, E A PRIMEIRA VEZ QUE ACHAR O ELEMENTO, J� PARAR
		//		int ultimaPosicao = -1;
		//		
		//		for (int i=0; i<this.tamanho; i++){
		//			if (this.elementos[i].equals(elemento)){
		//				ultimaPosicao = i;
		//			}
		//		}
		//
		//		return ultimaPosicao;

	}

	public T get(int posicao) {
		return this.busca(posicao);
	}

	@SuppressWarnings("unchecked")
	public boolean clear() {

		this.elementos = (T[]) new Object[this.elementos.length];
		this.tamanho = 0;
		
		return true;
	}


	// CONSTRUTORES
	public Lista(int capacidade){
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	public Lista(){
		this(10);
	}

	public Lista(int capacidade, Class<T> tipoClasse){
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}

	// M�TODOS
	public boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} 
		return false;
	}

	public boolean adiciona(int posicao, T elemento){

		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posi��o inv�lida");
		}

		this.aumentaCapacidade();

		for (int i=this.tamanho-1; i>=posicao; i--){
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}

	private void aumentaCapacidade(){
		if (this.tamanho == this.elementos.length){
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i=0; i<this.elementos.length; i++){
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	public T busca(int posicao){
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posi��o inv�lida");
		} 
		return this.elementos[posicao];
	}

	public int busca(T elemento){
		for (int i=0; i<this.tamanho; i++){
			if (this.elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;
	}

	public void remove(int posicao){
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		for (int i=posicao; i<this.tamanho-1; i++){
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}

	public void remove(T elemento){

		int pos = this.busca(elemento);
		if (pos > -1){
			this.remove(pos);
		}
	}

	public int tamanho(){
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
