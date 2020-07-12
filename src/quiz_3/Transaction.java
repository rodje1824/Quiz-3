/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_3;

/**
 *
 * @author DOTR
 * @param <E>
 */
public interface Transaction<E> {
    public void enqueue(E e);
    public E dequeue() throws EmptyTransaction; 
    public E first() throws EmptyTransaction;
    public int size();
    public boolean isEmpty();
}
