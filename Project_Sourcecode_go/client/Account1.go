package client

import (
	"cs586_project/abstractfactory"
	"cs586_project/datastore"
	"cs586_project/state"
)

type Account1 struct {
	m  *state.MdaEfsm
	ds interface{}
}

func (a1 *Account1) Init(m *state.MdaEfsm, factory abstractfactory.AbstractFactoryApi) {
	a1.m = m
	a1.ds = factory.GetDs()
}

func (a1 *Account1) Open(p int, y int, a int) {
	ds1 := a1.ds.(*datastore.DS1)
	ds1.Temp_p = p
	ds1.Temp_y = y
	ds1.Temp_a = a

	a1.m.Open()
}

func (a1 *Account1) Pin(x int) {
	ds := a1.ds.(*datastore.DS1)
	if x == ds.Pin {
		if ds.Balance > 100 {
			a1.m.CorrectPinAboveMin()
		} else {
			a1.m.CorrectPinBelowMin()
		}
	} else {
		a1.m.IncorrectPin(1)
	}
}

func (a1 *Account1) Deposit(d int) {
	ds := a1.ds.(*datastore.DS1)
	ds.Temp_d = d
	a1.m.Deposit()
	if ds.Balance > 100 {
		a1.m.AboveMinBalance()
	} else {
		a1.m.BelowMinBalance()
	}
}

func (a1 *Account1) Withdraw(w int) {
	ds := a1.ds.(*datastore.DS1)
	ds.Temp_w = w
	a1.m.Withdraw()
	if ds.Balance > 100 {
		a1.m.AboveMinBalance()
	} else {
		a1.m.WithdrawBelowMinBalance()
	}
}

func (a1 *Account1) Balance() {
	a1.m.Balance()
}

func (a1 *Account1) Login(y int) {
	ds := a1.ds.(*datastore.DS1)
	if y == ds.Id {
		a1.m.Login()
	} else {
		a1.m.IncorrectLogin()
	}
}

func (a1 *Account1) Logout() {
	a1.m.Logout()
}

func (a1 *Account1) Lock(x int) {
	ds := a1.ds.(*datastore.DS1)
	if x == ds.Pin {
		a1.m.Lock()
	} else {
		a1.m.IncorrectLock()
	}
}

func (a1 *Account1) Unlock(x int) {
	ds := a1.ds.(*datastore.DS1)
	if x == ds.Pin {
		a1.m.Unlock()
		if ds.Balance > 100 {
			a1.m.AboveMinBalance()
		} else {
			a1.m.BelowMinBalance()
		}
	} else {
		a1.m.IncorrectUnlock()
	}
}
