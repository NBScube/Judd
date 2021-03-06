package at.nbsgames.judd.splatoonink;

public class SalmonRunSlot {

    private String map;
    private String mapImage;
    private String weaponA;
    private String weaponB;
    private String weaponC;
    private String weaponD;
    private Time timeLeft;
    private boolean hasStarted;
    SalmonRunSlot(String map, String mapImage, String weaponA, String weaponB, String weaponC, String weaponD, Time timeLeft, boolean hasStarted){
        this.map = map;
        this.mapImage = mapImage;
        this.weaponA = weaponA;
        this.weaponB = weaponB;
        this.weaponC = weaponC;
        this.weaponD = weaponD;
        this.timeLeft = timeLeft;
        this.hasStarted = hasStarted;
    }

    public String getMap() {
        return map;
    }

    public String getMapImage() {
        return mapImage;
    }

    public String getMapImageDownloadLink() {
        return "https://splatoon2.nbsgames.at/" + mapImage;
    }

    public String getWeaponA() {
        return weaponA;
    }

    public String getWeaponB() {
        return weaponB;
    }

    public String getWeaponC() {
        return weaponC;
    }

    public String getWeaponD() {
        return weaponD;
    }

    public Time getTime() {
        return timeLeft;
    }

    public boolean hasStarted() {
        return hasStarted;
    }
}
