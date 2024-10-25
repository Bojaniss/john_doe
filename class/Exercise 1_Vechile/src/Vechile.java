public class Vehicle{
    String model;
    private int num_passenger;
    private double gas_capacity;
    private double fuel_consumption; //l/100km

    public double distance(){
        double fuel_cons_1km = fuel_consumption/100;

        return gas_capacity / fuel_cons_1km;
    }

    public void compare(Vehicle){
        if(this.distance() > other_vehicle.disctance(){
        System.out.println(this.model + " can we go further than " + other_vehicle.model);
    }else if (this.distance() == other_vehicle.distance() {
            System.out.println(this.model + " can we go further than " + other_vehicle.model); }
    public Vehicle(String model, int num_passenger, double gas_capacity, double fuel_consumption) {
        this.model = model;
        this.num_passenger = num_passenger;
        this.gas_capacity = gas_capacity;
        this.fuel_consumption = fuel_consumption;
    }
}

