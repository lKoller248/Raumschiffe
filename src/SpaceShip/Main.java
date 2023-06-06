package SpaceShip;

public class Main {
    public static void main(String[] args) {
        SpaceShip klingon = new SpaceShip("IKS Hegh'ta", 100, 100, 100, 100, 1, 2);
        klingon.addCargo(new Cargo("Ferengi Slug Juice", 200));
        klingon.addCargo(new Cargo("Bat'Ieth Klingon Sword", 200));
        klingon.getManifest();

        SpaceShip romulan = new SpaceShip("IRW Khazara", 100, 100, 100, 100, 2, 2);
        romulan.addCargo(new Cargo("Borg Scrap", 5));
        romulan.addCargo(new Cargo("Red Matter", 2));
        romulan.addCargo(new Cargo("Plasma Weapon", 50));
        romulan.getManifest();

        SpaceShip vulcan = new SpaceShip("Ni'Var", 80, 80, 50, 100, 0, 5);
        vulcan.addCargo(new Cargo("Research Probe", 35));
        vulcan.addCargo(new Cargo("Photon Torpedo", 3));
        vulcan.getManifest();
    }
}
