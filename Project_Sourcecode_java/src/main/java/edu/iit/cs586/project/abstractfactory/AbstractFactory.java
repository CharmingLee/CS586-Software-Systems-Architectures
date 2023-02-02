package edu.iit.cs586.project.abstractfactory;

import edu.iit.cs586.project.datastore.DataStore;
import edu.iit.cs586.project.output.strategy.DisplayBalance.DisplayBalance;
import edu.iit.cs586.project.output.strategy.DisplayMenu.DisplayMenu;
import edu.iit.cs586.project.output.strategy.IncorrectIdMsg.IncorrectIdMsg;
import edu.iit.cs586.project.output.strategy.IncorrectLockMsg.IncorrectLockMsg;
import edu.iit.cs586.project.output.strategy.IncorrectPinMsg.IncorrectPinMsg;
import edu.iit.cs586.project.output.strategy.IncorrectUnlockMsg.IncorrectUnlockMsg;
import edu.iit.cs586.project.output.strategy.MakeDeposit.MakeDeposit;
import edu.iit.cs586.project.output.strategy.MakeWithdraw.MakeWithdraw;
import edu.iit.cs586.project.output.strategy.NoFundsMsg.NoFundsMsg;
import edu.iit.cs586.project.output.strategy.Penalty.Penalty;
import edu.iit.cs586.project.output.strategy.PromptForPin.PromptForPin;
import edu.iit.cs586.project.output.strategy.StoreData.StoreData;
import edu.iit.cs586.project.output.strategy.TooManyAttemptsMsg.TooManyAttemptsMsg;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/5/1 21:43
 */
public abstract class AbstractFactory {
    protected DataStore ds;

    /**
     * Actions
     */
    // displays the current value of the balance
    protected DisplayBalance displayBalance;
    // display a menu with a list of transactions
    protected DisplayMenu displayMenu;
    // displays incorrect ID message
    protected IncorrectIdMsg incorrectIdMsg;
    // displays incorrect lock msg
    protected IncorrectLockMsg incorrectLockMsg;
    // displays incorrect pin message
    protected IncorrectPinMsg incorrectPinMsg;
    // displays incorrect unlock msg
    protected IncorrectUnlockMsg incorrectUnlockMsg;
    // makes deposit (increases balance by a value stored in temp_d in data store)
    protected MakeDeposit makeDeposit;
    // makes withdraw (decreases balance by a value stored in temp_w data store)
    protected MakeWithdraw makeWithdraw;
    // Displays no sufficient funds msg
    protected NoFundsMsg noFundsMsg;
    // applies penalty (decreases balance by the amount of penalty)
    protected Penalty penalty;
    // prompts to enter pin
    protected PromptForPin promptForPin;
    // stores data from temporary area in data store
    protected StoreData storeData;
    // display too many attempts message
    protected TooManyAttemptsMsg tooManyAttemptsMsg;

    public abstract DataStore getDataStore();

    /**
     * Actions
     */
    public abstract DisplayBalance getDisplayBalance();
    public abstract DisplayMenu getDisplayMenu();
    public abstract IncorrectIdMsg getIncorrectIdMsg();
    public abstract IncorrectLockMsg getIncorrectLockMsg();
    public abstract IncorrectPinMsg getIncorrectPinMsg();
    public abstract IncorrectUnlockMsg getIncorrectUnlockMsg();
    public abstract MakeDeposit getMakeDeposit();
    public abstract MakeWithdraw getMakeWithdraw();
    public abstract NoFundsMsg getNoFundsMsg();
    public abstract Penalty getPenalty();
    public abstract PromptForPin getPromptForPin();
    public abstract StoreData getStoreData();
    public abstract TooManyAttemptsMsg getTooManyAttemptsMsg();
}
