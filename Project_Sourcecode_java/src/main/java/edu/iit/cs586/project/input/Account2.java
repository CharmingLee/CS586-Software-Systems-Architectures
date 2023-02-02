package edu.iit.cs586.project.input;

import edu.iit.cs586.project.MDA_EFSM;
import edu.iit.cs586.project.abstractfactory.AbstractFactory;
import edu.iit.cs586.project.datastore.DS2;
import edu.iit.cs586.project.datastore.DataStore;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/5/1 20:28
 */
public class Account2 {
    //m is a pointer to the MDA-EFSM object
    private MDA_EFSM m;
    //ds is a pointer to the Data Store DS-2 object In the data store:
    private DataStore ds;

    public Account2 (AbstractFactory af, MDA_EFSM m) {
        this.ds = af.getDataStore();
        this.m = m;
    }

    public void OPEN(int p, int y, float a) {
        ((DS2) ds).temp_p = p;
        ((DS2) ds).temp_y = y;
        ((DS2) ds).temp_a = a;

        m.Open();
    }

    public void PIN(int x) {
        if (x == ds.pn) {
            m.CorrectPinAboveMin();
        } else {
            m.IncorrectPin(2);
        }
    }

    public void DEPOSIT(float d) {
        ((DS2) ds).temp_d = d;
        m.Deposit();
    }

    public void WITHDRAW(float w) {
        ((DS2) ds).temp_w = w;
        if (((DS2) ds).b > 0) {
            m.Withdraw();
            m.AboveMinBalance();
        } else {
            m.NoFunds();
        }
    }

    public void BALANCE() {
        m.Balance();
    }

    public void LOGIN(int y) {
        if (y == ds.id) {
            m.Login();
        } else {
            m.IncorrectLogin();
        }
    }

    public void LOGOUT() {
        m.Logout();
    }

    public void suspend() {
        m.Suspend();
    }

    public void activate() {
        m.Activate();
    }

    public void close() {
        m.Close();
    }
}
