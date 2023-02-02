package edu.iit.cs586.project.state;

import edu.iit.cs586.project.MDA_EFSM;
import edu.iit.cs586.project.output.OP;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/5/1 22:30
 */
public class Overdrawn extends State{
    public Overdrawn(MDA_EFSM m) {
        super(m);
    }

    @Override
    public String getName() {
        return "Overdrawn";
    }

    @Override
    public void balance() {
        m.p.displayBalance();
    }

    @Override
    public void incorrectLock() {
        m.p.IncorrectLockMsg();
    }

    @Override
    public void lock() {
        this.m.changeState(6);
    }

    @Override
    public void withdraw() {
        m.p.makeWithdraw();
    }

    @Override
    public void logout() {
        this.m.changeState(1);
    }

    @Override
    public void deposit() {
        m.p.makeDeposit();
        m.changeState(4);
    }
}
