import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        CreateRaceList list,subRaceList,variantRaceList;
        CreateRoleList roleList;
        CreateBackgroundList backgroundList;
        FileReader fileReader = new FileReader(".\\src\\main\\resources\\StdRace");
        list = objectMapper.readValue(fileReader, CreateRaceList.class);
        fileReader = new FileReader(".\\src\\main\\resources\\StdSubRace");
        subRaceList = objectMapper.readValue(fileReader, CreateRaceList.class);
        fileReader = new FileReader(".\\src\\main\\resources\\StdVariantRace");
        variantRaceList = objectMapper.readValue(fileReader, CreateRaceList.class);
        fileReader = new FileReader(".\\src\\main\\resources\\StdRole");
        roleList = objectMapper.readValue(fileReader, CreateRoleList.class);
        fileReader = new FileReader(".\\src\\main\\resources\\StdBackground");
        backgroundList = objectMapper.readValue(fileReader, CreateBackgroundList.class);
        for (Race r : list.getRace()) {
            System.out.println(r);
        }
        for (Race sr : subRaceList.getRace()){
            System.out.println(sr);
        }
        for (Race sr : variantRaceList.getRace()){
            System.out.println(sr);
        }
        for (Role rl : roleList.getRole()){
            System.out.println(rl);
        }
        for (Background bg : backgroundList.getBackground()){
            System.out.println(bg);
        }

    }
}
