public class Main {
    public static void main(String[] args) {
        // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Generic Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn();
        myVehicle.brake();

        // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(); // inherited method
        myCar.brake(); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        // ---- WRITE YOUR BICYCLE TEST CODE BELOW ----

        Bicycle myBike = new Bicycle("Gen G is ass", 2, 5);
        System.out.println(myBike.getGearCount());
        System.out.println(myBike.getName());
        System.out.println(myBike.getWheels());
        myBike.move(45); // inherited method
        myBike.turn(); // inherited method
        myBike.brake(); // inherited method
        myBike.ringBell();

        Airplane myAirplane = new Airplane("Sen win :C", 4, 2);
        System.out.println(myAirplane.getWings());
        System.out.println(myAirplane.getName());
        System.out.println(myAirplane.getWheels());
        myAirplane.move(100);
        myAirplane.turn();
        myAirplane.brake();
        myAirplane.takeOff();


        Quadrilateral myQuadrilateral = new Quadrilateral("Square", 5, 4);
        System.out.println(myQuadrilateral.getHeight());
        System.out.println(myQuadrilateral.getName());
        System.out.println(myQuadrilateral.getTotalSide());

        Parallelogram myParallelogram = new Parallelogram("Parallelogram", 5, 4, 2);

        System.out.println(myParallelogram.getHeight());
        System.out.println(myParallelogram.getName());
        System.out.println(myParallelogram.getTotalSide());
        myParallelogram.saySides();

        Trapezoid myTrapezoid = new Trapezoid("Trapezoid", 5,4, 1);
        System.out.println(myTrapezoid.getHeight());
        System.out.println(myTrapezoid.getName());
        System.out.println(myTrapezoid.getTotalSide());
        myTrapezoid.saySide();


    }
}