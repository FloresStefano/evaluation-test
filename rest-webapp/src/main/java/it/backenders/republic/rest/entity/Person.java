package it.backenders.republic.rest.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "PERSON")
public class Person implements Serializable {

    private static final long serialVersionUID = -5378396373373165919L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String personName;

    @Column
    private double personAge;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public double getPersonAge() {
        return personAge;
    }

    public void setPersonAge(double personAge) {
        this.personAge = personAge;
    }

    @Override
    public String toString() {
        return "Person [pId=" + id + ", personName=" + personName + ", personAge=" + personAge + "]";
    }
}
