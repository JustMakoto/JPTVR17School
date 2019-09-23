/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package providers;


import java.util.List;
import java.util.Scanner;
import interfaces.Savable;
import providers.RecordProvider;
import providers.StudentProvider;
import entity.Subject;
import entity.Records;
import entity.Student;
import entity.Grade;
import java.util.ArrayList;
import providers.SubjectProvider;
import providers.GradeProvider;

public class RecordsEdit {
    private Scanner scanner = new Scanner(System.in);
    public  List<Records> returnBook(List<Records> listRecords) {
                System.out.println("Список оценок:");
                for(int i=0;i<listRecords.size();i++){
                        System.out.println(i+")"+listRecords.get(i));
                    
                    }
                System.out.println("Выберите номер оценки для изменения:");
                String numberRecord = scanner.nextLine();
                
                
                System.out.println("Список оценок:");
                for(int i=0;i<listGrades.size();i++){
                        System.out.println(listGrades.get(i));
                    }
                
                System.out.println("Выберите номер оценки на которую хотите изменить:");
                String newRecord = scanner.nextLine();
                
        
    }
}
