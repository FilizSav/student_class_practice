public class Student {
    public Student(String firstName, String lastName, int age, String gender, String className) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.className = className;
    }

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String className;


    public String getClassName() {
        return className;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}

