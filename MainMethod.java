//examples_constructor_staticmethod_publicmethod.java 
//Create a Main class

public class MainMethod {
  int x;

  // Create a class constructor for the Main class
  public MainMethod() {
    x = 5;
  }
  
 //public method
  public void mainNew() {
   int y = 50;
   System.out.println(y);
   //making changes for GitDemoNew
      System.out.println(y);
      System.out.println(y);
      System.out.println(y);
      System.out.println(y);
      System.out.println(y);
      System.out.println("changes made one");
      System.out.println("changes made by GitX");
      System.out.println("changes made by GitX");
      System.out.println("changes made by GitDemoNew person");
      System.out.println("changes made by GitDemoNew person");
      )
  }
  
  //static method
  public static void mainNew1() {
   int z = 150;
   System.out.println(z);
  }


  public static void main(String[] args) {
    MainMethod myObj = new MainMethod();
    
//for constructors, when we create an obj of constructor,it 
   System.out.println(myObj.x);
    
    MainMethod myObj1 = new MainMethod();
    
    myObj1.mainNew();//for non static methods we need to call on obj
    mainNew1(); //for static methods no need to call on obj we can call directly
   
   }
}

//output
//5
//50
//150
