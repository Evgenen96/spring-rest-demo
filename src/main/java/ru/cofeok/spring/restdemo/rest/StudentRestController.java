package ru.cofeok.spring.restdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.cofeok.spring.restdemo.entity.Student;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Eugene", "Nikonov"));
        students.add(new Student("Maxim", "Ribalchenko"));
        students.add(new Student("Masha", "Klueva"));
        return students;
    }
}
