package PadanguVertinimas.CarServiceDomain;

import PadanguVertinimas.Repository.Tire;
import PadanguVertinimas.Repository.TireEvaluationResult;

public class DefaultTireEvaluationResult implements TireEvaluationResult {

    private Tire checkedTire;
    private boolean checkIfTirePassesRequirements;
    private String notesOnCheckedTire;

    public DefaultTireEvaluationResult(Tire checkedTire, boolean checkIfTirePassesRequirements) {
        this(checkedTire, checkIfTirePassesRequirements, "");

    }

    public DefaultTireEvaluationResult(Tire checkedTire, boolean checkIfTirePassesRequirements, String notesOnCheckedTire) {
        this.checkedTire = checkedTire;
        this.checkIfTirePassesRequirements = checkIfTirePassesRequirements;
        this.notesOnCheckedTire = notesOnCheckedTire;
    }

    @Override
    public Tire checkThisTire() {
        System.out.println("Tire being checked: " + checkedTire.toString());
        return checkedTire;
    }

    @Override
    public boolean checkIfTirePassesRequirements() {

        return checkIfTirePassesRequirements;
    }

    @Override
    public String getNotesOnCheckedTire() {

        return notesOnCheckedTire;
    }

    @Override
    public String toString() {
        return "\nJusu padanga: " + checkedTire + "\n  " + (checkIfTirePassesRequirements ? "Tinkama" :"Netinkama") + "\nNotes: " + notesOnCheckedTire;
    }
}
