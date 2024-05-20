public class TestFactoryPattern {
    public static void main(String[] args) {
        CarFactory hatchback = new Hatchback();
        CarFactory sedan = new Sedan();
        CarFactory suv = new SUV();

        System.out.println("Building a Hatchback:");
        hatchback.buildCar();
        System.out.println("\nBuilding a Sedan:");
        sedan.buildCar();
        System.out.println("\nBuilding an SUV:");
        suv.buildCar();
    }
}
