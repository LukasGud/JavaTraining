package PadanguVertinimas;

public interface Padanga {


    double protektoriausGylis();

    int padangosDiametras();

    TIPAI padangosTipas();

    enum TIPAI {
        VASARINE, ZIEMINE
    }

}
