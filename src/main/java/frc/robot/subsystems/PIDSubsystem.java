// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.ControlType;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.SparkMaxPIDController;

import frc.robot.Constants;

public class PIDSubsystem extends SubsystemBase {

  private double proportional;
  private double integral;
  private double derivative;
  private CANSparkMax frontLeftMotor;
  private SparkMaxPIDController pidController;

  /** Creates a new ExampleSubsystem. */
  public PIDSubsystem() {
    proportional = Constants.P;
    integral = Constants.I;
    derivative = Constants.D;
    frontLeftMotor = new CANSparkMax(0, MotorType.kBrushless);
    pidController = frontLeftMotor.getPIDController();

    pidController.setP(proportional);
    pidController.setI(integral);
    pidController.setD(derivative);

  }

  

  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
