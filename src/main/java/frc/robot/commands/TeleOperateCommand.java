package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;

/**
 * TeleOperateCommand
 */
public class TeleOperateCommand extends CommandBase {

  private final XboxController operatorConsole;

  public TeleOperateCommand(XboxController operatorConsole) {
    this.operatorConsole = operatorConsole;
  }

  @Override
  public void execute() {
  }

  @Override
  public boolean isFinished() {
    return false;
  }

  @Override
  public void end(boolean interrupted) {
  }

}