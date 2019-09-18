package jptvr17school;

import entity.Subject;
import entity.Records;
import entity.Student;
import entity.Grade;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import interfaces.Savable;


public class StorageInBase implements Savable{
    private EntityManager em;
    private EntityTransaction tx;

    public StorageInBase() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPTVR17SchoolPU");
        this.em = emf.createEntityManager();
        this.tx = em.getTransaction();
    }
    
    @Override
    public void saveSubjects(List<Subject> listSubjects) {
        int n = listSubjects.size();
        this.tx.begin();
            for(int i=0; i<n;i++){
                if(listSubjects.get(i).getId() == null){
                    em.persist(listSubjects.get(i));
                }else{
                    em.merge(listSubjects.get(i));
                }
            }
        this.tx.commit();
    }

    @Override
    public void saveStudents(List<Student> listStudents) {
        int n = listStudents.size();
        this.tx.begin();
            for(int i=0; i<n;i++){
                if(listStudents.get(i).getId() == null){
                    em.persist(listStudents.get(i));
                }else{
                    em.merge(listStudents.get(i));
                }
            }
        this.tx.commit();
    }
    
    @Override
    public void saveGrades(List<Grade> listGrades) {
        int n = listGrades.size();
        this.tx.begin();
            for(int i=0; i<n;i++){
                if(listGrades.get(i).getId() == null){
                    em.persist(listGrades.get(i));
                }else{
                    em.merge(listGrades.get(i));
                }
            }
        this.tx.commit();
    }

    @Override
    public void saveRecords(List<Records> listRecords) {
        int n = listRecords.size();
        this.tx.begin();
            for(int i=0; i<n;i++){
                if(listRecords.get(i).getId() == null){
                    em.persist(listRecords.get(i));
                }else{
                    em.merge(listRecords.get(i));
                }
            }
        this.tx.commit();
    }
    
    @Override
    public List<Subject> loadSubjectFromStorage() {
        this.tx.begin();
            List<Subject> listSubjects = em.createQuery("SELECT s FROM Subject s").getResultList();
        this.tx.commit();
        return listSubjects;
    }
    
    public List<Student> loadStudentFromStorage() {
        this.tx.begin();
            List<Student> listStudents = em.createQuery("SELECT s FROM Student s").getResultList();
        this.tx.commit();
        return listStudents;
    }
    
    @Override
    public List<Grade> loadGradeFromStorage() {
        this.tx.begin();
            List<Grade> listGrades = em.createQuery("SELECT g FROM Grade g").getResultList();
        this.tx.commit();
        return listGrades;
    }
    
    @Override
    public List<Records> loadRecordsFromStorage() {
        this.tx.begin();
            List<Records> listRecords = em.createQuery("SELECT r FROM Records r").getResultList();
        this.tx.commit();
        return listRecords;
    }

    
}
