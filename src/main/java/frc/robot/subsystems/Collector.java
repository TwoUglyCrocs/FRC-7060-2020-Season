/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Collector extends SubsystemBase {
  /**
   * Creates a new Collector.
   */

  DifferentialDrive m_collectSys;
  SpeedControllerGroup m_collectorLeft, m_collectorRight;


  public Collector() {
    m_collectorLeft = new SpeedControllerGroup(new Spark(4));
    m_collectorRight = new SpeedControllerGroup(new Spark(5));

    m_collectSys = new DifferentialDrive(m_collectorLeft, m_collectorRight);
  }

  public void Collect(double m_speed, double m_rotation) {
    m_collectSys.tankDrive(m_speed, m_rotation);
  }

  public void Output(double m_speed, double m_rotation) {

    m_collectSys.tankDrive(-m_speed, -m_rotation);
  }

  @Override 
  public void periodic() {
    // This method will be called once per scheduler run
  }

}
