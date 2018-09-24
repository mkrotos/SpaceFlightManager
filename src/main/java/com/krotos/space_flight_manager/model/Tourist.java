package com.krotos.space_flight_manager.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@Entity
public class Tourist {

    @Id
    @GeneratedValue
    @Column(name = "tourist_id")
    private Long id;

    private String name;
    private String surname;
    private String sex;
    private String country;
    private String notes;
    private LocalDate dateOfBirth;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "tourist_flight",
            joinColumns = {@JoinColumn(name = "tourist_id")},
            inverseJoinColumns = {@JoinColumn(name = "flight_id")}
    )
    private List<Flight> flightList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(List<Flight> flightList) {
        this.flightList = flightList;
    }

    @Override
    public String toString() {
        return "Tourist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex='" + sex + '\'' +
                ", country='" + country + '\'' +
                ", notes='" + notes + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", flightList=" + flightList +
                '}';
    }
}
