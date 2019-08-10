import java.util.ArrayList;

public class Background {
    String name;
    ArrayList<String> skill;
    ArrayList<String> tools;
    ArrayList<String> languages;
    String feature;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getSkill() {
        return skill;
    }

    public void setSkill(ArrayList<String> skill) {
        this.skill = skill;
    }

    public ArrayList<String> getTools() {
        return tools;
    }

    public void setTools(ArrayList<String> tools) {
        this.tools = tools;
    }

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    @Override
    public String toString() {
        return "Background{" +
                "name='" + name + '\'' +
                ", skill=" + skill +
                ", tools=" + tools +
                ", languages=" + languages +
                ", feature='" + feature + '\'' +
                '}';
    }
}
