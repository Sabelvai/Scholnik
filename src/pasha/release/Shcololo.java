/*
 * Copyright (c) $today.year.This Program Make Paha Vortan
 */

package pasha.release;

import java.time.LocalDate;
import java.util.Objects;

public class Shcololo {
    private String firstName;
    private String midName;
    private String lastName;
    private String momFirstName;
    private String momMidName;
    private String momLastName;
    private String city;
    private String street;
    private String houseNumber;
    private String apartment;
    private String momPhoneNumber;
    private LocalDate dateOfBirth;

    public Shcololo() {
    }

    public Shcololo(final String firstName, final String midName, final String lastName, final String momFirstName, final String momMidName, final String momLastName, final String city, final String street, final String houseNumber, final String apartment, final String momPhoneNumber, final LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.midName = midName;
        this.lastName = lastName;
        this.momFirstName = momFirstName;
        this.momMidName = momMidName;
        this.momLastName = momLastName;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartment = apartment;
        this.momPhoneNumber = momPhoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(final String midName) {
        this.midName = midName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getMomFirstName() {
        return momFirstName;
    }

    public void setMomFirstName(final String momFirstName) {
        this.momFirstName = momFirstName;
    }

    public String getMomMidName() {
        return momMidName;
    }

    public void setMomMidName(final String momMidName) {
        this.momMidName = momMidName;
    }

    public String getMomLastName() {
        return momLastName;
    }

    public void setMomLastName(final String momLastName) {
        this.momLastName = momLastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(final String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(final String apartment) {
        this.apartment = apartment;
    }

    public String getMomPhoneNumber() {
        return momPhoneNumber;
    }

    public void setMomPhoneNumber(final String momPhoneNumber) {
        this.momPhoneNumber = momPhoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(final LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Shcololo{" +
                "firstName='" + firstName + '\'' +
                ", midName='" + midName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", momFirstName='" + momFirstName + '\'' +
                ", momMidName='" + momMidName + '\'' +
                ", momLastName='" + momLastName + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", apartment='" + apartment + '\'' +
                ", momPhoneNumber='" + momPhoneNumber + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Shcololo shcololo = (Shcololo) o;
        return Objects.equals(firstName, shcololo.firstName) && Objects.equals(midName, shcololo.midName) && Objects.equals(lastName, shcololo.lastName) && Objects.equals(momFirstName, shcololo.momFirstName) && Objects.equals(momMidName, shcololo.momMidName) && Objects.equals(momLastName, shcololo.momLastName) && Objects.equals(city, shcololo.city) && Objects.equals(street, shcololo.street) && Objects.equals(houseNumber, shcololo.houseNumber) && Objects.equals(apartment, shcololo.apartment) && Objects.equals(momPhoneNumber, shcololo.momPhoneNumber) && Objects.equals(dateOfBirth, shcololo.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, midName, lastName, momFirstName, momMidName, momLastName, city, street, houseNumber, apartment, momPhoneNumber, dateOfBirth);
    }
}

