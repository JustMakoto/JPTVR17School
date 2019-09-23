package providers;

import entity.Subject;
import entity.Student;
import entity.Grade;
import java.util.Scanner;

public class StudentProvider {
    private Scanner scanner = new Scanner(System.in);
    public Student createStudent() {
        Student student = new Student();
        System.out.println("-------Создание ученика--------");
        String inputNumber = "";
        System.out.print("Имя ученика: ");
        student.setName(scanner.nextLine());
        System.out.print("Фамилия ученика: ");
        student.setSurname(scanner.nextLine());
        System.out.print("Телефон ученика: ");
        student.setPhone(scanner.nextLine());
        
        return student;
    }
    
}
