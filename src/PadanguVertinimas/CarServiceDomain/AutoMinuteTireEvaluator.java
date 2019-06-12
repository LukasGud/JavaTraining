package PadanguVertinimas.CarServiceDomain;

import PadanguVertinimas.Exceptions.UnsuitableTireTypeException;
import PadanguVertinimas.Repository.Tire;
import PadanguVertinimas.Repository.TireEvaluationResult;
import PadanguVertinimas.Repository.TireEvaluator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class AutoMinuteTireEvaluator implements TireEvaluator {


    @Override
    public boolean checkTire(Tire tire) throws UnsuitableTireTypeException {

        return !checkInDetail(tire).MeetsTheRequirements();
    }


    @Override
    public boolean checkTire(List<Tire> tires) throws UnsuitableTireTypeException {

        for (Tire p : tires) {
            if (checkTire(p)) {
                return false;
            }
        }
        return true;

    }

    @Override
    public TireEvaluationResult checkByProvidingResult(Tire tire) {


        try {
            TireFeatures tireMeetsRequirements = checkInDetail(tire);
            return new DefaultTireEvaluationResult(tire, tireMeetsRequirements.MeetsTheRequirements(), tireMeetsRequirements.getNotes());

        } catch (UnsuitableTireTypeException e) {

            return new DefaultTireEvaluationResult(tire, false, e.getMessage());

        }


    }

    @Override
    public List<TireEvaluationResult> checkByProvidingResults(List<Tire> tires) throws UnsuitableTireTypeException {

        LinkedList<TireEvaluationResult> returnedResult = new LinkedList<>();
        for (Tire checkedTires : tires) {
           returnedResult.add(checkByProvidingResult(checkedTires));
        }
            printCatalog(returnedResult);


        return returnedResult;
    }

    private static void printCatalog(LinkedList<TireEvaluationResult> linkedList) {
        Iterator<TireEvaluationResult> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("\nChecked tires: " + i.next());
        }
        System.out.println("================================");
    }

    private TireFeatures checkInDetail(Tire tire) throws UnsuitableTireTypeException {

        if (Tire.TYPES.WINTER == tire.typeOfTire()) {
            if (tire.treadDepthOfTire() > 0.3) {
                return new TireFeatures(true, "");
            }

            return new TireFeatures(false, "Protektoriaus gylis yra mazesnis negu reikalaujama musu servise. Turi buti daugiau negu 0.3");

        }

        throw new UnsuitableTireTypeException("Atsiprasome, bet mes tokiu padangu netikriname");


    }

    private class TireFeatures {

        private final boolean meetsTheRequirements;
        private final String notesOnTire;


        public TireFeatures(boolean meetsTheRequirements, String notesOnTire) {
            this.meetsTheRequirements = meetsTheRequirements;
            this.notesOnTire = notesOnTire;
        }

        public boolean MeetsTheRequirements() {
            return meetsTheRequirements;
        }


        public String getNotes() {
            return notesOnTire;
        }

    }
}
