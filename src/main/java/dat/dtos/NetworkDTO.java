package dat.dtos;

import java.lang.reflect.Array;
import java.util.List;

public class NetworkDTO {

    private List<String> company;
    private LocationDTO location;
    private String href, id, name, source;

    public NetworkDTO(List<String> company, LocationDTO location, String href, String id, String name, String source) {
        this.company = company;
        this.location = location;
        this.href = href;
        this.id = id;
        this.name = name;
        this.source = source;
    }

    public NetworkDTO(LocationDTO location, String href, String id, String name, String source) {
        this.location = location;
        this.href = href;
        this.id = id;
        this.name = name;
        this.source = source;
    }

}
