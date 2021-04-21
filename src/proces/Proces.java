/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proces;

/**
 *
 * @author Lenovo
 */
public interface Proces {

    public default void process(){
        processLogic();
    }
    void processLogic();

}
