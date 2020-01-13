/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Subsystems.ArmRotateSubsystem;
import frc.robot.*;

public class ArmRotateCommand extends CommandBase {
  
  private final ArmRotateSubsystem m_armRotateSubsystem;

  public ArmRotateCommand(ArmRotateSubsystem subsystem) {
    m_armRotateSubsystem = subsystem;
    addRequirements(m_armRotateSubsystem);
  }

  // Called just before this Command runs the first time
  @Override
  public void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  public void execute() {
    boolean ArmUpwards_Button = RobotContainer.joy1.getRawButton(Constants.grabberRotateUpButton);
    boolean ArmDownwards_Button = RobotContainer.joy1.getRawButton(Constants.grabberRotateDownButton);

    if(ArmUpwards_Button){
      m_armRotateSubsystem.ArmUpwards();
    }
    else if(ArmDownwards_Button){
      m_armRotateSubsystem.ArmDownwards();
    }
    else{
      m_armRotateSubsystem.ArmStopBreak();
    }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  public boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  public void end(boolean interrupted) {
  }



}
