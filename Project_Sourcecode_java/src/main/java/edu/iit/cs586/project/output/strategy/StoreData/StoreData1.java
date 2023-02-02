package edu.iit.cs586.project.output.strategy.StoreData;

import edu.iit.cs586.project.datastore.DS1;
import edu.iit.cs586.project.datastore.DataStore;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/5/2 22:52
 */
public class StoreData1 implements StoreData {
    @Override
    public void storeData(DataStore ds) {
        ds.id = ds.temp_y;
        ds.pn = ds.temp_p;
        ((DS1) ds).b = ((DS1) ds).temp_a;
    }
}
