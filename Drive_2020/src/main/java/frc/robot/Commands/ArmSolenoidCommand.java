/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Subsystems.ArmSolenoidSubsystem;
import frc.robot.RobotContainer;
import frc.robot.Constants;

public class ArmSolenoidCommand extends CommandBase {

  private final ArmSolenoidSubsystem m_armSolenoidSubsystem;
  boolean currentState;

  public ArmSolenoidCommand(ArmSolenoidSubsystem subsystem) {
    m_armSolenoidSubsystem = subsystem;
    addRequirements(m_armSolenoidSubsystem);
    currentState = false;
  }

  // Called just before this Command runs the first time
  @Override
  public void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  public void execute() {
    toggle();
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

  public void toggle(){
    // boolean toggleOpenCloseButton = RobotContainer.joy2.getRawButtonPressed(Constants.grabberRotateDownButton);
    // if(toggleOpenCloseButton){
    //   currentState = !currentState;
    // }
    // if(currentState){
    //   m_armSolenoidSubsystem.open();
    //   //set on
    // }else{
    //   m_armSolenoidSubsystem.close();
    //   //set off
    // }
  }

  // public void nonToggle(){

  //   boolean open = Robot.oi.joy2.getRawButtonPressed(Robot.joystick2.grabberOpenButton);
  //   boolean close = Robot.oi.joy2.getRawButtonPressed(Robot.joystick2.grabberCloseButton);

  //   if(open){
  //     Robot.solenoidArmSubsystem.open();
  //   }else if(close){
  //     Robot.solenoidArmSubsystem.close();
  //   }else{
  //     //dont do anything
  //   }
  // }



}
