package student;

import java.time.LocalDate;

public class student {
    private  Long id;
    private  String name;
    private String email;
    private LocalDate dob;
    private Integer age;

    public student() {
    }

    public student(String name, String email, LocalDate dob, Integer age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public student(Long id, String name, String email, LocalDate dob, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }


}
