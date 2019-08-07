
import java.util.ArrayList;

public class Race {
    String name;
    ArrayList<String> subrace;
    ArrayList<ArrayList<String>> asi;
    ArrayList<Integer> ageRange;
    ArrayList<String> alignment;
    String size;
    ArrayList<Integer> heightRange;
    Integer weight;
    Integer speed;
    ArrayList<String> languages;
    String vision;
    ArrayList<String> racialTraits;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getSubrace() {
        return subrace;
    }

    public void setSubrace(ArrayList<String> subrace) {
        this.subrace = subrace;
    }

    public ArrayList<ArrayList<String>> getAsi() {
        return asi;
    }

    public void setAsi(ArrayList<ArrayList<String>> asi) {
        this.asi = asi;
    }

    public ArrayList<Integer> getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(ArrayList<Integer> ageRange) {
        this.ageRange = ageRange;
    }

    public ArrayList<String> getAlignment() {
        return alignment;
    }

    public void setAlignment(ArrayList<String> alignment) {
        this.alignment = alignment;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ArrayList<Integer> getHeightRange() {
        return heightRange;
    }

    public void setHeightRange(ArrayList<Integer> heightRange) {
        this.heightRange = heightRange;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public ArrayList<String> getRacialTraits() {
        return racialTraits;
    }

    public void setRacialTraits(ArrayList<String> racialTraits) {
        this.racialTraits = racialTraits;
    }

    @Override
    public String toString() {
        return "Race{" +
                "name='" + name + '\'' +
                ", subrace='" + subrace + '\'' +
                ", asi='" + asi + '\'' +
                ", ageRange='" + ageRange + '\'' +
                ", alignment='" + alignment + '\'' +
                ", size='" + size + '\'' +
                ", heightRange='" + heightRange + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", languages='" + languages + '\'' +
                ", vision='" + vision + '\'' +
                ", racialTraits='" + racialTraits + '\'' +
                '}';
    }
}
