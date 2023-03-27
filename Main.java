public class Main {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method

    Main myObj = new Main(); // Create an object of MyClass
    myObj.myPublicMethod(); // Call the public method
    
    Main2 myObj2 = new Main2();
    myObj2.myStaticMethod();
    myObj2.myPublicMethod();
  }
} 

 class Main2 {
 
  // Static method
  static void myStaticMethod() {
    System.out.println("2.Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("2.Public methods must be called by creating objects");
  }

  
} 


