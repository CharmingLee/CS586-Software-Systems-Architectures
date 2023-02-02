package edu.iit.cs586.project.state;

import edu.iit.cs586.project.MDA_EFSM;
import edu.iit.cs586.project.output.OP;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/5/1 22:32
 */
public class Locked extends State{
    public Locked(MDA_EFSM m) {
        super(m);
    }

    @Override
    public String getName() {
        return "Locked";
    }

    @Override
    public void unlock() {
        m.changeState(4);
    }

    @Override
    public void incorrectUnlock() {
        m.p.IncorrectUnlockMsg();
    }
}
