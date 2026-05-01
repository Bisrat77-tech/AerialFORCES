public class StealthFighter extends FighterJet {
    private double radarCrossSection;
    private boolean cloakingDevice;

    public StealthFighter(String model, String manufacturer, double enginePower,
                          int year, int wingSpan, int maxAltitude,
                          int maxSpeed, int fuelCapacity, int passengerCapacity,
                          int missileCount, boolean hasStealth, int targetLockSystem,
                          double radarCrossSection, boolean cloakingDevice){
        super(model, manufacturer, enginePower, year, wingSpan, maxAltitude,
                maxSpeed, fuelCapacity, passengerCapacity,
                missileCount, hasStealth, targetLockSystem);
        this.radarCrossSection = radarCrossSection;
        this.cloakingDevice = cloakingDevice;
    }
    @Override
    public void fireMissile(){
        System.out.println("Locking target ...");
        super.fireMissile();
    }
}
