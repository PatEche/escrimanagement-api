package ar.com.escrimanagement.person.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PersonType personType;
    @Column(length = 100)
    private String firstName;
    @Column(length = 100)
    private String lastName;
    @Column(unique = true, length = 8)
    private String documentNumber;
    @Column(length = 150)
    private String businessName;
    @Column(unique = true, length = 11)
    private String cuit;
    @Column(length = 150)
    private String email;
    @Column(length = 30)
    private String phone;
    @Column(length = 255)
    private String address;
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;
    @Column(nullable = false)
    private LocalDateTime updatedAt;
    protected Person(){

    }

    @PrePersist
    protected void onCreate() {
        LocalDateTime now = LocalDateTime.now();
        createdAt = now;
        updatedAt = now;
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }

    public Person(
            PersonType personType,
            String firstName,
            String lastName,
            String documentNumber,
            String businessName,
            String cuit
    ) {
        this.personType = personType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.documentNumber = documentNumber;
        this.businessName = businessName;
        this.cuit = cuit;
    }

    public UUID getId() {
        return id;
    }

    public PersonType getPersonType() {
        return personType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public String getBusinessName() {
        return businessName;
    }

    public String getCuit() {
        return cuit;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setPersonType(PersonType personType) {
        this.personType = personType;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
