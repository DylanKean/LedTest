package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.SUB_LED;

public class CMD_SetLed extends CommandBase 
{
    private SUB_LED m_led;
    private double m_setColor; 

    public CMD_SetLed(SUB_LED p_led, double p_setColor)
    {
        m_led = p_led;
        m_setColor = p_setColor;        

    }

    @Override
    public void initialize() {
        m_led.set(m_setColor);
    }


    @Override
    public boolean isFinished() {
        return true;
    }
}
