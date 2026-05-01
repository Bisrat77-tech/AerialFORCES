public class Aircraft extends Vehicle {
    protected int wingSpan;
    protected int maxAltitude;

    public Aircraft(String model, String manufacturer, double enginePower,
                    int year, int wingSpan, int maxAltitude){
        super(model, manufacturer, enginePower, year);
        this.wingSpan = wingSpan;
        this.maxAltitude = maxAltitude;
    }
    @Override
    public void start(){
        System.out.println(model + "Aircraft is preparing for takeoff...");
        super.start();
    }
    public void showManufacturer(){

        System.out.println("Manufacturer:" + super.manufacturer );
    }
    public void fly(){

        System.out.println( model + "is flying at" + maxAltitude + "feet");
    }
}
