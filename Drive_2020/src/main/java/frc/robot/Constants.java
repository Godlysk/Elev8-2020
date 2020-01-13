/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public final static int grabberShooterOpen = 12;
    public final static int grabberShooterClose = 11;

    public final static int grabberRotateUpButton = 8;
    public final static int grabberRotateDownButton =7;

    // CAN IDs
    public final static int FR_port = 3;
    public final static int FL_port = 2;
    public final static int BR_port = 4;
    public final static int BL_port = 1;

    public final static double maxSpeed = 0.4;
    public final static double swerveCoefficient = 0.6;
    public final static double yDeadband = 0.1;
    public final static double zDeadband = 0.1;
    
    public final static double zTurnThreshold = 0.1;


    //Buttons
    public final static int steerButtonNumber = 2;
    public final static int brakeButtonNumber = 7;


}
