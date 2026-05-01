
public class FighterJet extends Jet{
    protected int missileCount;
    protected boolean hasStealth;
    protected int targetLockSystem;

    public FighterJet(String model, String manufacturer, double enginePower,
                      int year, int wingSpan, int maxAltitude,
                      int maxSpeed, int fuelCapacity, int passengerCapacity,
                      int missileCount, boolean hasStealth, int targetLockSystem){
        super(model, manufacturer, enginePower, year, wingSpan, maxAltitude,
                maxSpeed, fuelCapacity, passengerCapacity);
        this.missileCount = missileCount;
        this.hasStealth = hasStealth;
        this.targetLockSystem = targetLockSystem;
    }
    @Override
    public void start(){
        System.out.println("Fighter jet " + model + "starting combat engines!");
        System.out.println("Target lock system:" + targetLockSystem + "ready");
    }
    @Override
    public void fly(){
        System.out.println("Fly:" + model + "fighter jet engaging afterburners!");
        System.out.println("Current speed: Mach" + maxSpeed);
        if (hasStealth){
            System.out.println("Stealth mode activated!");
        }
    }
    public void fireMissile(){
        if (missileCount>0){
            System.out.println("Missile Fired!" + missileCount +"remaining");
            missileCount--;
        }else {
            System.out.println("No missiles left!");
        }
    }
    public static void jetType(){
        System.out.println("This is a FIGHTER jet - built for air Superiority ");
    }
    public void showFullSpecs(){
        super.displayJetSpecs();
        System.out.println("Missile Count:" + missileCount);
        System.out.println("Stealth:" + (hasStealth ? "Yes" : "No"));
    }

}