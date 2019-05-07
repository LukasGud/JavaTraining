package PadanguVertinimas;


import java.util.List;

public interface PadangosVertintojas {

    boolean tikrinti(Padanga padanga) throws NetinkamasPadangosTipasException;

    boolean tikrinti(List<Padanga> padangos) throws NetinkamasPadangosTipasException;

    PadangosPatikrosRezultatas tikrintiPateikiantRezultata(Padanga padanga) throws NetinkamasPadangosTipasException;

    List<PadangosPatikrosRezultatas> tikrintuPadanguSarasas(List<Padanga> padangos) throws NetinkamasPadangosTipasException;


}
