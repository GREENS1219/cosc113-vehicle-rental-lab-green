public class Car extends Vehicle{
    private int door;
    String type = "Car";
    public Car(int year, int door, String brand){
        super(brand,year);
        this.door = door;
    }
    public void describe(){
        super.describe();
        System.out.println("Doors: " + door);
    }
    public void showTypes(){
        System.out.println(super.type + " " + type);
    }
    public int getDoors(){
        return door;
    }
    public void setDoor(int door){
        if((door != 2) && (door != 4)){
            System.out.println("Invalid Number");
        } else {
            this.door = door;
        }
    }
}
