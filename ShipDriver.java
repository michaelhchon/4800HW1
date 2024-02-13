
public class ShipDriver {

	public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Starship", "2004");
        ships[1] = new CruiseShip("Voyager", "2006", 2000);
        ships[2] = new CargoShip("SS Asteroid", "2015", 5000);

        for (Ship ship : ships) {
            ship.print();
            System.out.println();
        }
	}
}
