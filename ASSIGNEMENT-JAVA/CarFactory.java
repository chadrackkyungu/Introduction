public abstract class CarFactory {
    public abstract void allocateAccessories();

    public abstract void paintCar();

    public abstract void assembleBody();

    public abstract void addWheels();

    public abstract void conductSafetyTests();

    public void buildCar() {
        allocateAccessories();
        paintCar();
        assembleBody();
        addWheels();
        conductSafetyTests();
    }
}
