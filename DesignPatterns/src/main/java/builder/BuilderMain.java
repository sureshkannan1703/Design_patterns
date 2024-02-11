package builder;

public class BuilderMain {

    public static void main(String[] args) {

        Student student = Student.Builder.getBuilder().setAge(26).setFirstName("Suresh").build();
        System.out.println(student.firstName+" "+student.age);

    }
}
