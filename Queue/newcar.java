public class newcar implements engineType, Engine, media  {

    @Override
    public void start() {
        System.out.println("The normal Engine Started");
    }

    @Override
    public void stop() {

        System.out.println("The normal Engine Stoped");
     }

  
    @Override
    public void disealEngine() {
        System.out.println("Switched Diesel engine engaged");
    }

    @Override
    public void petrolEngine() {
        System.out.println("Switched Petrol engine engaged");
    }

    @Override
    public void electricEngine() {
        System.out.println("Switched Electric engine engaged");
    }


      @Override
    public void Start() {
       System.out.println("The media player has started");
    }

}
