package edu.iit.cs586.project;

import edu.iit.cs586.project.output.OP;
import edu.iit.cs586.project.state.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/5/1 20:23
 */
public class MDA_EFSM {
    private List<State> stateList;
    private State currentState;
    public int attempts = 0;
    public OP p;

    public MDA_EFSM (OP p) {
        this.p = p;
        stateList = new ArrayList<>();

        stateList.add(new Start(this));
        stateList.add(new Idel(this));
        stateList.add(new CheckPin(this));
        stateList.add(new Ready(this));
        stateList.add(new S1(this));
        stateList.add(new Overdrawn(this));
        stateList.add(new Locked(this));
        stateList.add(new Suspended(this));
        stateList.add(new Close(this));

        //init state
        changeState(0);
    }

    public void Open() {
        currentState.open();
    }

    public void Login() {
        currentState.login();
    }

    public void IncorrectLogin() {
        currentState.incorrectLogin();
    }

    public void IncorrectPin(int max) {
        currentState.incorrectPin(max);
    }

    public void CorrectPinBelowMin() {
        currentState.correctPinBelowMin();
    }

    public void CorrectPinAboveMin() {
        currentState.correctPinAboveMin();
    }

    public void Deposit() {
        currentState.deposit();
    }

    public void BelowMinBalance() {
        currentState.belowMinBalance();
    }

    public void AboveMinBalance() {
        currentState.aboveMinBalance();
    }

    public void Logout() {
        currentState.logout();
    }

    public void Balance() {
        currentState.balance();
    }

    public void Withdraw() {
        currentState.withdraw();
    }

    public void WithdrawBelowMinBalance() {
        currentState.withdrawBelowMinBalance();
    }

    public void NoFunds() {
        currentState.noFunds();
    }

    public void Lock() {
        currentState.lock();
    }

    public void IncorrectLock() {
        currentState.incorrectLock();
    }

    public void Unlock() {
        currentState.unlock();
    }

    public void IncorrectUnlock() {
        currentState.incorrectUnlock();
    }

    public void Suspend() {
        currentState.suspend();
    }

    public void Activate() {
        currentState.activate();
    }

    public void Close() {
        currentState.close();
    }

    public void changeState(int index) {
        this.currentState = stateList.get(index);
        System.out.println("MDA_EFSM changeState " + this.currentState.getName());
    }
}
