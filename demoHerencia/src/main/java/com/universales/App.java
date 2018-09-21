package com.universales;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Moto m1;
        Carro c1;

        m1 = new Moto();
        m1.marca = "Honda";
        m1.avanzar();
        m1.quebrarRetrovisor();

        c1 = new Carro();
        c1.marca = "Ford";
        c1.avanzar();

        //System.out.println( "Hello World!" );
    }
}
