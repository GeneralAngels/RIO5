package frc.robot.efrat.statemachine.states;

import frc.robot.efrat.statemachine.State;
import frc.robot.efrat.statemachine.StateMachine;

public class HatchReadyL2 extends State {
    @Override
    public void apply() {
    }

    @Override
    public State nextState(StateMachine.Input input) {
        switch (input) {
            case OP_Y:
                return find("hatchoutL2");
            case OP_1:
                return find("hatchreadyL1");
            case OP_3:
                return find("hatchreadyL3");
        }
        return null;
    }
}
