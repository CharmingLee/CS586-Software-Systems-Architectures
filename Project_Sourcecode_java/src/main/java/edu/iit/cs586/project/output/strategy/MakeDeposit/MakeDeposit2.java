package edu.iit.cs586.project.output.strategy.MakeDeposit;

import edu.iit.cs586.project.datastore.DS2;
import edu.iit.cs586.project.datastore.DataStore;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/5/2 23:41
 */
public class MakeDeposit2 implements MakeDeposit{
    @Override
    public void makeDeposit(DataStore ds) {
        float d = ((DS2)ds).temp_d;
        float b = ((DS2) ds).b;

        ((DS2) ds).b = d + b;
    }
}
