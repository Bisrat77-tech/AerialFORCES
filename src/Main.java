public class Main{
    void main(){
        System.out.println("=" .repeat(60));
        System.out.println("AERIAL FORCES - COMPLETE PROJECT");

        // 1. Single Inheritance
        System.out.println("=".repeat(60));
        System.out.println("1. Single Inheritance: Vehicle → Aircraft");
        Aircraft aircraft = new Aircraft("Boeing 747","Boeing", 25000d,2020,
                68,45000);
        aircraft.start();
        aircraft.fly();

        // 2. Multilevel Inheritance
        System.out.println("2. Multilevel Inheritance: Vehicle → Aircraft → Jet");
        System.out.println("-".repeat(40));
        Jet jet = new Jet("Gulfstream G700", "Gulfstream", 15000d, 2022, 32,
                51000, 35, 12000, 19);
        jet.start();
        jet.fly();

        // 3. Hierarchical Inheritance
        System.out.println("3. Hierarchical Inheritance: Jet → FighterJet AND Jet → BomberJet");
        System.out.println("-". repeat(40));

        FighterJet f22 = new FighterJet("F-22 Raptor","Lock head Martin", 35000d
        , 2015, 44, 65000, 2500, 8200, 1, 8,
                true, 10);
        BomberJet b2 = new BomberJet("B-2 Spirit", "Northrop", 30000d,1997,
                52,50000, 77, 15000, 2,40,
                18,false);
        f22.start();
        f22.fly();
        System.out.println();
        b2.fly();
        // 4. Protected Access Modifier
        System.out.println("4. Protected Access Modifier");
        System.out.println("-".repeat(40));
        System.out.println("Accessing protected field 'manufacturer':" + f22.manufacturer);
        System.out.println("Accessing protected method via getter:" + f22.getEnginePower() + "kN");

        //5. Method Overriding
        System.out.println("5. Method Overriding");
        System.out.println("-". repeat(40));
        System.out.println("Each class implements its own start() and fly() methods:");

        Vehicle[] vehicles = {aircraft, jet, f22, b2};
        for (Vehicle v : vehicles){
            v.start();
            System.out.println();
        }
        // 6. This Keyword
        System.out.println("6.This Keyword");
        System.out.println("-". repeat(40));
        f22.showFullSpecs();

        // 7. Super Keyword
        System.out.println("7. SUPER KEYWORD(Methods & Fields)");
        System.out.println("-".repeat(40));
        f22.showManufacturer();

        // 8. SUPER() CONSTRUCTOR CALLS
        System.out.println("8. SUPER CONSTRUCTOR CALLS");
        System.out.println("-".repeat(40));
        System.out.println("Each constructor calls super() initialize parent classes");
        System.out.println("Chain: StealthFighter → FighterJet → Jet → Aircraft → Vehicle ");

        StealthFighter b21 = new StealthFighter("B-21 Raider","Northrop",32000,2023,
                48,60000,76,13000,2,12,true,
                100,100d,true);
        b21.fireMissile();

        // 9. FINAL CLASS
        System.out.println("9. Final Class");
        System.out.println("-".repeat(40));
        System.out.println("BomberJet contains final class 'Payload' that cannot be extended");
        BomberJet.Payload payload = b2.new Payload(18d);
        System.out.println("Payload weight:" + payload.weight+"tons");

        // 10. Final Method
        System.out.println("11. Final Method ");
        System.out.println("-".repeat(40));
        b2.deployCountermeasures();

        // 11. Method Hiding (Static methods)
        System.out.println("11. Method hiding ");
        System.out.println("-".repeat(40));
        Vehicle.vehicleInfo();
        Jet.jetType();
        FighterJet.jetType();

        // 12. Multiple Inheritance Restriction
        System.out.println("12. Multiple Inheritance Restriction");
        System.out.println("-".repeat(40));
        System.out.println("Java does NOT support multiple inheritance of classes");
        System.out.println("Cannot: class A extends B, C");
        System.out.println("Solution: Use interfaces");

        // 13. Implicit Super() Rules
        System.out.println("13.Implicit Super() Rules");
        System.out.println("-".repeat(40));
        System.out.println("Rule 1: super() must be first statement in constructor");
        System.out.println("Rule 2: If no super() is written, Java adds super() automatically");
        System.out.println("Rule 3: Parent class must have a constructor matching the call");

        // 14. Final Fields Demo
        System.out.println("14. Final Fields Demo");
        System.out.println("-".repeat(40));
        System.out.println("Final field VEHICLE_TYPE: " + f22.VEHICLE_TYPE);
        System.out.println("Cannot reassign final fields");

        // 15. Demonstrate fighter Operations
        System.out.println(" 15. FIGHTER JET OPERATIONS");
        System.out.println("-".repeat(40));
        f22.fireMissile();
        f22.fireMissile();

        System.out.println("\n" + "-".repeat(60));
        System.out.println("All Requirements Demonstrated Successfully!");
        System.out.println("-".repeat(60));

    }
}
