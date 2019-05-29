package PadanguVertinimas.Repository;


import PadanguVertinimas.Exceptions.UnsuitableTireTypeException;

import java.util.List;

public interface TireEvaluator {

    boolean checkTire(Tire tire) throws UnsuitableTireTypeException;

    boolean checkTire(List<Tire> padangos) throws UnsuitableTireTypeException;

    TireEvaluationResult checkByProvidingResult(Tire tire) throws UnsuitableTireTypeException;

    List<TireEvaluationResult> catalogOfCheckedTires(List<Tire> padangos) throws UnsuitableTireTypeException;


}
