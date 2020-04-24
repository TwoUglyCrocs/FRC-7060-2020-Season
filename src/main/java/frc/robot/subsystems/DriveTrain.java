/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  /**
   * Creates a new DriveTrain.
   */

  DifferentialDrive driveFrame;
  SpeedControllerGroup leftMaster, rightMaster;

  TalonSRX mytalon = new TalonSRX(0);

  public DriveTrain() {

    mytalon.set(ControlMode.PercentOutput, 0);
    //leftMaster = new SpeedControllerGroup(new TalonSRX(0), new TalonSRX(1));
    //rightMaster = new SpeedControllerGroup(new Talon(2), new Talon(3));

    driveFrame = new DifferentialDrive(leftMaster, rightMaster);
  }
  
  public void arcadeDrive(double m_speed, double rotation) {
    driveFrame.arcadeDrive(m_speed, rotation);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

}
