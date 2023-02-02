package edu.iit.cs586.project.state;

import edu.iit.cs586.project.MDA_EFSM;
import edu.iit.cs586.project.output.OP;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/5/2 16:58
 */
public class Close extends State{
    public Close(MDA_EFSM m) {
        super(m);
    }

    @Override
    public String getName() {
        return "Close";
    }
}
