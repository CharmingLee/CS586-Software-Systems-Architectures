package edu.iit.cs586.project.state;

import edu.iit.cs586.project.MDA_EFSM;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/5/1 22:25
 */
public class Start extends State{
    @Override
    public String getName() {
        return "Start";
    }

    public Start(MDA_EFSM m) {
        super(m);
    }

    @Override
    public void open() {
        m.p.storeData();
        this.m.changeState(1);
    }
}
