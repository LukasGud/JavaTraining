package PadanguVertinimas;

public class Masina implements Padanga {

    private String kebuloTipas;
    private int ratai;
    private double protektoriausGylis;
    private int padangosDiametras;
    private TIPAI padangosTipas;

    public Masina(String kebuloTipas, int ratai, double protektoriausGylis, int padangosDiametras, TIPAI padangosTipas) {
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
