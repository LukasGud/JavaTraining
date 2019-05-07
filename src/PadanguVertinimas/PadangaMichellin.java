package PadanguVertinimas;

public class PadangaMichellin implements Padanga {


    private double protektoriausGylis;
    private int padangosDiametras;
    private TIPAI padangosTipas;


    public PadangaMichellin(double protektoriausGylis, int padangosDiametras, TIPAI padangosTipas) {
        this.protektoriausGylis = protektoriausGylis;
        this.padangosDiametras = padangosDiametras;
        this.padangosTipas = padangosTipas;
    }

    @Override
    public String toString() {
        return "PadangaMichellin{" +
                "protektoriausGylis=" + protektoriausGylis +
                ", padangosDiametras=" + padangosDiametras +
                ", padangosTipas=" + padangosTipas +
                '}';
    }

    @Override
    public double protektoriausGylis() {
        return protektoriausGylis;
    }


    @Override
    public int padangosDiametras() {
        return padangosDiametras;
    }

    @Override
    public TIPAI padangosTipas() {
        return padangosTipas;
    }


}
