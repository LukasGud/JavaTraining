package PadanguVertinimas.CarServiceDomain;

import PadanguVertinimas.Exceptions.UnsuitableTireTypeException;
import PadanguVertinimas.Repository.Tire;
import PadanguVertinimas.Repository.TireEvaluationResult;
import PadanguVertinimas.Repository.TireEvaluator;

import java.util.List;

public class AutoMinuteTireEvaluator implements TireEvaluator {


    @Override
    public boolean checkTire(Tire tire) throws UnsuitableTireTypeException {

        return !checkInDetail(tire).isMeetsTheRequirements();
    }


    @Override
    public boolean checkTire(List<Tire> padangos) throws UnsuitableTireTypeException {

        for (Tire p : padangos) {
            if (checkTire(p)) {
                return false;
            }
        }
        return true;

    }

    @Override
    public TireEvaluationResult checkByProvidingResult(Tire tire) {


        try {
            PadangosSavybe tireMeetsRequirements = checkInDetail(tire);
            return new DefaultTireEvaluationResult(tire, tireMeetsRequirements.isMeetsTheRequirements(), tireMeetsRequirements.getPastabos());

        } catch (UnsuitableTireTypeException e) {

            return new DefaultTireEvaluationResult(tire, false, e.getMessage());

        }


    }

    @Override
    public List<TireEvaluationResult> catalogOfCheckedTires(List<Tire> padangos) throws UnsuitableTireTypeException {

        return null;
    }
    private PadangosSavybe checkInDetail(Tire tire) throws UnsuitableTireTypeException {

        if (Tire.TYPES.WINTER == tire.typeOfTire()) {
            if (tire.treadDepthOfTire() > 0.3) {
                return new PadangosSavybe(true, "");
            }

            return new PadangosSavybe(false, "Protektoriaus gylis yra mazesnis negu reikalaujama musu servise. Turi buti daugiau negu 0.3");

        }

        throw new UnsuitableTireTypeException("Atsiprasome, bet mes tokiu padangu netikriname");


    }

    private class PadangosSavybe {

        private final boolean meetsTheRequirements;
        private final String notesOnTire;


        public PadangosSavybe(boolean meetsTheRequirements, String notesOnTire) {
            this.meetsTheRequirements = meetsTheRequirements;
            this.notesOnTire = notesOnTire;
        }

        public boolean isMeetsTheRequirements() {
            return meetsTheRequirements;
        }


        public String getPastabos() {
            return notesOnTire;
        }

    }
}
