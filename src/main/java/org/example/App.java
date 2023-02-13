package org.example;
import org.example.models.Course;
import org.example.repository.CourseRepo;
public class App {
    public static void main(String[] args) {
        Course course = new Course("Talant",50,"Azamat",36);
        Course course2 = new Course("Talantbek",50,"Azamat",36);
        CourseRepo courseRepo = new CourseRepo();

    }
}