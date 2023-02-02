package edu.iit.cs586.project.state;

import edu.iit.cs586.project.MDA_EFSM;
import edu.iit.cs586.project.output.OP;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/5/1 22:27
 */
public class CheckPin extends State{
    public CheckPin(MDA_EFSM m) {
        super(m);
    }

    @Override
    public String getName() {
        return "CheckPin";
    }

    @Override
    public void logout() {
        this.m.changeState(1);
    }

    @Override
    public void incorrectPin(int max) {
        if (m.attempts < max) {
            m.attempts++;
            m.p.incorrectPinMsg();
        } else {
            m.p.incorrectPinMsg();
            m.p.tooManyAttemptsMsg();
            this.m.changeState(1);
        }
    }

    @Override
    public void correctPinAboveMin() {
        m.p.displayMenu();
        this.m.changeState(3);
    }

    @Override
    public void correctPinBelowMin() {
        m.p.displayMenu();
        this.m.changeState(5);
    }
}
