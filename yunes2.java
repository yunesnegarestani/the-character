public class NewClass2 {

  // Follow the steps below to use this file

  // 1. In the main file, create an instance of this class:
  // NewClass2 instance2 = new NewClass2();

  // 2. Call the method to get the greeting message:
  // System.out.println(instance2.sayHelloFromNewClass());

  public String sayHelloFromNewClass(){
    import java.util.Scanner;
    public class main {
      public static void Main(String[]
      args)
      {
        Scanner scanner = New
        Scanner(System.in);
        String[] names = new String[10];
        //دریافت اسم 10 کاربر
        System.out.println("اسم کاربران");
        for (int i=0; i < 5; i++){
          System.out.print(i + 1);
          names[i]=scanner.nextLine();
        } 
        //چاپ اسم ها و تعدادحروف شان
        System.out.println("\n result");
        for (String name:names){
          int length = name.length();
          System.out.println("اسم:+name+"-تعداد حروف:"+length);
        } 
        scanner.close();
      }
    }
  }

}