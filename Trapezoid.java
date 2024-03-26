public class Trapezoid  extends Quadrilateral{

    private int nonParallelSides;

    public Trapezoid(String name, int height, int totalSide, int nonParallelSides){
        super(name, height, totalSide);
        this.nonParallelSides = nonParallelSides;
    }
    
    public void saySide(){
        System.out.println("I have " + nonParallelSides + "  nonparallelsides");
    }
}