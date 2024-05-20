public class SUV extends CarFactory {
    @Override
    public void allocateAccessories() {
        System.out.println("Allocating accessories for SUV.");
    }

    @Override
    public void paintCar() {
        System.out.println("Painting the SUV.");
    }

    @Override
    public void assembleBody() {
        System.out.println("Assembling body of the SUV.");
    }

    @Override
    public void addWheels() {
        System.out.println("Adding wheels to the SUV.");
    }

    @Override
    public void conductSafetyTests() {
        System.out.println("Conducting safety tests for SUV.");
    }
}
