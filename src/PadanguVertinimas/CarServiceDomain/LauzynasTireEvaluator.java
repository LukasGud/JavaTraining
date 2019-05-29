package PadanguVertinimas.CarServiceDomain;

import PadanguVertinimas.Exceptions.UnsuitableTireTypeException;
import PadanguVertinimas.Repository.Tire;
import PadanguVertinimas.Repository.TireEvaluationResult;
import PadanguVertinimas.Repository.TireEvaluator;

import java.util.List;

public class LauzynasTireEvaluator implements TireEvaluator {


    @Override
    public boolean checkTire(Tire tire) throws UnsuitableTireTypeException {


        if (tire.typeOfTire().equals("vasarine")) {
            return !(tire.treadDepthOfTire() > 0.6);

        }
        throw new UnsuitableTireTypeException("Atsiprasome, bet mes tokiu padangu netikriname");
    }

    @Override
    public boolean checkTire(List<Tire> tire) throws UnsuitableTireTypeException {
        return false;
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