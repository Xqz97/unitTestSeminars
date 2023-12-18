package seminar4.book;


import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.*;
import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

class BookServiceTest {
    @Test
    public void testFindBookById() {
        // Создание мок-объекта BookRepository
        BookRepository bookRepository = mock(BookRepository.class);

        // Создание объекта BookService с использованием мок-объекта BookRepository
        BookService bookService = new BookService(bookRepository);

        // Определение поведения мок-объекта
        String bookId = "1";
        Book expectedBook = new Book(bookId, "Book1", "Author1");
        when(bookRepository.findById(bookId)).thenReturn(expectedBook);

        // Вызов метода findBookById()
        Book actualBook = bookService.findBookById(bookId);

        // Проверка результата
        assertEquals(expectedBook, actualBook);
    }


    @Test
    public void testFindAllBooks() {
        // Создание мок-объекта BookRepository
        BookRepository bookRepository = mock(BookRepository.class);

        // Создание объекта BookService с использованием мок-объекта BookRepository
        BookService bookService = new BookService(bookRepository);

        // Определение поведения мок-объекта
        List<Book> expectedBooks = Arrays.asList(
                new Book("1", "Book1", "Author1"),
                new Book("2", "Book2", "Author2")
        );
        when(bookRepository.findAll()).thenReturn(expectedBooks);

        // Вызов метода findAllBooks()
        List<Book> actualBooks = bookService.findAllBooks();

        // Проверка результата
        assertEquals(expectedBooks, actualBooks);
    }

}