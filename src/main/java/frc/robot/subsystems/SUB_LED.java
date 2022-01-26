package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;

public class SUB_LED {
    private Spark m_blinkin;
    
    public SUB_LED(int portNum)
    {
        m_blinkin = new Spark(portNum);

    }
    public void set(double val)
    {
        if ((val >-1.0) && (val <= 1.0))
        {
            m_blinkin.set(val);
        }
    }

}

