package org.shemenev.spring.rest.exception_handling;

// класс исключение, ответственный за вывод сообщений
public class NoSuchEmployeeException extends RuntimeException{

    public NoSuchEmployeeException(String message) {
        super(message);
    }
}
