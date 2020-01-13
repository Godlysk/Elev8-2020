/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.Commands.ArmRotateCommand;
import frc.robot.Commands.DriveCommand;
import frc.robot.Subsystems.ArmRotateSubsystem;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Commands.BrakeCommand;
import frc.robot.Commands.SteerCommand;
import frc.robot.Subsystems.DriveSubsystem;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final DriveSubsystem m_driveSubsystem = new DriveSubsystem();
  private final DriveCommand m_driveCommand = new DriveCommand(m_driveSubsystem);

  private final ArmRotateSubsystem m_armRotateSubsystem = new ArmRotateSubsystem();
  private final ArmRotateCommand m_armRotateCommand = new ArmRotateCommand(m_armRotateSubsystem);  
  
  // Joystick kept public
  public static Joystick joy1 = new Joystick(1);
  public static Joystick joy2 = new Joystick(2);

  private final DriveSubsystem driveSubsystem = new DriveSubsystem();
  private final DriveCommand driveCommand = new DriveCommand(driveSubsystem);

  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
    m_armRotateSubsystem.setDefaultCommand(m_armRotateCommand);
    driveSubsystem.setDefaultCommand(driveCommand);
    
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
   
    JoystickButton commandBrakeButton = new JoystickButton(joy1, Constants.brakeButtonNumber);
    JoystickButton commandSteerButton = new JoystickButton(joy1, Constants.steerButtonNumber);
    
    commandBrakeButton.whileActiveContinuous(new BrakeCommand(driveSubsystem));
    commandSteerButton.whenPressed(new SteerCommand(driveSubsystem));

  }


  public static double getY(final Joystick joy, final double band) {
    // Inverted (Joystick moved forwards gives negtive reading)
    double val = -joy.getY();

    if (Math.abs(val) < band)
        val = 0;
    else {
        val = val - Math.signum(val) * band;
    }
    return val;
  }

  public static double getZ(Joystick joy, double band) {
    double val = joy.getZ();

    if (Math.abs(val) < band)
        val = 0;
    else {
        val = val - Math.signum(val) * band;
    }
    return val;
  }

  public static double getX(Joystick joy, double band) {

    double val = joy.getX();

    if (Math.abs(val) < band)
        val = 0;
    else {
        val = val - Math.signum(val) * band;
    }
    return val;
  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return null;
  }
}
