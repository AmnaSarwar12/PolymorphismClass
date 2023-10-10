public class Car {
    private String Description;

    public Car(String description) {
        Description = description;
    }

    public void StartEngine(){
        System.out.println("The Car is starting");
    }

    public void Drive(){
        System.out.println("car is now moving at normal speed, Car type is"+getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine(){
        System.out.println("the car Engine is running");
    }
}

 class GasPoweredCar extends Car{

    private double averagekmperlitr;
    private int cylinder = 6;

     public GasPoweredCar(String description, double averagekmperlitr, int cylinder) {
         super(description);
         this.averagekmperlitr = averagekmperlitr;
         this.cylinder = cylinder;
     }

     @Override
     public void StartEngine() {
         System.out.println("all Cylinders are fired up and ready"+cylinder );
     }
     @Override
     protected void runEngine() {
         System.out.println("Usage exceeds the average" +averagekmperlitr);
     }
 }

 class ElectricCar extends Car{

    private double avgkmpercharge;
    private int batterySize;

     public ElectricCar(String description, double avgkmpercharge, int batterySize) {
         super(description);
         this.avgkmpercharge = avgkmpercharge;
         this.batterySize = batterySize;
     }

     @Override
     public void StartEngine() {
         System.out.println("BEV-> Battery on Ready"+ batterySize);
     }

     @Override
     protected void runEngine() {
         System.out.println("usage under the average" +avgkmpercharge);
     }
 }

class HybridCar extends Car{

    private double avgkmperlitr;
    private int batterySize;

    private int Cylinder = 6;

    public HybridCar(String description, double avgkmperlitr, int batterySize, int Cylinder) {
        super(description);
        this.avgkmperlitr = avgkmperlitr;
        this.batterySize = batterySize;
        this.Cylinder = Cylinder;
    }

    @Override
    public void StartEngine() {
        System.out.println("BEV-> Battery on Ready"+ batterySize);
        System.out.println("Cylinders are fired up at" +Cylinder);
    }

    @Override
    protected void runEngine() {
        System.out.println("usage under the average" +avgkmperlitr);
    }
}
