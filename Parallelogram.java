public class Parallelogram extends Quadrilateral{

    private int parallelSide;

    public Parallelogram(String name, int height, int totalSide, int parallelSide){
        super(name, height, totalSide);
        this.parallelSide = parallelSide;
    }

    public String saySides(){
        String hey = "I have " + parallelSide + " parallel sides!";
        return hey;
    }
}