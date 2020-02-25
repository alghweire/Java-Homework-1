package com.testpro.hw4;

class Car {



    private String Country_Of_Car;
    private String model;
    private String make;


    public String getCountry_Of_Car() {
        return Country_Of_Car ;
    }

    public String getModel() {
        return model;
    }

    public String getMake (){
        return make;
    }

    public void setCountry_Of_car(String c){
        this.Country_Of_Car = c;

    }
    public void setModel(String m){
        this.model = m;
    }
    public void setMake(String maker){
        this.make = maker;
    }
}

class Main {
    public static void main(String[] args) {

        Car audi = new Car();
        Car bmw = new Car();
        Car mercedes = new Car();

        audi.setCountry_Of_car("Germany");
        audi.setMake("Audi");
        audi.setModel("rs7");

        bmw.setCountry_Of_car("Germany");
        bmw.setMake("bmw");
        bmw.setModel("M4");

        mercedes.setCountry_Of_car("Germany");
        mercedes.setMake("Mercedes");
        mercedes.setModel("S550");

        System.out.println("Country of Car: " + audi.getCountry_Of_Car() + "\n "  +  "Car Make :  " + audi.getMake() + "\n " +  "Car Model: " + audi.getModel() +" \n ");

        System.out.println("Country of Car: " + bmw.getCountry_Of_Car() + "\n "  +  "Car Make :  " + bmw.getMake() + " \n " +  "Car Model: " + bmw.getModel() + " \n ");

        System.out.println("Country of Car: " + mercedes.getCountry_Of_Car() + "\n "  +  "Car Make :  " + mercedes.getMake() + " \n " +  "Car Model: " + mercedes.getModel()+" \n ");
    }

}