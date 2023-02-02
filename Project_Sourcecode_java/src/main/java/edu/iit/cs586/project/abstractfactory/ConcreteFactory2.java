package edu.iit.cs586.project.abstractfactory;

import edu.iit.cs586.project.datastore.DS2;
import edu.iit.cs586.project.datastore.DataStore;
import edu.iit.cs586.project.output.strategy.DisplayBalance.DisplayBalance;
import edu.iit.cs586.project.output.strategy.DisplayBalance.DisplayBalance2;
import edu.iit.cs586.project.output.strategy.DisplayMenu.DisplayMenu;
import edu.iit.cs586.project.output.strategy.DisplayMenu.DisplayMenu2;
import edu.iit.cs586.project.output.strategy.IncorrectIdMsg.IncorrectIdMsg;
import edu.iit.cs586.project.output.strategy.IncorrectIdMsg.IncorrectIdMsg2;
import edu.iit.cs586.project.output.strategy.IncorrectLockMsg.IncorrectLockMsg;
import edu.iit.cs586.project.output.strategy.IncorrectPinMsg.IncorrectPinMsg;
import edu.iit.cs586.project.output.strategy.IncorrectPinMsg.IncorrectPinMsg2;
import edu.iit.cs586.project.output.strategy.IncorrectUnlockMsg.IncorrectUnlockMsg;
import edu.iit.cs586.project.output.strategy.MakeDeposit.MakeDeposit;
import edu.iit.cs586.project.output.strategy.MakeDeposit.MakeDeposit2;
import edu.iit.cs586.project.output.strategy.MakeWithdraw.MakeWithdraw;
import edu.iit.cs586.project.output.strategy.MakeWithdraw.MakeWithdraw2;
import edu.iit.cs586.project.output.strategy.NoFundsMsg.NoFundsMsg;
import edu.iit.cs586.project.output.strategy.NoFundsMsg.NoFundsMsg2;
import edu.iit.cs586.project.output.strategy.Penalty.Penalty;
import edu.iit.cs586.project.output.strategy.PromptForPin.PromptForPin;
import edu.iit.cs586.project.output.strategy.PromptForPin.PromptForPin2;
import edu.iit.cs586.project.output.strategy.StoreData.StoreData;
import edu.iit.cs586.project.output.strategy.StoreData.StoreData2;
import edu.iit.cs586.project.output.strategy.TooManyAttemptsMsg.TooManyAttemptsMsg;
import edu.iit.cs586.project.output.strategy.TooManyAttemptsMsg.TooManyAttemptsMsg2;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/5/1 21:54
 */
public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public DataStore getDataStore() {
        if (ds == null) {
            ds = new DS2();
        }

        return ds;
    }

    @Override
    public DisplayBalance getDisplayBalance() {
        if (displayBalance == null) {
            displayBalance = new DisplayBalance2();
        }
        return displayBalance;
    }

    @Override
    public DisplayMenu getDisplayMenu() {
        if (displayMenu == null) {
            displayMenu = new DisplayMenu2();
        }
        return displayMenu;
    }

    @Override
    public IncorrectIdMsg getIncorrectIdMsg() {
        if (incorrectIdMsg == null) {
            incorrectIdMsg = new IncorrectIdMsg2();
        }
        return incorrectIdMsg;
    }

    @Override
    public IncorrectLockMsg getIncorrectLockMsg() {
        return null;
    }

    @Override
    public IncorrectPinMsg getIncorrectPinMsg() {
        if (incorrectPinMsg == null) {
            incorrectPinMsg = new IncorrectPinMsg2();
        }
        return incorrectPinMsg;
    }

    @Override
    public IncorrectUnlockMsg getIncorrectUnlockMsg() {
        return null;
    }

    @Override
    public MakeDeposit getMakeDeposit() {
        if (makeDeposit == null) {
            makeDeposit = new MakeDeposit2();
        }
        return makeDeposit;
    }

    @Override
    public MakeWithdraw getMakeWithdraw() {
        if (makeWithdraw == null) {
            makeWithdraw = new MakeWithdraw2();
        }
        return makeWithdraw;
    }

    @Override
    public NoFundsMsg getNoFundsMsg() {
        if (noFundsMsg == null) {
            noFundsMsg = new NoFundsMsg2();
        }
        return noFundsMsg;
    }

    @Override
    public Penalty getPenalty() {
        return null;
    }

    @Override
    public PromptForPin getPromptForPin() {
        if (promptForPin == null) {
            promptForPin = new PromptForPin2();
        }
        return promptForPin;
    }

    @Override
    public StoreData getStoreData() {
        if (storeData == null) {
            storeData = new StoreData2();
        }
        return storeData;
    }

    @Override
    public TooManyAttemptsMsg getTooManyAttemptsMsg() {
        if (tooManyAttemptsMsg == null) {
            tooManyAttemptsMsg = new TooManyAttemptsMsg2();
        }
        return tooManyAttemptsMsg;
    }

}
