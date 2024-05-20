public class Sedan extends CarFactory {
    @Override
    public void allocateAccessories() {
        System.out.println("Allocating accessories for Sedan.");
    }

    @Override
    public void paintCar() {
        System.out.println("Painting the Sedan.");
    }

    @Override
    public void assembleBody() {
        System.out.println("Assembling body of the Sedan.");
    }

    @Override
    public void addWheels() {
        System.out.println("Adding wheels to the Sedan.");
    }

    @Override
    public void conductSafetyTests() {
        System.out.println("Conducting safety tests for Sedan.");
    }
}
