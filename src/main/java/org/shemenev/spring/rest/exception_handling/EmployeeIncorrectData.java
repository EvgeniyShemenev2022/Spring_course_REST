package org.shemenev.spring.rest.exception_handling;

// класс, ответственный за JSON сообщения об ошибках
public class EmployeeIncorrectData {

    private String info;

    public EmployeeIncorrectData() {
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
