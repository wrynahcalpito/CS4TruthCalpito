/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package ex09truthcalpitowrynahdale;

/**
 *
 * @author USER
 */
public class MonsterNotFoundException extends Exception{

    /**
     * Creates a new instance of <code>MonsterNotFoundException</code> without
     * detail message.
     */
    public MonsterNotFoundException() {
    }

    /**
     * Constructs an instance of <code>MonsterNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public MonsterNotFoundException(String msg) {
        super(msg);
    }
}
