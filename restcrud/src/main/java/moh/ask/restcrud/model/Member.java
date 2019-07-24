package moh.ask.restcrud.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "MEMBER")
public class Member {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name ;

    @Column(name = "family")
    private String family ;

    @Column(name = "age")
    private int age ;


}
