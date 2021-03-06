package frc.robot.efrat.statemachine.states;

import frc.robot.efrat.statemachine.State;
import frc.robot.efrat.statemachine.StateMachine;

public class CargoReadyL1 extends State {
    @Override
    public void apply() {
    }

    @Override
    public State nextState(StateMachine.Input input) {
        switch (input){
            case OP_Y:
                return find("cargooutL1");
            case OP_2:
                return find("cargoreadyL2");
            case OP_3:
                return find("cargoreadyL3");
        }
        return null;
    }
}
