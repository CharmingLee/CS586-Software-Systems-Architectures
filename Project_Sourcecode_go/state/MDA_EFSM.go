package state

import (
	"cs586_project/output"
	"fmt"
)

type MdaEfsm struct {
	Attempts     int
	P            *output.OP
	StateQueue   []StateApi
	CurrentState StateApi
}

func (m *MdaEfsm) Init(p *output.OP) {
	m.P = p
	s := new(Start)
	s.M = m
	i := new(Idel)
	i.M = m
	c := new(CheckPin)
	c.M = m
	r := new(Ready)
	r.M = m
	s1 := new(S1)
	s1.M = m
	o := new(Overdrawn)
	o.M = m
	l := new(Locked)
	l.M = m
	su := new(Suspended)
	su.M = m
	m.StateQueue = []StateApi{
		s,
		i,
		c,
		r,
		s1,
		o,
		l,
		su,
	}

	m.CurrentState = m.StateQueue[0]
}

func (m *MdaEfsm) Open() {
	m.CurrentState.Open()
}

func (m *MdaEfsm) Login() {
	m.CurrentState.Login()
}

func (m *MdaEfsm) IncorrectLogin() {
	m.CurrentState.IncorrectLogin()
}

func (m *MdaEfsm) IncorrectPin(max int) {
	m.CurrentState.IncorrectPin(max)
}

func (m *MdaEfsm) CorrectPinBelowMin() {
	m.CurrentState.CorrectPinBelowMin()
}

func (m *MdaEfsm) CorrectPinAboveMin() {
	m.CurrentState.CorrectPinAboveMin()
}

func (m *MdaEfsm) Deposit() {
	m.CurrentState.Deposit()
}

func (m *MdaEfsm) AboveMinBalance() {
	m.CurrentState.AboveMinBalance()
}

func (m *MdaEfsm) BelowMinBalance() {
	m.CurrentState.BelowMinBalance()
}

func (m *MdaEfsm) Logout() {
	m.CurrentState.Logout()
}

func (m *MdaEfsm) Balance() {
	m.CurrentState.Balance()
}

func (m *MdaEfsm) Withdraw() {
	m.CurrentState.Withdraw()
}

func (m *MdaEfsm) WithdrawBelowMinBalance() {
	m.CurrentState.WithdrawBelowMinBalance()
}

func (m *MdaEfsm) Lock() {
	m.CurrentState.Lock()
}

func (m *MdaEfsm) IncorrectLock() {
	m.CurrentState.IncorrectLock()
}

func (m *MdaEfsm) Unlock() {
	m.CurrentState.Unlock()
}

func (m *MdaEfsm) IncorrectUnlock() {
	m.CurrentState.IncorrectUnlock()
}

func (m *MdaEfsm) Suspend() {
	m.CurrentState.Suspend()
}

func (m *MdaEfsm) Activate() {
	m.CurrentState.Activate()
}

func (m *MdaEfsm) Close() {
	m.CurrentState.Close()
}

func (m *MdaEfsm) NoFunds() {
	m.CurrentState.NoFunds()
}

func (m *MdaEfsm) ChangeState(index int) {
	m.CurrentState = m.StateQueue[index]
	fmt.Println("change state :" + m.CurrentState.GetName())
}
