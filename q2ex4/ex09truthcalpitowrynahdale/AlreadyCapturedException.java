/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package ex09truthcalpitowrynahdale;

/**
 *
 * @author USER
 */
public class AlreadyCapturedException extends Exception {

    /**
     * Creates a new instance of <code>AlreadyCapturedException</code> without
     * detail message.
     */
    public AlreadyCapturedException() {
    }

    /**
     * Constructs an instance of <code>AlreadyCapturedException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public AlreadyCapturedException(String msg) {
        super(msg);
    }
}
