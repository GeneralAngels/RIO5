package frc.robot.efrat.systems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.bobot.Subsystem;

public class Klein extends Subsystem {
    private static Klein latest;
    private WPI_TalonSRX motor1, motor2, motor3, motor4;

    public Klein() {
        latest = this;
        motor1 = new WPI_TalonSRX(20);
        motor2 = new WPI_TalonSRX(21);
        motor3 = new WPI_TalonSRX(22);
        motor4 = new WPI_TalonSRX(23);
        motor1.setInverted(true);
        motor2.setInverted(true);
    }

    public static Klein getInstance() {
        return latest;
    }

    public static void init() {
        if (getInstance() == null) new Klein();
    }

    public void set(double speed) {
//        log("Fucking here biuthcih");
        motor1.set(speed);
        motor2.set(speed);
        motor3.set(speed);
        motor4.set(speed);
    }
}
