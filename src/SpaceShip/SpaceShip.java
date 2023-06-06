package SpaceShip;

import java.util.ArrayList;
import java.util.List;

public class SpaceShip {
    private String name;
    private double powerSupply;
    private double shields;
    private double lifeSupport;
    private double hullStrength;
    private int photonTorpedo;
    private int androids;
    private List<Cargo> manifest = new ArrayList<>();
    private static List<String> broadcastCommunicator = new ArrayList<>();

    public SpaceShip() {}
    public SpaceShip(String name, double powerSupply, double shields, double lifeSupport, double hullStrength, int photonTorpedo, int androids) {
        this.name = name;
        this.powerSupply = powerSupply;
        this.shields = shields;
        this.lifeSupport = lifeSupport;
        this.hullStrength = hullStrength;
        this.photonTorpedo = photonTorpedo;
        this.androids = androids;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPowerSupply() {
        return this.powerSupply;
    }
    public void setPowerSupply(double powerSupply) {
        this.powerSupply = powerSupply;
    }
    public double getShields() {
        return this.shields;
    }
    public void setShields(double shields) {
        this.shields = shields;
    }
    public double getLifeSupport() {
        return this.lifeSupport;
    }
    public void setLifeSupport(double lifeSupport) {
        this.lifeSupport = lifeSupport;
    }
    public double getHullStrength() {
        return this.hullStrength;
    }
    public void setHullStrength(double hullStrength) {
        this.hullStrength = hullStrength;
    }
    public int getPhotonTorpedo() {
        return this.photonTorpedo;
    }
    public void setPhotonTorpedo(int photonTorpedo) {
        this.photonTorpedo = photonTorpedo;
    }
    public int getAndroids() {
        return this.androids;
    }
    public void setAndroids(int androids) {
        this.androids = androids;
    }

    public void getManifest() {
        System.out.println(this.name);
        for(Cargo cargo: this.manifest) {
            System.out.println(cargo.toString());
        }
        System.out.println();
    }

    public void addCargo(Cargo cargo) {
        int index = this.manifest.indexOf(this.manifest.contains(cargo.getName()));
        if(index > -1) {
            Cargo updatedCargo = this.manifest.get(index);
            updatedCargo.setCount(updatedCargo.getCount() + cargo.getCount());
            this.manifest.set(index, updatedCargo);
        } else {
            this.manifest.add(cargo);
        }
    }
    public void removeCargo(Cargo cargo) {
        int index = this.manifest.indexOf(this.manifest.contains(cargo.getName()));
        if(index > -1) {
            Cargo cargoM = this.manifest.get(index);
            if(cargoM.getCount() > cargo.getCount()) {
                cargoM.setCount(cargoM.getCount() - cargo.getCount());
                this.manifest.set(index, cargoM);
            } else if(this.manifest.get(index).getCount() == cargo.getCount()){
                this.manifest.remove(cargoM);
            }
        }
    }
    // TODO clean up manifest ???

    public void shootPhaserCannon(SpaceShip target) {
        // TODO ???
    }
    public void shootPhotonTorpedo(SpaceShip target) {
        // TODO ???
    }
    public void reloadPhotonTorpedo(int count) {
        // TODO attribute photonTorpedo ???
    }

    public void sendRepairOrder(boolean powerSupply, boolean shields, boolean hullStrength, int androids) {
        // TODO ???
    }

    public void sendMessage(String msg) {
        // TODO ???
    }
    public void getFullStatus() {
        // TODO ???
    }

    public static List<String> getLog() {
        return broadcastCommunicator;
    }

}
