package dat.dtos;

public class UserDTO {
    String id;
    String title;
    String firstName;
    String lastName;
    String picture;

    public UserDTO(String id, String title, String firstName, String lastName, String picture) {
        this.id = id;
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}
