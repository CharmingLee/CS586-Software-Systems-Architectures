package edu.iit.cs586.project.state;

import edu.iit.cs586.project.MDA_EFSM;
import edu.iit.cs586.project.output.OP;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/5/1 22:33
 */
public class Suspended extends State{
    public Suspended(MDA_EFSM m) {
        super(m);
    }

    @Override
    public String getName() {
        return "Suspended";
    }

    @Override
    public void activate() {
        m.changeState(3);
    }

    @Override
    public void close() {
        m.changeState(8);
    }

    @Override
    public void balance() {
        m.p.displayBalance();
    }
}
