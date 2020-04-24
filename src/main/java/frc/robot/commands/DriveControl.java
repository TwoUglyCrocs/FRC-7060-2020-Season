/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;
import frc.robot.Constants;

public class DriveControl extends CommandBase {
  /**
   * Creates a new DriveControl.
   */
  private final DriveTrain m_driveTrain;
  private final Joystick m_driverJoystick;

  public DriveControl(DriveTrain driveTrain, Joystick driverJoystick) {
    this.m_driveTrain = driveTrain;
    this.m_driverJoystick = driverJoystick;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(driveTrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_driveTrain.arcadeDrive(m_driverJoystick.getRawAxis(Constants.AXIS_LEFT_STICK_Y), m_driverJoystick.getRawAxis(Constants.AXIS_LEFT_STICK_X));
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
