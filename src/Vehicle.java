public class Vehicle{
  public String model;
  protected String manufacturer;
  private double enginePower;
  int yearOfProduction;

  public final String VEHICLE_TYPE = "Aerial Vehicle";

  public Vehicle(String model, String manufacturer, double enginePower, int year){
    this.model = model;
    this.manufacturer = manufacturer;
    this.enginePower = enginePower;
    this.yearOfProduction = year;
  }
  public final void showVehicleType(){
    System.out.println("Vehicle type:" + VEHICLE_TYPE);
  }

  public void start(){
    System.out.println(model + "is Starting...");

  }

  public static void vehicleInfo(){
    System.out.println("This is a vehicle");

  }
  protected double getEnginePower(){
    return enginePower;
  }

  public void displayInfo(){
    System.out.println("Model"+ model);
    System.out.println("Manufacturer" + manufacturer);
    System.out.println("Year:" + yearOfProduction);
  }
}
