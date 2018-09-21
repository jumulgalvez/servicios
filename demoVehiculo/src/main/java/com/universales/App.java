package com.universales;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Vehicle v1, v2;

        v1 = new Vehicle("001", "Perol", "honda civic");
        v1.avanzar();
    
        v2 = new Vehicle("002", "Pichirilo", "toyota tercel");
        v2.avanzar();
    
        System.out.println( "Hello World!" );
    }
}
