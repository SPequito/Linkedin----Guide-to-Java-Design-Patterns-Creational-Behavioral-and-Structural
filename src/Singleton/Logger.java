/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author stefa
 */
// need to be enum class with the instance object this help to dont have tread problems because enum are only create one time
public enum Logger {
        
    INSTANCE;

    // we can have or not because a enum class is private but having its more easy to read Logger
    private Logger() {
    }


    //were we create get method to get your instance
    public static Logger getInsLogger(){
        return INSTANCE;

    }

    void log(String logMessage) {
        System.out.println(logMessage);
    }

}

