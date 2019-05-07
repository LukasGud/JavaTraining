package PadanguVertinimas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        PadangosVertintojas jonas = new AutoMinutePadangosVertintojas();

        PadangosVertintojas genadijus = new AutoPliusPadangosVertintojas();

        // Masina audi = new Masina("Sedanas", 4, 0.3, "14", "vasarine");
        //Masina volvo = new Masina("universalas", 4, 0.5, "16", "ziemine");
        // Masina bmw = new Masina("hecbekas", 4, 0.5, "15", "vasarine");

        PadangaMichellin silverstone = new PadangaMichellin(0.4, 14, Padanga.TIPAI.VASARINE);

        PadangaMichellin zetum = new PadangaMichellin(0.2, 17, Padanga.TIPAI.ZIEMINE);

        PadangaMichellin goodYear = new PadangaMichellin(0.5, 16, Padanga.TIPAI.ZIEMINE);

        PadangaMichellin michellin = new PadangaMichellin(0.5, 15, Padanga.TIPAI.ZIEMINE);

        List<Padanga> padanguKomplektas = new ArrayList();
        padanguKomplektas.add(silverstone);
        padanguKomplektas.add(zetum);
        padanguKomplektas.add(goodYear);
        padanguKomplektas.add(michellin);
        //System.out.println(Arrays.toString(padanguKomplektas.toArray()));
        padanguKomplektas.forEach(System.out::println);
        boolean padangaTinkama = false;

        try {
            jonas.tikrintiPateikiantRezultata(silverstone);
            padangaTinkama = jonas.tikrinti(padanguKomplektas);

        } catch (NetinkamasPadangosTipasException e) {
            System.out.println("Jusu padangos tipas netikrinamas musu imoneje");
            try {
                padangaTinkama = genadijus.tikrinti(padanguKomplektas);
            } catch (NetinkamasPadangosTipasException e1) {
                System.out.println("Jusu padangos tipas netikrinamas musu imoneje");
            }

        } finally {
            System.out.println("Jusu padanga servise yra: " + (padangaTinkama ? "tinkama" : "netinkama"));

        }


    }
}
