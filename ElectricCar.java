public class ElectricCar extends Car{
    private int batteryLevel;

    public ElectricCar(String brand, int speed, int year, int door, int batteryLevel){
        super(year,door,brand);
        setSpeed(speed);
        if((batteryLevel >= 0) && (batteryLevel <= 100)){
            this.batteryLevel = batteryLevel;
        } else{
            System.out.println("Invalid battery");
        }
    }
    public void accelerate(int amount){
        super.accelerate(amount);
        if(batteryLevel > 0){
            batteryLevel-=1;
        }
    }

    public void describe(){
        super.describe();
        System.out.println("Battery level: " + batteryLevel);
    }
}
