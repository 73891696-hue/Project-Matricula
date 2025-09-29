package pe.edu.poliregional.model;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
    private Integer id;
    private String dni;
    private String firstName;
    private String lastName;
    private String grade; // p.ej. "1°", "2°"
    private String gender;
    private LocalDate birthDate;

    public Student() {}
    public Student(String dni, String firstName, String lastName) {
        this.dni = dni; this.firstName = firstName; this.lastName = lastName;
    }
    // getters y setters ...
    // equals y hashCode basados en dni
    @Override
    public boolean equals(Object o) { /* implementa */ return Objects.equals(dni, ((Student)o).dni); }
    @Override
    public int hashCode() { return Objects.hash(dni); }
}