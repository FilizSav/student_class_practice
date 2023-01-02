import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        int students = 0;
        int numberOfMathStudents = 0;
        int numberOfScienceStudents = 0;
        Scanner scan = new Scanner(System.in);
        ArrayList<Student> listOfStudents = new ArrayList<>();

        while (students < 3) {
            System.out.println(UserQuestions.askToJoin);
            if ("Y".equalsIgnoreCase(scan.nextLine())){
                System.out.println(UserQuestions.askFirstName);
                String firstName = scan.nextLine();
                System.out.println(UserQuestions.askLastName);
                String lastName = scan.nextLine();
                System.out.println(UserQuestions.askAge);
                int age = scan.nextInt();
                try {
                    Permission.checkAge(age);
                } catch (RuntimeException c) {
                    c.printStackTrace();
                    scan.nextLine();
                    continue;
                }
                System.out.println(UserQuestions.askGender);
                scan.nextLine();
                String gender = scan.nextLine();
                System.out.println(UserQuestions.askClassName);
                String className = scan.nextLine();
                try {
                    Permission.checkClassName(className);
                } catch (RuntimeException c) {
                    c.printStackTrace();
                    continue;
                }

                if (className.equalsIgnoreCase("Math")) {
                    MathStudent mathStudent = new MathStudent(firstName, lastName, age, gender, className);
                    listOfStudents.add(mathStudent);
                    students++;
                    numberOfMathStudents++;
                } else {
                    ScienceStudent scienceStudents = new ScienceStudent(firstName, lastName, age, gender, className);
                    listOfStudents.add(scienceStudents);
                    students++;
                    numberOfScienceStudents++;
                }
                System.out.println("Congratulations! You are registered for " + className + " class.");
            }

        }
        for (Student listOfStudent : listOfStudents) {
            System.out.println(listOfStudent);
        }
        System.out.println("\n                \n");
        System.out.println("Math students = " + numberOfMathStudents);
        System.out.println("Science students = " + numberOfScienceStudents);
    }
}

