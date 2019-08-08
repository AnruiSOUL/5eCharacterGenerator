import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        CreateRaceList list,subRaceList,variantRaceList;
        FileReader fileReader = new FileReader(".\\src\\main\\resources\\StdRace");
        list = objectMapper.readValue(fileReader, CreateRaceList.class);
        fileReader = new FileReader(".\\src\\main\\resources\\StdSubRace");
        subRaceList = objectMapper.readValue(fileReader, CreateRaceList.class);
        fileReader = new FileReader(".\\src\\main\\resources\\StdVariantRace");
        variantRaceList = objectMapper.readValue(fileReader, CreateRaceList.class);
        for (Race r : list.getRace()) {
            System.out.println(r);
        }
        for (Race sr : subRaceList.getRace()){
            System.out.println(sr);
        }
        for (Race sr : variantRaceList.getRace()){
            System.out.println(sr);
        }

    }
}
