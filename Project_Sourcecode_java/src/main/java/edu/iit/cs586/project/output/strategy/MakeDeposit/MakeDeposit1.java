package edu.iit.cs586.project.output.strategy.MakeDeposit;

import edu.iit.cs586.project.datastore.DS1;
import edu.iit.cs586.project.datastore.DataStore;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/5/2 23:41
 */
public class MakeDeposit1 implements MakeDeposit{
    @Override
    public void makeDeposit(DataStore ds) {
        int d = ((DS1)ds).temp_d;
        int b = ((DS1) ds).b;

        ((DS1) ds).b = d + b;
    }
}
