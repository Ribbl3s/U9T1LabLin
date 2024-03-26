public class Quadrilateral{
    private String name;
    private int height;
    private int totalSide;

    public Quadrilateral(String name, int height, int totalSide){
        this.name = name;
        this.height = height;
        this.totalSide = totalSide;
    }

    public String getName(){
        return name;
    }

    public int getHeight(){
        return height;
    }
    public int getTotalSide(){
        return totalSide;
    }

}