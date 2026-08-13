package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${favoriteLanguages}")
    private List<String> favoriteLanguages;

    @Value("${favoriteSystems}")
    private List<String> favoriteSystems;

    @GetMapping("/showStudentForm")
    public String showForm(Model theModel) {

        // create a new student object
        Student theStudent = new Student();


        // add student object to the
        theModel.addAttribute("student", theStudent);

        // add the list of countries to the model
        theModel.addAttribute("countries", countries);

        // add the list of favorite languages to the model
        theModel.addAttribute("favoriteLanguages", favoriteLanguages);

        // add the list of favorite operating systems to the model
        theModel.addAttribute("favoriteSystems", favoriteSystems);

        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {

        // log the input data
        System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName() + " " + theStudent.getCountry() + " " + theStudent.getFavoriteLanguage());

        // log the input data of the favorite system
        for (String tempFavoriteSystem : theStudent.getFavoriteSystems()) {
            System.out.println("Favorite System : " + tempFavoriteSystem);
        }

        return "student-confirmation";
    }










}
