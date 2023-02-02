package edu.iit.cs586.project.output.strategy.MakeWithdraw;

import edu.iit.cs586.project.datastore.DS1;
import edu.iit.cs586.project.datastore.DataStore;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/5/2 23:24
 */
public class MakeWithdraw1 implements MakeWithdraw{
    @Override
    public void makeWithdraw(DataStore ds) {
        int b = ((DS1)ds).b;
        int w = ((DS1)ds).temp_w;
        if (b - w <= 100) {
            ((DS1)ds).b = b - w - 15;
        } else {
            ((DS1)ds).b = b - w;
        }
    }
}
