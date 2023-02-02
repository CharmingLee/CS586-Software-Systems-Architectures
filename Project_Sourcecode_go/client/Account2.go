package client

import (
	"cs586_project/abstractfactory"
	"cs586_project/datastore"
	"cs586_project/state"
)

type Account2 struct {
	m  *state.MdaEfsm
	ds interface{}
}

func (a2 *Account2) Init(m *state.MdaEfsm, factory abstractfactory.AbstractFactoryApi) {
	a2.m = m
	a2.ds = factory.GetDs()
}

func (a2 *Account2) OPEN(p int, y int, a float64) {
	ds1 := a2.ds.(*datastore.DS2)
	ds1.Temp_p = p
	ds1.Temp_y = y
	ds1.Temp_a = a

	a2.m.Open()
}

func (a2 *Account2) PIN(x int) {
	ds := a2.ds.(*datastore.DS2)
	if x == ds.Pin {
		if ds.Balance > 100 {
			a2.m.CorrectPinAboveMin()
		} else {
			a2.m.CorrectPinBelowMin()
		}
	} else {
		a2.m.IncorrectPin(1)
	}
}

func (a2 *Account2) DEPOSIT(d float64) {
	ds := a2.ds.(*datastore.DS2)
	ds.Temp_d = d
	a2.m.Deposit()
}

func (a2 *Account2) WITHDRAW(w float64) {
	ds := a2.ds.(*datastore.DS2)
	ds.Temp_w = w
	if ds.Balance > 0 {
		a2.m.Withdraw()
		a2.m.AboveMinBalance()
	} else {
		a2.m.NoFunds()
	}
}

func (a2 *Account2) BALANCE() {
	a2.m.Balance()
}

func (a2 *Account2) LOGIN(y int) {
	ds := a2.ds.(*datastore.DS2)
	if y == ds.Id {
		a2.m.Login()
	} else {
		a2.m.IncorrectLogin()
	}
}

func (a2 *Account2) LOGOUT() {
	a2.m.Logout()
}

func (a2 *Account2) Suspend() {
	a2.m.Suspend()
}

func (a2 *Account2) Activate() {
	a2.m.Activate()
}

func (a2 *Account2) Close() {
	a2.m.Close()
}
