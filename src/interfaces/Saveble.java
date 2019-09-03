/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.List;

/**
 *
 * @author Melnikov
 */
public interface Saveble {
    void saveBooks(List<Book> listBooks);
    List<Book> loadBookFromStorage();
    List<Reader> loadReaderFromStorage();
    void saveReaders(List<Reader> listReaders);
    List<History> loadHistoriesFromStorage();
    void saveHistories(List<History> listHistories);
}
