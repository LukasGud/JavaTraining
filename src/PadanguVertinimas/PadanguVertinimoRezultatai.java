package PadanguVertinimas;

public class PadanguVertinimoRezultatai implements PadangosPatikrosRezultatas {

    Padanga tikrintaPadanga;
    boolean patikrintaPadangaAtitinkaReikalavimus;
    String patikrintosPadangosPastabos;


    @Override
    public Padanga tikrintaPadanga() {
        System.out.println("Tikrinama padanga: " + tikrintaPadanga.toString());
        return tikrintaPadanga;
    }

    @Override
    public boolean patikrintaPadangaAtitinkaReikalavimus() {
        return patikrintaPadangaAtitinkaReikalavimus;
    }

    @Override
    public String patikrintosPadangosPastabos() {
        return patikrintosPadangosPastabos;
    }
}
