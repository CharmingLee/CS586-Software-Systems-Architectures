package edu.iit.cs586.project.input;

import edu.iit.cs586.project.MDA_EFSM;
import edu.iit.cs586.project.abstractfactory.AbstractFactory;
import edu.iit.cs586.project.datastore.DS1;
import edu.iit.cs586.project.datastore.DataStore;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/5/1 20:28
 */
public class Account1 {
    private MDA_EFSM m;
    private DataStore ds;

    public Account1(AbstractFactory af, MDA_EFSM m) {
        this.ds = af.getDataStore();
        this.m = m;
    }

    public void open(int p, int y, int a) {
        ds.temp_p = p;
        ds.temp_y = y;
        ((DS1) ds).temp_a = a;

        m.Open();
    }

    public void pin(int x) {
        if (x == ds.pn) {
            if (((DS1) ds).b > 100) {
                m.CorrectPinAboveMin();
            } else {
                m.CorrectPinBelowMin();
            }
        } else {
            m.IncorrectPin(1);
        }
    }

    public void deposit(int d) {
        ((DS1) ds).temp_d = d;
        m.Deposit();
        if (((DS1) ds).b > 100) {
            m.AboveMinBalance();
        } else {
            m.BelowMinBalance();
        }
    }

    public void withdraw(int w) {
        ((DS1) ds).temp_w = w;
        m.Withdraw();
        if (((DS1) ds).b > 100) {
            m.AboveMinBalance();
        } else {
            m.WithdrawBelowMinBalance();
        }
    }

    public void balance() {
        m.Balance();
    }

    public void login(int y) {
        if (y == ds.id) {
            m.Login();
        } else {
            m.IncorrectLogin();
        }
    }

    public void logout() {
        m.Logout();
    }

    public void lock(int x) {
        if (x == ds.pn) {
            m.Lock();
        } else {
            m.IncorrectLock();
        }

    }

    public void unlock(int x) {
        if (x == ds.pn) {
            m.Unlock();
            if (((DS1) ds).b > 100) {
                m.AboveMinBalance();
            } else {
                m.BelowMinBalance();
            }
        } else {
            m.IncorrectUnlock();
        }
    }
}
