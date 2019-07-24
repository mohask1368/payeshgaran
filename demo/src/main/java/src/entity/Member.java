package src.entity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {

    private String name ;
    private String lastName;
    private int age;

    public Member(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}
