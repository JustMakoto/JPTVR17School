package jptvr17school;

import entity.Subject;
import entity.Records;
import entity.Student;
import entity.Grade;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import interfaces.Savable;

public class StorageInFile implements Savable{

    @Override
    public void saveSubjects(List<Subject> listSubjects) {
        
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("Subjects.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listSubjects);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StorageInFile.class.getName())
               .log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(StorageInFile.class.getName())
               .log(Level.SEVERE, "Не могу записать", ex);
        }
       
    }

    @Override
    public List<Subject> loadSubjectFromStorage() {
            List<Subject> subjects = new ArrayList<>();
            FileInputStream fis = null;
            ObjectInputStream oin = null;
         try {   
            fis = new FileInputStream("Subjects.txt");
            oin = new ObjectInputStream(fis);
            subjects = (List<Subject>) oin.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StorageInFile.class.getName())
                .log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(StorageInFile.class.getName())
                .log(Level.SEVERE, "Не могу читать из файла", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StorageInFile.class.getName())
                .log(Level.SEVERE, "Нет такого класса", ex);
        }
        return subjects;
    }

    public List<Student> loadStudentFromStorage() {
        List<Student> students = new ArrayList<>();
            FileInputStream fis = null;
            ObjectInputStream oin = null;
         try {   
            fis = new FileInputStream("Students.txt");
            oin = new ObjectInputStream(fis);
            students = (List<Student>) oin.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StorageInFile.class.getName())
                .log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(StorageInFile.class.getName())
                .log(Level.SEVERE, "Не могу читать из файла", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StorageInFile.class.getName())
                .log(Level.SEVERE, "Нет такого класса", ex);
        }
        return students;
    }
    
    @Override
    public List<Grade> loadGradeFromStorage() {
        List<Grade> grades = new ArrayList<>();
            FileInputStream fis = null;
            ObjectInputStream oin = null;
         try {   
            fis = new FileInputStream("Grades.txt");
            oin = new ObjectInputStream(fis);
            grades = (List<Grade>) oin.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StorageInFile.class.getName())
                .log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(StorageInFile.class.getName())
                .log(Level.SEVERE, "Не могу читать из файла", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StorageInFile.class.getName())
                .log(Level.SEVERE, "Нет такого класса", ex);
        }
        return grades;
    }

    @Override
    public void saveStudents(List<Student> listStudents) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("Students.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listStudents);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StorageInFile.class.getName())
               .log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(StorageInFile.class.getName())
               .log(Level.SEVERE, "Не могу записать", ex);
        }
    }
    
    @Override
    public void saveGrades(List<Grade> listGrades) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("Grades.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listGrades);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StorageInFile.class.getName())
               .log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(StorageInFile.class.getName())
               .log(Level.SEVERE, "Не могу записать", ex);
        }
    }

    @Override
    public List<Records> loadRecordsFromStorage() {
        List<Records> records = new ArrayList<>();
            FileInputStream fis = null;
            ObjectInputStream oin = null;
         try {   
            fis = new FileInputStream("Records.txt");
            oin = new ObjectInputStream(fis);
            records = (List<Records>) oin.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StorageInFile.class.getName())
                .log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(StorageInFile.class.getName())
                .log(Level.SEVERE, "Не могу читать из файла", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StorageInFile.class.getName())
                .log(Level.SEVERE, "Нет такого класса", ex);
        }
        return records;
    }

    @Override
    public void saveRecords(List<Records> listRecords) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("Records.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listRecords);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StorageInFile.class.getName())
               .log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(StorageInFile.class.getName())
               .log(Level.SEVERE, "Не могу записать", ex);
        }
    }
    
}
