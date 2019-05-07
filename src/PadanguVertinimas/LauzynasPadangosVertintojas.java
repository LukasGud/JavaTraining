package PadanguVertinimas;

import java.util.List;

public class LauzynasPadangosVertintojas implements PadangosVertintojas {


    @Override
    public boolean tikrinti(Padanga padanga) throws NetinkamasPadangosTipasException {


        if (padanga.padangosTipas().equals("vasarine")) {
            return padanga.protektoriausGylis() > 0.6;

        }
        throw new NetinkamasPadangosTipasException("Atsiprasome, bet mes tokiu padangu netikriname");
    }

    @Override
    public boolean tikrinti(List<Padanga> padanga) throws NetinkamasPadangosTipasException {
        return false;
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