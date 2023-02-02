package edu.iit.cs586.project.state;

import edu.iit.cs586.project.MDA_EFSM;
import edu.iit.cs586.project.output.OP;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/5/1 22:28
 */
public class Ready extends State{
    public Ready(MDA_EFSM m) {
        super(m);
    }

    @Override
    public String getName() {
        return "Ready";
    }

    @Override
    public void logout() {
        this.m.changeState(1);
    }

    @Override
    public void withdraw() {
        m.p.makeWithdraw();
        this.m.changeState(4);
    }

    @Override
    public void balance() {
        m.p.displayBalance();
    }

    @Override
    public void lock() {
        this.m.changeState(6);
    }

    @Override
    public void incorrectLock() {
        m.p.IncorrectLockMsg();
    }

    @Override
    public void deposit() {
        m.p.makeDeposit();
    }

    @Override
    public void suspend() {
        m.changeState(7);
    }

    @Override
    public void noFunds() {
        m.p.noFundsMsg();
    }
}
