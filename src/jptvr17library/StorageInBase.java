/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr17library;

import entity.Book;
import entity.History;
import entity.Reader;
import interfaces.Saveble;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Melnikov
 */
public class StorageInBase implements Saveble{
    private EntityManager em;
    private EntityTransaction tx;

    public StorageInBase() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPTVR17LibraryPU");
        this.em = emf.createEntityManager();
        this.tx = em.getTransaction();
    }
    
    

    @Override
    public void saveBooks(List<Book> listBooks) {
        int n = listBooks.size();
        this.tx.begin();
            for(int i=0; i<n;i++){
                if(listBooks.get(i).getId() == null){
                    em.persist(listBooks.get(i));
                }else{
                    em.merge(listBooks.get(i));
                }
            }
        this.tx.commit();
    }

    @Override
    public List<Book> loadBookFromStorage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Reader> loadReaderFromStorage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveReaders(List<Reader> listReaders) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<History> loadHistoriesFromStorage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveHistories(List<History> listHistories) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
