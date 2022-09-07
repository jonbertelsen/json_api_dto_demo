package dat.dtos;

public class PersonDTO {

    private String name, adresse;

    public PersonDTO(Person p) {
        this.name = p.getName();
        this.adresse = p.getAddress();
    }
}
