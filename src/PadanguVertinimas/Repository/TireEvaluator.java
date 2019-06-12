package PadanguVertinimas.Repository;


import PadanguVertinimas.Exceptions.UnsuitableTireTypeException;

import java.util.List;

public interface TireEvaluator {

    boolean checkTire(Tire tire) throws UnsuitableTireTypeException;

    boolean checkTire(List<Tire> tires) throws UnsuitableTireTypeException;

    TireEvaluationResult checkByProvidingResult(Tire tire) throws UnsuitableTireTypeException;

    List<TireEvaluationResult> checkByProvidingResults(List<Tire> tires) throws UnsuitableTireTypeException;


}
