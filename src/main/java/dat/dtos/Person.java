package dat.dtos;

public class Person {

    private String name, address;
    private Integer age, cpr;

    public Person(String name, String address, Integer age, Integer cpr) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.cpr = cpr;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getCpr() {
        return cpr;
    }
}
