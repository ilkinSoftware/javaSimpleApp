/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proces;

import bean.Config;

/**
 *
 * @author Lenovo
 */
public interface Saveable extends Proces{
    
    public default void process(){
        processLogic();
        Config.save();
    }
}
