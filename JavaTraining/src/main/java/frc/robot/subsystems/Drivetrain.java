package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase{

    PWMSparkMax leftMotor;
    PWMSparkMax rightMotor;

    public Drivetrain(){

        leftMotor = new PWMSparkMax(1);
        rightMotor = new PWMSparkMax(0);
        
    }

    public void tankDrive(double leftSpeed, double rightSpeed){

        leftMotor.setSpeed(leftSpeed);
        rightMotor.setSpeed(rightSpeed);
    }
}