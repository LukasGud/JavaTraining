package PadanguVertinimas;

import java.util.List;

public class AutoPliusPadangosVertintojas implements PadangosVertintojas {

    @Override
    public boolean tikrinti(Padanga padanga) throws NetinkamasPadangosTipasException {

        if (Padanga.TIPAI.VASARINE == padanga.padangosTipas()) {
            return padanga.padangosDiametras() == 15;
        } else if (Padanga.TIPAI.ZIEMINE == padanga.padangosTipas()) {
            return padanga.protektoriausGylis() > 0.5;
        }
        throw new NetinkamasPadangosTipasException("Atsiprasome, bet mes tokiu padangu netikriname");
    }

    @Override
    public boolean tikrinti(List<Padanga> padangos) throws NetinkamasPadangosTipasException {
        for (Padanga p: padangos) {
            if (!tikrinti(p)){
                return false;
            }
//            if (p.padangosTipas().contains("vasarine") && p.padangosTipas().contains("ziemine")) {
//                return p.protektoriausGylis() > 0.3;
//            }
        }
       return true;
    }

    @Override
    public PadangosPatikrosRezultatas tikrintiPateikiantRezultata(Padanga padanga) throws NetinkamasPadangosTipasException {
        return null;
    }

    @Override
    public List<PadangosPatikrosRezultatas> tikrintuPadanguSarasas(List<Padanga> padangos) throws NetinkamasPadangosTipasException {
        return null;
    }


}
