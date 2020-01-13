/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class ArmRotateSubsystem extends SubsystemBase {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private final WPI_TalonSRX ArmVerticalMotor;
  // private final Encoder encArmVertical;

  public ArmRotateSubsystem() {
    ArmVerticalMotor = new WPI_TalonSRX(9);
  }

  public void ArmUpwards() {
    ArmVerticalMotor.set(0.6);
  }

  public void ArmDownwards() {
    ArmVerticalMotor.set(-0.6);
  }

  public void ArmStopBreak() {
    ArmVerticalMotor.set(0);
  }
 
}
