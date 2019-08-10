import java.util.ArrayList;

public class Role {
    String name;
    Integer hitDie;
    ArrayList<ArrayList<String>> proficiencies;
    ArrayList<ArrayList<String>> features;
    ArrayList<ArrayList<String>> archetypes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHitDie() {
        return hitDie;
    }

    public void setHitDie(Integer hitDie) {
        this.hitDie = hitDie;
    }

    public ArrayList<ArrayList<String>> getProficiencies() {
        return proficiencies;
    }

    public void setProficiencies(ArrayList<ArrayList<String>> proficiencies) {
        this.proficiencies = proficiencies;
    }

    public ArrayList<ArrayList<String>> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<ArrayList<String>> features) {
        this.features = features;
    }

    public ArrayList<ArrayList<String>> getArchetypes() {
        return archetypes;
    }

    public void setArchetypes(ArrayList<ArrayList<String>> archetypes) {
        this.archetypes = archetypes;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", hitDie=" + hitDie +
                ", proficiencies=" + proficiencies +
                ", features=" + features +
                ", archetypes=" + archetypes +
                '}';
    }
}
