package Secao08.StudentPOO;

public class StudentMembers {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;
    public double mediaStudent(){
        return (nota1 + nota2 + nota3);
    }
    public String mediaFinal(){
        return mediaStudent() >= 60.0 ? "Pass" : "Disapproved";
    }
    public String toString(){
        return "Final Grade: " + mediaStudent() + ", " + mediaFinal();
    }
}
