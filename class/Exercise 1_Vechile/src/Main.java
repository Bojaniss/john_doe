public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(model: "Leon" , num_passenger 4, gas_capacity 65, fuel_consumption 12.5)
        Vehicle vehicle2 = new Vehicle(model: "Golf", num_passenger 4, gas_capacity)
        System.out.println("vehicle1.getModel() + "can go + vehicle1.distance());
       System.out.println("vehicle2.getModel() + " can go + vehicle2.distance());
       vehicle1.compare(vehicle2);
       vehicle2.compare(vehicle1);
}