// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PIDSubsystem extends SubsystemBase {
  private int proportional;
  private int intergal;
  private int derivative;
  /** Creates a new ExampleSubsystem. */
  public PIDSubsystem(int p,int i,int d) {
    proportional =p;
    intergal = i;
    derivative = d;
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
