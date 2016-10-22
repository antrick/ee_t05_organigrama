/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;



public class NodoArbol<T> implements Comparable<NodoArbol<T>>{
	T dato;
	ListaSimplementeLigada<NodoArbol<T>> hijos;
	
    public NodoArbol(T dato) {
		this.dato = dato;
		hijos = new ListaSimplementeLigada<NodoArbol<T>>();
	}
    
    public NodoArbol(){
    	dato = null;
    	hijos = new ListaSimplementeLigada<NodoArbol<T>>();
    }

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public ListaSimplementeLigada<NodoArbol<T>> getHijos() {
		return hijos;
	}

	public void setHijos(ListaSimplementeLigada<NodoArbol<T>> hijos) {
		this.hijos = hijos;
	}
        
    
	@Override
	public int compareTo(NodoArbol<T> o) {
		// TODO Auto-generated method stub
		return 0;
	}
        
}

