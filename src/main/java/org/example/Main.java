package org.example;

import org.example.User.Course;
import org.example.User.Student;


public class Main {

    public  Main()
       {

       }
        public static void main(String[] args) {

        Student student = new Student("10225587","Daniela",10.5f);
        Course course = new Course("Ingles","01",200);
        Course course2 = new Course("Java","02",100);
        student.enrroll(course);student.enrroll(course2);
        System.out.println(student);
        System.out.println(course );
        course.mostrarCurso();
        course2.calcularNotas();

    }

}





