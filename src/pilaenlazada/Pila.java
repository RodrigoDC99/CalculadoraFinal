package pilaenlazada;

import javax.swing.JOptionPane;

public class Pila {
    
    Nodo raiz;
    Nodo actual=raiz;
    int tamaño = 0;
    public Pila(){
        raiz = null;
    }
    public boolean empty(){
        boolean estado = false;
        if (raiz == null) {
            estado = true;
        }
        return estado;
    }
    public void push(int x){
        Nodo nuevo = new Nodo(x);
        if (empty()) {
            nuevo.siguiente=null;
            raiz=nuevo;
            
        }
        else{
            nuevo.siguiente=raiz;
            raiz=nuevo;
        }
        tamaño++;
    }
    public void mostrar(){
        while (raiz!=null) {            
            System.out.println(raiz.elemento);
            raiz=raiz.siguiente;
        }
    }
    
    public Object pop(){
        Object pop = 0;
        pop=(char) raiz.elemento;
        raiz=raiz.siguiente;
        tamaño--;
        return pop;
    }
    
    public int size(){
        return tamaño;
    }
    
    public Object peek(){
        
        Object cima=0;
        if (empty()) {
            Object ERROR_MESSAGE = JOptionPane.ERROR_MESSAGE;
        }
        else{
            cima=raiz.elemento;
        }return cima;
    }       
}
