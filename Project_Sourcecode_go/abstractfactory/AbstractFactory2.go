package abstractfactory

import (
	"cs586_project/datastore"
	"cs586_project/output/strategy/displayBalance"
	"cs586_project/output/strategy/displayMenu"
	"cs586_project/output/strategy/incorrectIdMsg"
	"cs586_project/output/strategy/incorrectLockMsg"
	"cs586_project/output/strategy/incorrectPinMsg"
	"cs586_project/output/strategy/incorrectUnlockMsg"
	"cs586_project/output/strategy/makeDeposit"
	"cs586_project/output/strategy/makeWithdraw"
	"cs586_project/output/strategy/noFundsMsg"
	"cs586_project/output/strategy/penalty"
	"cs586_project/output/strategy/promptForPin"
	"cs586_project/output/strategy/storeData"
	"cs586_project/output/strategy/tooManyAttemptsMsg"
)

type AbstractFactory2 struct {
	AbstractFactory
}

func (af *AbstractFactory2) GetDs() interface{} {
	if af.Ds == nil {
		af.Ds = new(datastore.DS2)
	}
	return af.Ds
}

func (af *AbstractFactory2) GetDisplayMenu() displayMenu.DisplayMenu {
	if af.displayMenu == nil {
		af.displayMenu = new(displayMenu.DisplayMenu2)
	}

	return af.displayMenu
}

func (af *AbstractFactory2) GetIncorrectIdMsg() incorrectIdMsg.IncorrectIdMsg {
	if af.incorrectIdMsg == nil {
		af.incorrectIdMsg = new(incorrectIdMsg.IncorrectIdMsg2)
	}

	return af.incorrectIdMsg
}

func (af *AbstractFactory2) GetIncorrectLockMsg() incorrectLockMsg.IncorrectLockMsg {
	return nil
}

func (af *AbstractFactory2) GetIncorrectPinMsg() incorrectPinMsg.IncorrectPinMsg {
	if af.incorrectPinMsg == nil {
		af.incorrectPinMsg = new(incorrectPinMsg.IncorrectPinMsg2)
	}
	return af.incorrectPinMsg
}

func (af *AbstractFactory2) GetIncorrectUnlockMsg() incorrectUnlockMsg.IncorrectUnlockMsg {
	return nil
}

func (af *AbstractFactory2) GetMakeDeposit() makeDeposit.MakeDeposit {
	if af.makeDeposit == nil {
		af.makeDeposit = new(makeDeposit.MakeDeposit2)
	}
	return af.makeDeposit
}

func (af *AbstractFactory2) GetMakeWithdraw() makeWithdraw.MakeWithdraw {
	if af.makeWithdraw == nil {
		af.makeWithdraw = new(makeWithdraw.MakeWithdraw2)
	}

	return af.makeWithdraw
}

func (af *AbstractFactory2) GetNoFundsMsg() noFundsMsg.NoFundsMsg {
	if af.noFundsMsg == nil {
		af.noFundsMsg = new(noFundsMsg.NoFundsMsg2)
	}
	return af.noFundsMsg
}

func (af *AbstractFactory2) GetPenalty() penalty.Penalty {

	return nil
}

func (af *AbstractFactory2) GetPromptForPin() promptForPin.PromptForPin {
	if af.promptForPin == nil {
		af.promptForPin = new(promptForPin.PromptForPin2)
	}

	return af.promptForPin
}

func (af *AbstractFactory2) GetStoreData() storeData.StoreData {
	if af.storeData == nil {
		af.storeData = new(storeData.StoreData2)
	}
	return af.storeData
}

func (af *AbstractFactory2) GetTooManyAttemptsMsg() tooManyAttemptsMsg.TooManyAttemptsMsg {
	if af.tooManyAttemptsMsg == nil {
		af.tooManyAttemptsMsg = new(tooManyAttemptsMsg.TooManyAttemptsMsg2)
	}
	return af.tooManyAttemptsMsg
}

func (af *AbstractFactory2) GetDisplayBalance() displayBalance.DisplayBalance {
	if af.displayBalance == nil {
		af.displayBalance = new(displayBalance.DisplayBalance2)
	}
	return af.displayBalance
}
