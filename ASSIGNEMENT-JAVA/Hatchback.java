public class Hatchback extends CarFactory {
    @Override
    public void allocateAccessories() {
        System.out.println("Allocating accessories for Hatchback.");
    }

    @Override
    public void paintCar() {
        System.out.println("Painting the Hatchback.");
    }

    @Override
    public void assembleBody() {
        System.out.println("Assembling body of the Hatchback.");
    }

    @Override
    public void addWheels() {
        System.out.println("Adding wheels to the Hatchback.");
    }

    @Override
    public void conductSafetyTests() {
        System.out.println("Conducting safety tests for Hatchback.");
    }
}
