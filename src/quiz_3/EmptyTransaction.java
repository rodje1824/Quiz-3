/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_3;

/**
 *
 * @author DOTR
 */
class EmptyTransaction extends Exception {
        public EmptyTransaction(){
        super("The Queue is empty. Cannot make transaction");
    }
}
