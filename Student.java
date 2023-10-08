package Secao08.StudentPOO;

import java.util.Scanner;
import java.util.Locale;

public class Student {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        StudentMembers studentMembers = new StudentMembers();
        System.out.println("Name: ");
        studentMembers.name = scan.next();
        System.out.println("Grades: ");
        studentMembers.nota1 = scan.nextDouble();
        studentMembers.nota2 = scan.nextDouble();
        studentMembers.nota3 = scan.nextDouble();

        System.out.println(studentMembers);



    }
}
