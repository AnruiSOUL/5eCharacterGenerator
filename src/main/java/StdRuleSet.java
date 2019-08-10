import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileReader;
import java.io.IOException;

public class StdRuleSet {
    ObjectMapper objectMapper = new ObjectMapper();
    RaceList rcl, srl, vrl;
    RoleList rll;
    BackgroundList bgl;

    StdRuleSet() throws IOException {
        this.rcl =  objectMapper.readValue(new FileReader(ResourceList.stdRace), RaceList.class);
        this.srl = objectMapper.readValue(new FileReader(ResourceList.stdSubRace), RaceList.class);
        this.vrl = objectMapper.readValue(new FileReader(ResourceList.stdVariantRace), RaceList.class);
        this.rll = objectMapper.readValue(new FileReader(ResourceList.stdRole), RoleList.class);
        this.bgl = objectMapper.readValue(new FileReader(ResourceList.stdBackground), BackgroundList.class);
    }

}
