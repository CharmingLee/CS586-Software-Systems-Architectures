package output

import (
	"cs586_project/abstractfactory"
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

type OP struct {
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

func (p *OP) Init(factory abstractfactory.AbstractFactoryApi) {
	p.Ds = factory.GetDs()
	p.displayBalance = factory.GetDisplayBalance()
	p.displayMenu = factory.GetDisplayMenu()
	p.incorrectIdMsg = factory.GetIncorrectIdMsg()
	p.incorrectLockMsg = factory.GetIncorrectLockMsg()
	p.incorrectPinMsg = factory.GetIncorrectPinMsg()
	p.incorrectUnlockMsg = factory.GetIncorrectUnlockMsg()
	p.makeDeposit = factory.GetMakeDeposit()
	p.makeWithdraw = factory.GetMakeWithdraw()
	p.noFundsMsg = factory.GetNoFundsMsg()
	p.penalty = factory.GetPenalty()
	p.promptForPin = factory.GetPromptForPin()
	p.storeData = factory.GetStoreData()
	p.tooManyAttemptsMsg = factory.GetTooManyAttemptsMsg()
}

func (p *OP) StoreData() {
	p.storeData.StoreData(p.Ds)
}

func (p *OP) IncorrectPinMsg() {
	p.incorrectPinMsg.IncorrectPinMsg()
}

func (p *OP) IncorrectIdMsg() {
	p.incorrectIdMsg.IncorrectIdMsg()
}
func (p *OP) TooManyAttemptsMsg() {
	p.tooManyAttemptsMsg.TooManyAttemptsMsg()
}

func (p *OP) DisplayMenu() {
	p.displayMenu.DisplayMenu()
}

func (p *OP) MakeDeposit() {
	p.makeDeposit.MakeDeposit(p.Ds)
}

func (p *OP) DisplayBalance() {
	p.displayBalance.DisplayBalance(p.Ds)
}

func (p *OP) PromptForPin() {
	p.promptForPin.PromptForPin()
}

func (p *OP) MakeWithdraw() {
	p.makeWithdraw.MakeWithdraw(p.Ds)
}

func (p *OP) Penalty() {
	p.penalty.Penalty()
}

func (p *OP) IncorrectLockMsg() {
	p.incorrectLockMsg.IncorrectLockMsg()
}

func (p *OP) IncorrectUnlockMsg() {
	p.incorrectUnlockMsg.IncorrectUnlockMsg()
}

func (p *OP) NoFundsMsg() {
	p.noFundsMsg.NoFundsMsg()
}
