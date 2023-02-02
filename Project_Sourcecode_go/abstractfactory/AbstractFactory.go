package abstractfactory

import (
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

type AbstractFactory struct {
	Ds                 interface{}
	displayBalance     displayBalance.DisplayBalance
	displayMenu        displayMenu.DisplayMenu
	incorrectIdMsg     incorrectIdMsg.IncorrectIdMsg
	incorrectLockMsg   incorrectLockMsg.IncorrectLockMsg
	incorrectPinMsg    incorrectPinMsg.IncorrectPinMsg
	incorrectUnlockMsg incorrectUnlockMsg.IncorrectUnlockMsg
	makeDeposit        makeDeposit.MakeDeposit
	makeWithdraw       makeWithdraw.MakeWithdraw
	noFundsMsg         noFundsMsg.NoFundsMsg
	penalty            penalty.Penalty
	promptForPin       promptForPin.PromptForPin
	storeData          storeData.StoreData
	tooManyAttemptsMsg tooManyAttemptsMsg.TooManyAttemptsMsg
}

type AbstractFactoryApi interface {
	GetDs() interface{}
	GetDisplayMenu() displayMenu.DisplayMenu
	GetIncorrectIdMsg() incorrectIdMsg.IncorrectIdMsg
	GetIncorrectLockMsg() incorrectLockMsg.IncorrectLockMsg
	GetIncorrectPinMsg() incorrectPinMsg.IncorrectPinMsg
	GetIncorrectUnlockMsg() incorrectUnlockMsg.IncorrectUnlockMsg
	GetMakeDeposit() makeDeposit.MakeDeposit
	GetMakeWithdraw() makeWithdraw.MakeWithdraw
	GetNoFundsMsg() noFundsMsg.NoFundsMsg
	GetPenalty() penalty.Penalty
	GetPromptForPin() promptForPin.PromptForPin
	GetStoreData() storeData.StoreData
	GetTooManyAttemptsMsg() tooManyAttemptsMsg.TooManyAttemptsMsg
	GetDisplayBalance() displayBalance.DisplayBalance
}

func (af *AbstractFactory) GetDs() interface{} {
	return nil
}

func (af *AbstractFactory) GetDisplayMenu() displayMenu.DisplayMenu {
	return nil
}

func (af *AbstractFactory) GetIncorrectIdMsg() incorrectIdMsg.IncorrectIdMsg {
	return nil
}

func (af *AbstractFactory) GetIncorrectLockMsg() incorrectLockMsg.IncorrectLockMsg {
	return nil
}

func (af *AbstractFactory) GetIncorrectPinMsg() incorrectPinMsg.IncorrectPinMsg {
	return nil
}

func (af *AbstractFactory) GetIncorrectUnlockMsg() incorrectUnlockMsg.IncorrectUnlockMsg {
	return nil
}

func (af *AbstractFactory) GetMakeDeposit() makeDeposit.MakeDeposit {
	return nil
}

func (af *AbstractFactory) GetMakeWithdraw() makeWithdraw.MakeWithdraw {
	return nil
}

func (af *AbstractFactory) GetNoFundsMsg() noFundsMsg.NoFundsMsg {
	return nil
}

func (af *AbstractFactory) GetPenalty() penalty.Penalty {
	return nil
}

func (af *AbstractFactory) GetPromptForPin() promptForPin.PromptForPin {
	return nil
}

func (af *AbstractFactory) GetStoreData() storeData.StoreData {
	return nil
}

func (af *AbstractFactory) GetTooManyAttemptsMsg() tooManyAttemptsMsg.TooManyAttemptsMsg {
	return nil
}

func (af *AbstractFactory) GetDisplayBalance() displayBalance.DisplayBalance {
	return nil
}
