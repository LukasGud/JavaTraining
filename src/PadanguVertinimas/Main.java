package PadanguVertinimas;

import PadanguVertinimas.Exceptions.UnsuitableTireTypeException;
import PadanguVertinimas.Repository.Tire;
import PadanguVertinimas.Repository.TireEvaluationResult;
import PadanguVertinimas.Repository.TireEvaluator;
import PadanguVertinimas.CarServiceDomain.AutoMinuteTireEvaluator;
import PadanguVertinimas.CarServiceDomain.AutoPliusTireEvaluator;
import PadanguVertinimas.CarServiceDomain.TireMichellin;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        TireEvaluator john = new AutoMinuteTireEvaluator();

        TireEvaluator jim = new AutoPliusTireEvaluator();

        TireMichellin silverstone = new TireMichellin(0.4, 14, Tire.TYPES.SUMMER);

        TireMichellin zetum = new TireMichellin(0.2, 17, Tire.TYPES.WINTER);

        TireMichellin goodYear = new TireMichellin(0.5, 16, Tire.TYPES.WINTER);

        TireMichellin michellin = new TireMichellin(0.5, 15, Tire.TYPES.WINTER);

        List<Tire> bundleOfTires = new ArrayList<>();

        bundleOfTires.add(silverstone);
        bundleOfTires.add(zetum);
        bundleOfTires.add(goodYear);
        bundleOfTires.add(michellin);

        //bundleOfTires.forEach(System.out::println);
        boolean tireChecksOut = false;
        TireEvaluationResult tireEvaluationResult = null;

        try {
            john.checkByProvidingResults(bundleOfTires);
            tireEvaluationResult = john.checkByProvidingResult(silverstone);
            tireChecksOut = john.checkTire(bundleOfTires);


        } catch (UnsuitableTireTypeException e) {
            System.out.println("Jusu padangos tipas netikrinamas musu imoneje");
            try {
                tireChecksOut = jim.checkTire(bundleOfTires);

            } catch (UnsuitableTireTypeException e1) {
                System.out.println("Jusu padangos tipas netikrinamas musu imoneje");
            }

        } finally {
            System.out.println("Jusu padanga servise yra: " + (tireChecksOut ? "tinkama" : "netinkama"));
            System.out.println(tireEvaluationResult);

        }


    }
}
