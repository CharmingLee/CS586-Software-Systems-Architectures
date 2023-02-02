package edu.iit.cs586.project.state;

import edu.iit.cs586.project.MDA_EFSM;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/5/1 22:02
 */
public abstract class State {
    protected MDA_EFSM m;

    public State(MDA_EFSM m) {
        this.m = m;
    }

    public String getName() {
        return "State";
    }
    
    private String getMsg() {
        return "WARN: The current state does not support this operation";
    }

    public void login() {
        System.out.println(getMsg());
    }

    public void incorrectLogin() {
        System.out.println(getMsg());
    }

    public void open() {
        System.out.println(getMsg());
    }

    public void incorrectPin(int max) {
        System.out.println(getMsg());
    }

    public void correctPinAboveMin() {
        System.out.println(getMsg());
    }

    public void logout() {
        System.out.println(getMsg());
    }

    public void noFunds() {
        System.out.println(getMsg());
    }

    public void suspend() {
        System.out.println(getMsg());
    }

    public void deposit() {
        System.out.println(getMsg());
    }

    public void incorrectLock() {
        System.out.println(getMsg());
    }

    public void lock() {
        System.out.println(getMsg());
    }

    public void withdraw() {
        System.out.println(getMsg());
    }

    public void balance() {
        System.out.println(getMsg());
    }

    public void aboveMinBalance() {
        System.out.println(getMsg());
    }

    public void belowMinBalance() {
        System.out.println(getMsg());
    }

    public void withdrawBelowMinBalance() {
        System.out.println(getMsg());
    }

    public void unlock() {
        System.out.println(getMsg());
    }

    public void incorrectUnlock() {
        System.out.println(getMsg());
    }

    public void correctPinBelowMin() {
        System.out.println(getMsg());
    }

    public void close() {
        System.out.println(getMsg());
    }

    public void activate() {
        System.out.println(getMsg());
    }
}
