public class Jet extends Aircraft{
    protected int maxSpeed;
    protected int fuelCapacity;
    protected int passengerCapacity;

    public Jet(String model, String manufacturer, double enginePower,
               int year, int wingSpan, int maxAltitude, int maxSpeed, int fuelCapacity,
               int passengerCapacity){
        super(model, manufacturer, enginePower, year, wingSpan, maxAltitude);
        this.maxSpeed = maxSpeed;
        this.fuelCapacity = fuelCapacity;
        this.passengerCapacity = passengerCapacity;

        this.displayJetSpecs();
    }

    @Override
    public void start(){
        System.out.println("Starting jet engines:" + model);
        System.out.println("Engine Power:" + getEnginePower() + "kN");
    }

    @Override
    public void fly(){
        super.fly();
        System.out.println(model + "jet flying at Mach" + maxSpeed);
    }
    public void displayJetSpecs(){
        System.out.println("== JET SPECIFICATIONS ==");
        System.out.println("Model: " + this.model);
        System.out.println("Max speed: Mach" + this.maxSpeed);
        System.out.println("Fuel Capacity:" + this.fuelCapacity + "L");
    }
    public static void jetType(){
        System.out.println("This is a jet aircraft");
    }

}
