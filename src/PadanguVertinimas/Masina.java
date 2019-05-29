package PadanguVertinimas;

import PadanguVertinimas.Repository.Tire;

public class Masina implements Tire {

    private String kebuloTipas;
    private int ratai;
    private double protektoriausGylis;
    private int padangosDiametras;
    private TYPES padangosTipas;

    public Masina(String kebuloTipas, int ratai, double protektoriausGylis, int padangosDiametras, TYPES padangosTipas) {
        this.kebuloTipas = kebuloTipas;
        this.ratai = ratai;
        this.protektoriausGylis = protektoriausGylis;
        this.padangosDiametras = padangosDiametras;
        this.padangosTipas = padangosTipas;
    }

    public String kebuloTipas() {
        return kebuloTipas;
    }

    public int ratai() {
        return ratai;
    }

    @Override
    public double treadDepthOfTire() {
        return protektoriausGylis;
    }

    @Override
    public int diameterOfTire() {
        return padangosDiametras;
    }

    @Override
    public TYPES typeOfTire() {
        return padangosTipas;
    }
}
