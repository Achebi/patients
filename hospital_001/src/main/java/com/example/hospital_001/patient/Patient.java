package com.example.hospital_001.patient;

import jakarta.persistence.*;

@Entity
@Table
public class Patient {
    @Id
    @SequenceGenerator(
            name = "patient_sequence",
            sequenceName = "patient_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
          strategy = GenerationType.SEQUENCE,
          generator = "patient_sequence"
    )
    private Long id;
    private String First_Name;
    private String Middle_Name;
    private String Last_Name;
    private String Identification_Type;
    private Long Identification_Number;

    public Patient() {
        this.id = id;
    }

    public Patient(Long id,
                   String first_Name,
                   String middle_Name,
                   String last_Name,
                   String identification_Type,
                   Long identification_Number) {
        this.id = id;
        First_Name = first_Name;
        Middle_Name = middle_Name;
        Last_Name = last_Name;
        Identification_Type = identification_Type;
        Identification_Number = identification_Number;
    }

    public Patient(String first_Name,
                   String middle_Name,
                   String last_Name,
                   String identification_Type,
                   Long identification_Number) {
        First_Name = first_Name;
        Middle_Name = middle_Name;
        Last_Name = last_Name;
        Identification_Type = identification_Type;
        Identification_Number = identification_Number;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getMiddle_Name() {
        return Middle_Name;
    }

    public void setMiddle_Name(String middle_Name) {
        Middle_Name = middle_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getIdentification_Type() {
        return Identification_Type;
    }

    public void setIdentification_Type(String identification_Type) {
        Identification_Type = identification_Type;
    }

    public Long getIdentification_Number() {
        return Identification_Number;
    }

    public void setIdentification_Number(Long identification_Number) {
        Identification_Number = identification_Number;
    }
}
