/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_3;

import singlylinkedlist.SList;
import singlylinkedlist.SNode;
/**
 *
 * @author DOTR
 * @param <E>
 */
public class Register<E> implements Transaction<E>{
     private SList<E> register;
     
     public Register(){
        register = new SList<>();
    }  
     
     
     @Override
    public void enqueue(E e) {
      register.addLast((SNode) e);
    }

     @Override
    public E dequeue()throws EmptyTransaction{
      if(register.size() == 0){
          
         throw new EmptyTransaction();
      } 
        return (E) register.removeFirst();
    }

    @Override
    public E first()throws EmptyTransaction{
        if(register.size() == 0){
            throw new EmptyTransaction();
        }
        return (E) register.first();
    }

    @Override
    public int size() {
        return register.size();
    }

    @Override
    public boolean isEmpty() {
       return register.isEmpty();
    }
    public void displayQueue(){
        register.showList();
    }
}
