package builder;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new StudentBuilder()
                .build()
                .setAge(27)
                .setName("Xavier")
                .builder();

        System.out.println(student);
    }
}
