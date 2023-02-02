package edu.iit.cs586.project.output.strategy.MakeWithdraw;

import edu.iit.cs586.project.datastore.DS2;
import edu.iit.cs586.project.datastore.DataStore;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/5/2 23:26
 */
public class MakeWithdraw2 implements MakeWithdraw{
    @Override
    public void makeWithdraw(DataStore ds) {
        float b = ((DS2)ds).b;
        float w = ((DS2)ds).temp_w;
        ((DS2)ds).b = b - w;
    }
}
