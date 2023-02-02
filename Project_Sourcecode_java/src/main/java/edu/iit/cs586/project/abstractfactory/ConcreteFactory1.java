package edu.iit.cs586.project.abstractfactory;

import edu.iit.cs586.project.datastore.DS1;
import edu.iit.cs586.project.datastore.DataStore;
import edu.iit.cs586.project.output.strategy.DisplayBalance.DisplayBalance;
import edu.iit.cs586.project.output.strategy.DisplayBalance.DisplayBalance1;
import edu.iit.cs586.project.output.strategy.DisplayMenu.DisplayMenu;
import edu.iit.cs586.project.output.strategy.DisplayMenu.DisplayMenu1;
import edu.iit.cs586.project.output.strategy.IncorrectIdMsg.IncorrectIdMsg;
import edu.iit.cs586.project.output.strategy.IncorrectIdMsg.IncorrectIdMsg1;
import edu.iit.cs586.project.output.strategy.IncorrectLockMsg.IncorrectLockMsg;
import edu.iit.cs586.project.output.strategy.IncorrectLockMsg.IncorrectLockMsg1;
import edu.iit.cs586.project.output.strategy.IncorrectPinMsg.IncorrectPinMsg;
import edu.iit.cs586.project.output.strategy.IncorrectPinMsg.IncorrectPinMsg1;
import edu.iit.cs586.project.output.strategy.IncorrectUnlockMsg.IncorrectUnlockMsg;
import edu.iit.cs586.project.output.strategy.IncorrectUnlockMsg.IncorrectUnlockMsg1;
import edu.iit.cs586.project.output.strategy.MakeDeposit.MakeDeposit;
import edu.iit.cs586.project.output.strategy.MakeDeposit.MakeDeposit1;
import edu.iit.cs586.project.output.strategy.MakeWithdraw.MakeWithdraw;
import edu.iit.cs586.project.output.strategy.MakeWithdraw.MakeWithdraw1;
import edu.iit.cs586.project.output.strategy.NoFundsMsg.NoFundsMsg;
import edu.iit.cs586.project.output.strategy.Penalty.Penalty;
import edu.iit.cs586.project.output.strategy.Penalty.Penalty1;
import edu.iit.cs586.project.output.strategy.PromptForPin.PromptForPin;
import edu.iit.cs586.project.output.strategy.PromptForPin.PromptForPin1;
import edu.iit.cs586.project.output.strategy.StoreData.StoreData;
import edu.iit.cs586.project.output.strategy.StoreData.StoreData1;
import edu.iit.cs586.project.output.strategy.TooManyAttemptsMsg.TooManyAttemptsMsg;
import edu.iit.cs586.project.output.strategy.TooManyAttemptsMsg.TooManyAttemptsMsg1;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/5/1 21:48
 */
public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public DataStore getDataStore() {
        if (ds == null) {
            ds = new DS1();
        }

        return ds;
    }

    @Override
    public DisplayBalance getDisplayBalance() {
        if (displayBalance == null) {
            displayBalance = new DisplayBalance1();
        }
        return displayBalance;
    }

    @Override
    public DisplayMenu getDisplayMenu() {
        if (displayMenu == null) {
            displayMenu = new DisplayMenu1();
        }
        return displayMenu;
    }

    @Override
    public IncorrectIdMsg getIncorrectIdMsg() {
        if (incorrectIdMsg == null) {
            incorrectIdMsg = new IncorrectIdMsg1();
        }
        return incorrectIdMsg;
    }

    @Override
    public IncorrectLockMsg getIncorrectLockMsg() {
        if (incorrectLockMsg == null) {
            incorrectLockMsg = new IncorrectLockMsg1();
        }
        return incorrectLockMsg;
    }

    @Override
    public IncorrectPinMsg getIncorrectPinMsg() {
        if (incorrectPinMsg == null) {
            incorrectPinMsg = new IncorrectPinMsg1();
        }
        return incorrectPinMsg;
    }

    @Override
    public IncorrectUnlockMsg getIncorrectUnlockMsg() {
        if (incorrectUnlockMsg == null) {
            incorrectUnlockMsg = new IncorrectUnlockMsg1();
        }
        return incorrectUnlockMsg;
    }

    @Override
    public MakeDeposit getMakeDeposit() {
        if (makeDeposit == null) {
            makeDeposit = new MakeDeposit1();
        }
        return makeDeposit;
    }

    @Override
    public MakeWithdraw getMakeWithdraw() {
        if (makeWithdraw == null) {
            makeWithdraw = new MakeWithdraw1();
        }
        return makeWithdraw;
    }

    @Override
    public NoFundsMsg getNoFundsMsg() {
        return null;
    }

    @Override
    public Penalty getPenalty() {
        if (penalty == null) {
            penalty = new Penalty1();
        }
        return penalty;
    }

    @Override
    public PromptForPin getPromptForPin() {
        if (promptForPin == null) {
            promptForPin = new PromptForPin1();
        }
        return promptForPin;
    }

    @Override
    public StoreData getStoreData() {
        if (storeData == null) {
            storeData = new StoreData1();
        }
        return storeData;
    }

    @Override
    public TooManyAttemptsMsg getTooManyAttemptsMsg() {
        if (tooManyAttemptsMsg == null) {
            tooManyAttemptsMsg = new TooManyAttemptsMsg1();
        }
        return tooManyAttemptsMsg;
    }

}
