/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author stefa
 */
public class Dog {
    // were we are create a logger with the getInsLogger INSTANCE
    private final Logger logger = Logger.getInsLogger();

    public void woof() {
        logger.log("Woof");
    }



}
