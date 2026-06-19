

public class object {
    
   public static void main(String[] args) {
       object std1 = new object();
       std1.student();
       std1.classbunk();
   }

   public void student() {
       String name = "Atharv";
       int roll_no = 123;
       System.out.println("Name: " + name);
       System.out.println("Roll No: " + roll_no);
   }

   public void classbunk(){

    boolean bunk = false;
    
    System.out.println("Is the student bunking class? " + bunk);

     if(bunk){

        System.out.println("The student is bunking class.");

     } else {

        System.out.println("The student is attending class.");
     }



   }

}
