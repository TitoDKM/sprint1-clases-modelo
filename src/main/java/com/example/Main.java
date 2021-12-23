package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creamos una lista de admins, estudiantes y tags (Emulando la BBDD)
        ArrayList<Admin> admins = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Tag> tags = new ArrayList<>();

        // Creamos un administrador
        Admin alex = new Admin(1L, "alex@open-bootcamp.com", "supersecreta");
        admins.add(alex);

        // Creamos algunos usuarios
        Student dario = new Student(1L,
                1L,
                "Darío Aboy Hidalgo",
                "dario@gmail.com",
                "612345678",
                "ES",
                "Huelva",
                false,
                WorkType.REMOTE,
                "5ae0c1c8a5260bc7b6648f6fbd115c35.jpg",
                "9c95319bf274672d6eae7eb97c3dfda5.pdf",
                "");
        Student luis = new Student(2L,
                1L,
                "Luis Pérez García",
                "luis@gmail.com",
                "612345678",
                "ES",
                "Madrid",
                true,
                WorkType.REMOTE,
                "5ae0c1c8a5260bc7b6648f6fbd115c35.jpg",
                "9c95319bf274672d6eae7eb97c3dfda5.pdf",
                "");
        students.add(dario);
        students.add(luis);

        // Creamos algunos tags
        Tag HTML = new Tag(1L, "HTML");
        Tag JS = new Tag(2L, "JS");
        Tag Java = new Tag(3L, "Java");
        Tag CSharp = new Tag(4L, "C#");
        Tag React = new Tag(5l, "React");

        tags.add(HTML);
        tags.add(JS);
        tags.add(Java);
        tags.add(CSharp);
        tags.add(React);

        // Asignamos los estudiantes de Álex
        ArrayList<Student> tempStudents = new ArrayList<>();
        tempStudents.add(dario);
        tempStudents.add(luis);
        alex.setStudents(tempStudents);
        tempStudents.clear();

        // Asignamos a los estudiantes su administrador
        dario.setAdmin(alex);
        luis.setAdmin(alex);

        // Asignamos a los estudiantes algunos tags
        dario.setTags("3;4;5"); // Tags de Java, C# y React a Darío
        luis.setTags("1;2;5"); // Tags de HTML, JS y React a Luis
    }
}
