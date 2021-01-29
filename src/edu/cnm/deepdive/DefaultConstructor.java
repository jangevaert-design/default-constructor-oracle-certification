package edu.cnm.deepdive;

public class DefaultConstructor {

  public static void main(String[] args) {
    Dog dog = new Dog();// we don't have a constructor in Dog class so the compiler will create a no
    //argument constructor. If you run the code, the 'out' file will be created where you can check
    //the compiled code. By double clicking on the Dog.class file you will see that the dog constructor
    //with no parameters has been added.
  }
}
