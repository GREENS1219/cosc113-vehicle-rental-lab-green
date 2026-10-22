public class Vehicle{
    private int speed;
    private int year;
    private String brand;
    String type = "Vehicle";

    public Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }
    public int getSpeed(){
        return speed;
    }
    public int getYear(){
        return year;
    }
    public String getBrand(){
        return brand;
    }
    public String getType(){
        return type;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void describe(){
        System.out.println("Vehicle: "+ brand + " (" + year+ ")");
    }
    public void accelerate(int amount){
        speed += amount;
    }
}
