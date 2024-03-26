public class Airplane extends Vehicle{
    
    private int wings;

    public Airplane(String name, int wheels, int wings){
        super(name, wheels);
        this.wings = wings;
    }

    public int getWings(){
        return wings;
    }

    public void takeOff(){
        System.out.println("The plane has taken off!");
    }

}
