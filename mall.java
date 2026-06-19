public class mall extends parkingSystem {
    

    public static void main(String[] args) {
        
        parkingSystem vehicel[] = { new car(), new bike(), new truck(),new car(), new bike(), new truck() };


        int bike = 0;
        int car= 0;
        int truck = 0;

        int totalTolling =0;

        for(parkingSystem v : vehicel){
           
            if(v instanceof bike){
                v.toll();    

            }
             if(v instanceof car){

                
            }
             if(v instanceof truck){

                
            }

        }


    }
}
