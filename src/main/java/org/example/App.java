package org.example;

import org.example.models.President;
import org.example.repository.PresidentRepository;

public class App {
    public static void main(String[] args) {
//       StudentRepository studentRepository = new StudentRepository();
//       System.out.println(studentRepository);
       President president = new President(1L,"Elbek",234);
       President president1 = new President(2L,"Aiken",23);
       President president2 = new President(3L,"Dastan",4);
      PresidentRepository presidentRepository = new PresidentRepository();
//       presidentRepository.save(president);
//       presidentRepository.save(president1);
//       presidentRepository.save(president2);
//        System.out.println(presidentRepository.getById(2L));
//        presidentRepository.findAll();
//       presidentRepository.deleteAll();
    }
}