import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        CreateRaceList list;
        FileReader fileReader = new FileReader(".\\src\\main\\resources\\StdRace");
        list = objectMapper.readValue(fileReader, CreateRaceList.class);
        for (Race r : list.getRace()) {
            System.out.println(r);
        }
        for (String sr : list.getRace().get(0).getSubrace()) {
            System.out.println(sr);
        }


    }
}