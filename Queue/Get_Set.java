
public class Get_Set {
     

private boolean insurence;
private int workingDays;
private double appraisal;
private String role;

public Get_Set(boolean insurence, int workingDays, double appraisal, String role){
    this.insurence = insurence;
    this.workingDays = workingDays;
    this.appraisal = appraisal;
    this.role = role;
}

public void updatedInsurence(boolean insurence){
   if(role.equals("Manager")){
    this.insurence = insurence;
   }
   else{
    System.out.println("Only Manager can update the insurence");
   }
} 

public void upadatedWorkingDays(int workingDays){
    if(role.equals("Manager")){
        this.workingDays = workingDays;
    }
    else{
        System.out.println("Only Manager can update the working days");
    }
}

public void updatedAppraisal(double appraisal){
    if(role.equals("Director")){
        this.appraisal = appraisal;
    }
    else{
        System.out.println("Only Director can update the appraisal");
    }
}

public void updatedRole(String role){
    if(this.role.equals("Director")){
        this.role = role;
    }
    else{
        System.out.println("Only Director can update the role");
    }
}

public boolean getInsurence(){
    return this.insurence;
}
}