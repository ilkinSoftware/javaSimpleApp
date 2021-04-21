/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

/**
 *
 * @author Lenovo
 */
public class MyException extends IllegalArgumentException{

    public MyException() {
        System.err.println("wrong password or username");
    }
    
    
    
}
