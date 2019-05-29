package PadanguVertinimas.Repository;

public interface Tire {


    double treadDepthOfTire();

    int diameterOfTire();

    TYPES typeOfTire();

    enum TYPES {
        SUMMER, WINTER
    }

}
