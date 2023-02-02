package edu.iit.cs586.project.state;

import edu.iit.cs586.project.MDA_EFSM;
import edu.iit.cs586.project.output.OP;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/5/1 22:26
 */
public class Idel extends State {
    public Idel(MDA_EFSM m) {
        super(m);
    }

    @Override
    public String getName() {
        return "Idel";
    }

    @Override
    public void login() {
        m.attempts = 0;
        m.p.promptForPin();
        this.m.changeState(2);
    }

    @Override
    public void incorrectLogin() {
        m.p.incorrectIdMsg();
        this.m.changeState(1);
    }
}
