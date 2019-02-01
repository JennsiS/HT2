

import java.util.Vector;



/**
 * @author Jennifer Sandoval,Andrea Paniagua
 * @param <E>
 * @Carne 18962,18733
 * @date 25/01/19
 * @name Pila.java
 * <p> Esta clase implementa la interfaz Stack y se reescriben los metodos en funcion de un vector</p>
 * */



public class Pila <E> implements Stack <E> {

    /**
     *
     */
    protected Vector <E> texto;

    /**
     *
     */
    public Pila(){
       Vector texto= new Vector<E> ();
    }
    
    /**
     *
     * @param item , recibe un parametro de tipo generico el cual es ingresado al vector
     */
    @Override
    public void push(E item) {
        texto.add(item);
    }

    /**
     *
     * @return devuelve el ultimo elemento del vector
     */
    @Override
    public E pop() {
        return texto.remove(size() - 1);
        
    }

    /**
     *
     * @return verifica si el elemento se encuentra dentro del vector
     */
    @Override
    public E peek() {
        return texto.get(size() - 1);
    }

    /**
     *
     * @return devuelve una respuesta de si el vector esta vacio o no
     */
    @Override
    public boolean empty() {
        return size() == 0;
    }

    /**
     *
     * @return devuelve el tamaño del vector
     */
    @Override
    public int size() {
        return texto.size();
    }
        



   
   
    
}

