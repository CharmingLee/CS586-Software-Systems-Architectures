package edu.iit.cs586.project.output;

import edu.iit.cs586.project.abstractfactory.AbstractFactory;
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
 * @date 2022/5/1 21:26
 */
public class OP {
    private DataStore ds;

    private DisplayBalance displayBalance;
    // display a menu with a list of transactions
    private DisplayMenu displayMenu;
    // displays incorrect ID message
    private IncorrectIdMsg incorrectIdMsg;
    // displays incorrect lock msg
    private IncorrectLockMsg incorrectLockMsg;
    // displays incorrect pin message
    private IncorrectPinMsg incorrectPinMsg;
    // displays incorrect unlock msg
    private IncorrectUnlockMsg incorrectUnlockMsg;
    // makes deposit (increases balance by a value stored in temp_d in data store)
    private MakeDeposit makeDeposit;
    // makes withdraw (decreases balance by a value stored in temp_w data store)
    private MakeWithdraw makeWithdraw;
    // Displays no sufficient funds msg
    private NoFundsMsg noFundsMsg;
    // applies penalty (decreases balance by the amount of penalty)
    private Penalty penalty;
    // prompts to enter pin
    private PromptForPin promptForPin;
    // stores data from temporary area in data store
    private StoreData storeData;
    // display too many attempts message
    private TooManyAttemptsMsg tooManyAttemptsMsg;

    public OP(AbstractFactory af) {
        ds = af.getDataStore();
        displayBalance = af.getDisplayBalance();
        displayMenu = af.getDisplayMenu();
        incorrectIdMsg = af.getIncorrectIdMsg();
        incorrectLockMsg = af.getIncorrectLockMsg();
        incorrectPinMsg = af.getIncorrectPinMsg();
        incorrectUnlockMsg = af.getIncorrectUnlockMsg();
        makeDeposit = af.getMakeDeposit();
        makeWithdraw = af.getMakeWithdraw();
        noFundsMsg = af.getNoFundsMsg();
        penalty = af.getPenalty();
        promptForPin = af.getPromptForPin();
        storeData = af.getStoreData();
        tooManyAttemptsMsg = af.getTooManyAttemptsMsg();
    }

    // stores data from temporary area in data store
    public void storeData() {
        storeData.storeData(ds);
    }

    // Displays no sufficient funds msg
    public void noFundsMsg() {
        noFundsMsg.noFundsMsg();
    }

    // displays incorrect unlock msg
    public void IncorrectUnlockMsg() {
        incorrectUnlockMsg.IncorrectUnlockMsg();
    }

    // displays incorrect lock msg
    public void IncorrectLockMsg() {
        incorrectLockMsg.incorrectLockMsg();
    }

    // applies penalty (decreases balance by the amount of penalty)
    public void penalty() {
        penalty.penalty();
    }

    // makes withdraw (decreases balance by a value stored in temp_w data store)
    public void makeWithdraw() {
        makeWithdraw.makeWithdraw(ds);
    }

    // prompts to enter pin
    public void promptForPin() {
        promptForPin.promptForPin();
    }

    // displays the current value of the balance
    public void displayBalance() {
        displayBalance.displayBalance(ds);
    }

    // makes deposit (increases balance by a value stored in temp_d in data store)
    public void makeDeposit() {
        makeDeposit.makeDeposit(ds);
    }

    // display a menu with a list of transactions
    public void displayMenu() {
        displayMenu.displayMenu();
    }

    // display too many attempts message
    public void tooManyAttemptsMsg() {
        tooManyAttemptsMsg.tooManyAttemptsMsg();
    }

    // displays incorrect ID message
    public void incorrectIdMsg() {
        incorrectIdMsg.incorrectIdMsg();
    }

    // displays incorrect pin message
    public void incorrectPinMsg() {
        incorrectPinMsg.incorrectPinMsg();
    }
}
