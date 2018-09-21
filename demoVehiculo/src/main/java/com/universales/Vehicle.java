package com.universales;

public class Vehicle {

    String vehicleId;
    String nameVehicle;
    String typeVehicle;

    public Vehicle(String arg1, String arg2, String arg3){
        this.vehicleId = arg1;
        this.nameVehicle = arg2;
        this.typeVehicle = arg3;
    }

    public void avanzar(){
        System.out.println("Soy el carro " + this.nameVehicle + " y estoy avanzando");
    }

}