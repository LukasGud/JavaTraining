package PadanguVertinimas.CarServiceDomain;

import PadanguVertinimas.Repository.Tire;

public class TireMichellin implements Tire {


    private double depthOfTread;
    private int diameterOfTire;
    private TYPES typeOfTire;


    public TireMichellin(double depthOfTread, int diameterOfTire, TYPES typeOfTire) {
        this.depthOfTread = depthOfTread;
        this.diameterOfTire = diameterOfTire;
        this.typeOfTire = typeOfTire;
    }

    @Override
    public String toString() {
        return "TireMichellin{" +
                "treadDepthOfTire=" + depthOfTread +
                ", diameterOfTire=" + diameterOfTire +
                ", typeOfTire=" + typeOfTire +
                '}';
    }

    @Override
    public double treadDepthOfTire() {
        return depthOfTread;
    }


    @Override
    public int diameterOfTire() {
        return diameterOfTire;
    }

    @Override
    public TYPES typeOfTire() {
        return typeOfTire;
    }


}
