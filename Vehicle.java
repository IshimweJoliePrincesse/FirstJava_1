public class Vehicle {
     int speed;
    

    public Vehicle() {
        System.out.println("Vehicle constructor");
    }
}
class Toyota extends Vehicle {
    public Toyota(int speed) {
        super(speed); 
        System.out.println("Toyota constructor");
        System.out.println("Toyota speed: " + speed);
    }
}

class Main {
    public static void main(String[] args) {
        Toyota toyotaCar = new Toyota();
    }
}