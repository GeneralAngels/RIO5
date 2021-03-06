package frc.robot.efrat.statemachine.states;

import frc.robot.efrat.statemachine.State;
import frc.robot.efrat.statemachine.StateMachine;

public class CargoReadyL2 extends State {
    @Override
    public void apply() {
    }

    @Override
    public State nextState(StateMachine.Input input) {
        switch (input){
            case OP_Y:
                return find("cargooutL2");
            case OP_1:
                return find("cargoreadyL1");
            case OP_3:
                return find("cargoreadyL3");
        }
        return null;
    }
}
