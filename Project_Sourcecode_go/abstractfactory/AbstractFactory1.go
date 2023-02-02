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

type AbstractFactory1 struct {
	AbstractFactory
}

func (af *AbstractFactory1) GetDs() interface{} {
	if af.Ds == nil {
		af.Ds = new(datastore.DS1)
	}
	return af.Ds
}

func (af *AbstractFactory1) GetDisplayMenu() displayMenu.DisplayMenu {
	if af.displayMenu == nil {
		af.displayMenu = new(displayMenu.DisplayMenu1)
	}

	return af.displayMenu
}

func (af *AbstractFactory1) GetIncorrectIdMsg() incorrectIdMsg.IncorrectIdMsg {
	if af.incorrectIdMsg == nil {
		af.incorrectIdMsg = new(incorrectIdMsg.IncorrectIdMsg1)
	}

	return af.incorrectIdMsg
}

func (af *AbstractFactory1) GetIncorrectLockMsg() incorrectLockMsg.IncorrectLockMsg {
	if af.incorrectLockMsg == nil {
		af.incorrectLockMsg = new(incorrectLockMsg.IncorrectLockMsg1)
	}
	return af.incorrectLockMsg
}

func (af *AbstractFactory1) GetIncorrectPinMsg() incorrectPinMsg.IncorrectPinMsg {
	if af.incorrectPinMsg == nil {
		af.incorrectPinMsg = new(incorrectPinMsg.IncorrectPinMsg1)
	}
	return af.incorrectPinMsg
}

func (af *AbstractFactory1) GetIncorrectUnlockMsg() incorrectUnlockMsg.IncorrectUnlockMsg {
	if af.incorrectUnlockMsg == nil {
		af.incorrectUnlockMsg = new(incorrectUnlockMsg.IncorrectUnlockMsg1)
	}
	return af.incorrectUnlockMsg
}

func (af *AbstractFactory1) GetMakeDeposit() makeDeposit.MakeDeposit {
	if af.makeDeposit == nil {
		af.makeDeposit = new(makeDeposit.MakeDeposit1)
	}
	return af.makeDeposit
}

func (af *AbstractFactory1) GetMakeWithdraw() makeWithdraw.MakeWithdraw {
	if af.makeWithdraw == nil {
		af.makeWithdraw = new(makeWithdraw.MakeWithdraw1)
	}

	return af.makeWithdraw
}

func (af *AbstractFactory1) GetNoFundsMsg() noFundsMsg.NoFundsMsg {
	return nil
}

func (af *AbstractFactory1) GetPenalty() penalty.Penalty {
	if af.penalty == nil {
		af.penalty = new(penalty.Penalty1)
	}

	return af.penalty
}

func (af *AbstractFactory1) GetPromptForPin() promptForPin.PromptForPin {
	if af.promptForPin == nil {
		af.promptForPin = new(promptForPin.PromptForPin1)
	}

	return af.promptForPin
}

func (af *AbstractFactory1) GetStoreData() storeData.StoreData {
	if af.storeData == nil {
		af.storeData = new(storeData.StoreData1)
	}
	return af.storeData
}

func (af *AbstractFactory1) GetTooManyAttemptsMsg() tooManyAttemptsMsg.TooManyAttemptsMsg {
	if af.tooManyAttemptsMsg == nil {
		af.tooManyAttemptsMsg = new(tooManyAttemptsMsg.TooManyAttemptsMsg1)
	}
	return af.tooManyAttemptsMsg
}

func (af *AbstractFactory1) GetDisplayBalance() displayBalance.DisplayBalance {
	if af.displayBalance == nil {
		af.displayBalance = new(displayBalance.DisplayBalance1)
	}
	return af.displayBalance
}
