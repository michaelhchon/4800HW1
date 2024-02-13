
public class Ship {
	private String name;
    private String yearBuilt;

    public Ship(String name, String yearBuilt) {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String newYearBuilt) {
        yearBuilt = newYearBuilt;
    }

    // Print function
    public void print() {
        System.out.println("Ship Name: " + name + "\nYear Built: " + yearBuilt);
    }
}

class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip(String name, String yearBuilt, int maxPassengers) {
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    // Getter and setter
    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int newMaxPassengers) {
        maxPassengers = newMaxPassengers;
    }

    @Override
    public void print() {
        System.out.println("Ship Name: " + getName() + "\nMax Passengers: " + maxPassengers);
    }
}

class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    // Getter and setter
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int newCargoCapacity) {
        cargoCapacity = newCargoCapacity;
    }

    @Override
    public void print() {
        System.out.println("Ship Name: " + getName() + "\nCargo Capacity: " + cargoCapacity);
    }
}