public class Permission {

    //COMPLETE THIS CLASS BEFORE TEST CLASS

    public static void checkAge(int age){
        if(age <= 20) throw new  RuntimeException(age + " is not allowed!");
    }

    public static void checkClassName(String className){
        if(!className.equalsIgnoreCase("Math") && !className.equalsIgnoreCase("Science"))
            throw new RuntimeException(className + " is not allowed!");
    }
}

