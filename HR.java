public class HR extends AbstractClasses {
    


    @Override

    public void calculateAnualSalary(int id, String name, double salary){
        
        

        double anual = salary * 12;

    
        System.out.println("Annual salary for " + name + " (id=" + id + "): " + anual);


    }
}
