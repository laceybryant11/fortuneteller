public class Person {
    String firstName;
    String lastName;
    int userAge;
    int birthMonth;
    int numSiblings;
    String favColor;
    
String getfirstName(){
    System.out.println("What is your first name?");
    System.out.println("Name cannot be null or over 50 characters.");
    KeyboardInput name = new KeyboardInput();
    firstName = name.getStringValue();
    return firstName;

}
String getlastName(){
    System.out.println("What is your last name?");
    System.out.println("Name cannot be null or over 50 characters.");
    KeyboardInput name = new KeyboardInput();
    lastName = name.getStringValue();
    return lastName;
}
int userAge(){
    System.out.println("What is your age?");
    System.out.println("Age can not be less than 0 or greater than 130.");
    KeyboardInput age = new KeyboardInput();
    userAge = age.getIntegerValue();
    return userAge;
}
}
