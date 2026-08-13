package com.luv2code.springboot.thymeleafdemo.model;

import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private List<String> favoriteSystems;

    public Student() {

    }


    public Student(
            String firstName,
            String lastName,
            String country,
            String favoriteLanguage,
            List<String> favoriteSystems) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.favoriteLanguage = favoriteLanguage;
        this.favoriteSystems = favoriteSystems;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public List<String> getFavoriteSystems() {
        return favoriteSystems;
    }

    public void setFavoriteSystems(List<String> favoriteSystems) {
        this.favoriteSystems = favoriteSystems;
    }

    @Override
    public String toString() {
        return "Student{" +
                "favoriteSystems=" + favoriteSystems +
                '}';
    }
}
