package PadanguVertinimas.CarServiceDomain;

import PadanguVertinimas.Exceptions.UnsuitableTireTypeException;
import PadanguVertinimas.Repository.Tire;
import PadanguVertinimas.Repository.TireEvaluationResult;
import PadanguVertinimas.Repository.TireEvaluator;

import java.util.List;

public class AutoPliusTireEvaluator implements TireEvaluator {

    @Override
    public boolean checkTire(Tire tire) throws UnsuitableTireTypeException {

        if (Tire.TYPES.SUMMER == tire.typeOfTire()) {
            return tire.diameterOfTire() != 15;
        } else if (Tire.TYPES.WINTER == tire.typeOfTire()) {
            return !(tire.treadDepthOfTire() > 0.5);
        }
        throw new UnsuitableTireTypeException("Atsiprasome, bet mes tokiu padangu netikriname");
    }

    @Override
    public boolean checkTire(List<Tire> padangos) throws UnsuitableTireTypeException {
        for (Tire p: padangos) {
            if (checkTire(p)){
                return false;
            }

        }
       return true;
    }

    @Override
    public TireEvaluationResult checkByProvidingResult(Tire tire) throws UnsuitableTireTypeException {
        return null;
    }

    @Override
    public List<TireEvaluationResult> catalogOfCheckedTires(List<Tire> padangos) throws UnsuitableTireTypeException {
        return null;
    }


}
