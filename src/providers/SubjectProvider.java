package providers;

import entity.Subject;
import entity.Student;
import entity.Grade;
import java.util.Scanner;

public class SubjectProvider {
    private Scanner scanner = new Scanner(System.in);
    public Subject createSubject() {
        Subject subject = new Subject();
        System.out.println("-------Создание предмета--------");
        String inputNumber = "";

        System.out.print("Название предмета: ");
        subject.setName(scanner.nextLine());
        System.out.print("Имя учителя предмета: ");
        subject.setAuthor(scanner.nextLine());
        System.out.print("Язык предмета: ");
        subject.setLang(scanner.nextLine());
        int hour=0;
        boolean flag=true;
        do{
           System.out.print("Академические часы: ");
           inputNumber = scanner.nextLine();
           try {
              hour=new Integer(inputNumber);
              flag = false;
           }catch (Exception e){
               System.out.println("Ошибка ввода!");
           }
        }while(flag);
        subject.setHours(hour);
        return subject;
    }
    
}
