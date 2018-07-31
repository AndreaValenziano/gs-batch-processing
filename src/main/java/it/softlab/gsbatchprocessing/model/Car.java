package it.softlab.gsbatchprocessing.model;

import javax.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String carModel;
    @ManyToOne
    private Person person;

    public Car() {
    }

    public Car(String brand, String carModel, Person person) {
        this.brand = brand;
        this.carModel = carModel;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public Car setId(Long id) {
        this.id = id;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public Car setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getCarModel() {
        return carModel;
    }

    public Car setCarModel(String carModel) {
        this.carModel = carModel;
        return this;
    }

    public Person getPerson() {
        return person;
    }

    public Car setPerson(Person person) {
        this.person = person;
        return this;
    }
}
