package edu.iit.cs586.project.state;

import edu.iit.cs586.project.MDA_EFSM;
import edu.iit.cs586.project.output.OP;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/5/1 22:31
 */
public class S1 extends State{
    public S1(MDA_EFSM m) {
        super(m);
    }

    @Override
    public String getName() {
        return "S1";
    }

    @Override
    public void aboveMinBalance() {
        this.m.changeState(3);
    }

    @Override
    public void withdrawBelowMinBalance() {
        m.p.penalty();
        this.m.changeState(5);
    }

    @Override
    public void belowMinBalance() {
        this.m.changeState(5);
    }
}
