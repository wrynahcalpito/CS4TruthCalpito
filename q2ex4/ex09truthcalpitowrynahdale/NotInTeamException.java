/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package ex09truthcalpitowrynahdale;

/**
 *
 * @author USER
 */
public class NotInTeamException extends Exception {

    /**
     * Creates a new instance of <code>NotInTeamException</code> without detail
     * message.
     */
    public NotInTeamException() {
    }

    /**
     * Constructs an instance of <code>NotInTeamException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NotInTeamException(String msg) {
        super(msg);
    }
}
