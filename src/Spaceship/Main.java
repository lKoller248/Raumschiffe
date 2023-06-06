package Spaceship;

public class Main {
    public static void main(String[] args) {
        Spaceship klingon = new Spaceship("IKS Hegh'ta", 100, 100, 100, 100, 1, 2);
        klingon.addCargo(new Cargo("Ferengi Slug Juice", 200));
        klingon.addCargo(new Cargo("Bat'Ieth Klingon Sword", 200));
        klingon.showSpaceshipInfo();
        klingon.showManifest();

        Spaceship romulan = new Spaceship("IRW Khazara", 100, 100, 100, 100, 2, 2);
        romulan.addCargo(new Cargo("Borg Scrap", 5));
        romulan.addCargo(new Cargo("Red Matter", 2));
        romulan.addCargo(new Cargo("Plasma Weapon", 50));
        romulan.showSpaceshipInfo();
        romulan.showManifest();

        Spaceship vulcan = new Spaceship("Ni'Var", 80, 80, 50, 100, 0, 5);
        vulcan.addCargo(new Cargo("Research Probe", 35));
        vulcan.addCargo(new Cargo("Photon Torpedo", 3));
        vulcan.showSpaceshipInfo();
        vulcan.showManifest();

        romulan.shootPhotonTorpedo(vulcan);
        romulan.shootPhotonTorpedo(vulcan);
        romulan.shootPhotonTorpedo(vulcan);
        Spaceship.showLog();
        vulcan.showSpaceshipInfo();

        vulcan.removeCargo(new Cargo("Photon Torpedo", 1));
        vulcan.showManifest();
        vulcan.removeCargo(new Cargo("Photon Torpedo", 6));
        vulcan.showManifest();
        vulcan.addCargo(new Cargo("Photon Torpedo", 1));
        vulcan.showManifest();
        vulcan.reloadPhotonTorpedo(1);
        vulcan.showManifest();
        vulcan.reloadPhotonTorpedo(5);
        vulcan.showManifest();
        vulcan.addCargo(new Cargo("Photon Torpedo", 3));
        vulcan.showManifest();
        vulcan.reloadPhotonTorpedo(5);
        vulcan.showManifest();

        vulcan.sendRepairOrder(true, true, true, 7);
        vulcan.showSpaceshipInfo();
    }
}
