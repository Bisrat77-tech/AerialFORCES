public class BomberJet extends Jet {
    protected int bombCapacity;
    protected double payloadWeight;
    protected boolean hasNuclearCapability;

    public final class Payload{
        public double weight;
        public Payload(double weight){
            this.weight =weight;
        }
    }
    public BomberJet(String model, String manufacturer, double enginePower,
                     int year, int wingSpan, int maxAltitude,
                     int maxSpeed, int fuelCapacity, int passengerCapacity,
                     int bombCapacity, double payloadWeight, boolean hasNuclearCapability){
        super(model, manufacturer, enginePower, year, wingSpan, maxAltitude,
                maxSpeed, fuelCapacity, passengerCapacity);
        this.bombCapacity =bombCapacity;
        this.payloadWeight = payloadWeight;
        this.hasNuclearCapability = hasNuclearCapability;
    }
    @Override
    public void fly(){
        System.out.println("Flying" + model + "bomber cruising at Mach:"+ maxSpeed);
        System.out.println("Carrying"+ payloadWeight + "tons of payload");
    }

    public void dropBombs(){
        if (bombCapacity>0){
            System.out.println("Bomb Dropping" + bombCapacity + " bombs!");
        }else {
            System.out.println("No bombs left");
        }
    }
    public final void deployCountermeasures(){
        System.out.println("Deploying countermeasures!");
    }
}
