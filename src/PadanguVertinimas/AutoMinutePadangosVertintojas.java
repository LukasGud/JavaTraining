package PadanguVertinimas;

import java.util.List;

public class AutoMinutePadangosVertintojas implements PadangosVertintojas {


    @Override
    public boolean tikrinti(Padanga padanga) throws NetinkamasPadangosTipasException {


        if (Padanga.TIPAI.ZIEMINE == padanga.padangosTipas()) {
            return padanga.protektoriausGylis() > 0.3;

        }

        throw new NetinkamasPadangosTipasException("Atsiprasome, bet mes tokiu padangu netikriname");
    }

    @Override
    public boolean tikrinti(List<Padanga> padangos) throws NetinkamasPadangosTipasException {

        for (Padanga p : padangos) {
            if (!tikrinti(p)) {
                return false;
            }
        }
        return true;

//        for (Padanga p : padangos) {
//            if (p.padangosTipas() != null && p.padangosTipas().equals("ziemine")) {
//                String tipas = padangos.get(0).padangosTipas();
//                boolean allSameType = padangos.stream().allMatch(x -> x.padangosTipas().equals(tipas));
//                return allSameType;
//            }
//
//        }
    }

    @Override
    public PadangosPatikrosRezultatas tikrintiPateikiantRezultata(Padanga padanga) throws NetinkamasPadangosTipasException {

PadanguVertinimoRezultatai padanguVertinimoRezultatai = new PadanguVertinimoRezultatai();
padanguVertinimoRezultatai.tikrintaPadanga();

        PadangosPatikrosRezultatas patikra = new PadangosPatikrosRezultatas() {
            @Override
            public Padanga tikrintaPadanga() {
                System.out.println("Tikrinama padanga: " + padanga.toString());
                return padanga;
            }

            @Override
            public boolean patikrintaPadangaAtitinkaReikalavimus() {
                boolean flag = true;
                if (Padanga.TIPAI.ZIEMINE != padanga.padangosTipas()) {
                    flag = false;
                }
                if (padanga.protektoriausGylis() < 0.5) {
                    flag = false;
                }
                if (padanga.padangosDiametras() < 15) {
                    flag = false;
                }
                return flag;
            }

            @Override
            public String patikrintosPadangosPastabos() {
                String pastabos = "";    // Ar cia nehakas?
                if (Padanga.TIPAI.ZIEMINE != padanga.padangosTipas()) {
                    System.out.println("Jusu padangos tipas yra: [" + padanga.padangosTipas() + "] - musu servise netikrinamas. Turi buti ZIEMINE");
                } else {
                    System.out.println("Jusu padangos tipas yra: [" + padanga.padangosTipas() + "] - musu servise yra tinkamas");
                }
                if (padanga.padangosDiametras() < 15) {
                    System.out.println("Jusu padangos diametras yra: [" + padanga.padangosDiametras() + "] - musu servise netikriname. Turi buti 15 ar didesnis");
                } else {
                    System.out.println("Jusu padangos diametras yra: [" + padanga.padangosDiametras() + "] - atitinka musu serviso reikalavimus");
                }
                if (padanga.protektoriausGylis() < 0.5) {
                    System.out.println("Jusu padangos gylis yra [" + padanga.protektoriausGylis() + "] - neatitinka musu serviso reikalavimu. Turi buti 0.5 ar didesnis");
                } else {
                    System.out.println("Jusu padangos gylis yra [" + padanga.protektoriausGylis() + "] - atitinka musu serviso reikalavimus");
                }
                return pastabos;
            }
        };
        patikra.tikrintaPadanga();
        if (!patikra.patikrintaPadangaAtitinkaReikalavimus()) {
            System.out.println("Jusu padanga neatitinka musu serviso reikalavimu: ");
        } else {
            System.out.println("Jusu padanga atitinka musu serviso reikalavimus: ");
        }
        patikra.patikrintosPadangosPastabos();

        return patikra;
    }

    @Override
    public List<PadangosPatikrosRezultatas> tikrintuPadanguSarasas(List<Padanga> padangos) throws NetinkamasPadangosTipasException {

        PadangosPatikrosRezultatas padangosPatikrosRezultatas = new PadangosPatikrosRezultatas() {

            @Override
            public Padanga tikrintaPadanga() {

                for (Padanga p : padangos) {
                    System.out.println("Padangos tikrinamos musu servise: " + p.toString());
                }
                return (Padanga) padangos;   //Ar taip galima?
            }

            @Override
            public boolean patikrintaPadangaAtitinkaReikalavimus() {
                return false;
            }

            @Override
            public String patikrintosPadangosPastabos() {
                return null;
            }
        };
        return null;
    }


    public boolean perekuras() {
        return false;
    }



}
