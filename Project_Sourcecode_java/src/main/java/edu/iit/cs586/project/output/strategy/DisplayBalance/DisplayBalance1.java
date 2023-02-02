package edu.iit.cs586.project.output.strategy.DisplayBalance;

import edu.iit.cs586.project.datastore.DS1;
import edu.iit.cs586.project.datastore.DataStore;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/5/2 23:37
 */
public class DisplayBalance1 implements DisplayBalance{
    @Override
    public void displayBalance(DataStore ds) {
        System.out.println("Display Balance: " + ((DS1)ds).b);
    }
}
