/*
1. The field should be private to control data access.
2. It will throw an error because it will determine that you are trying to use the private fields from the other class.
3. this. refers to instance variables within constructors, super() refers back to that data from the parent class.
 */

public class Main {
    public static void main(String[] args){
        Car c1 = new Car(2000,4,"Toyota");
        ElectricCar e1 = new ElectricCar("Tesla", 80, 2020, 4,101);

        e1.accelerate(5);
        e1.showTypes();
        e1.describe();
        c1.describe();
        //System.out.println(c1.speed);
    }
}
