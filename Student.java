
public class Student {
    
    String name;
    int roll;   
    float marks;
    
  Student(String name, int roll, float marks){
        this.name = name;
        this.roll = roll;
        this.marks = marks;


    }

   
public static void main(String[] args) {
   
        Student std1 = new Student("Atharv kharat", 123, 85.5f);
            
        System.out.println(std1.name);
       
        System.out.println("Student Name: " + std1.name);
        System.out.println("Student Roll Number: " + std1.roll);
        System.out.println("Student Marks: " + std1.marks);


          
           
       
    }

   

}
