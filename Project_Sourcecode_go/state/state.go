package state

import (
	"fmt"
)

type State struct {
	M *MdaEfsm
}

type StateApi interface {
	Login()
	IncorrectLogin()
	Open()
	IncorrectPin(max int)
	CorrectPinAboveMin()
	Logout()
	NoFunds()
	Suspend()
	Deposit()
	IncorrectLock()
	Lock()
	Withdraw()
	Balance()
	AboveMinBalance()
	BelowMinBalance()
	WithdrawBelowMinBalance()
	Unlock()
	IncorrectUnlock()
	CorrectPinBelowMin()
	Close()
	Activate()
	GetName() string
}

func (s *State) Open() {
	fmt.Println("current state not support this function")
}
func (s *State) Login() {
	fmt.Println("current state not support this function")
}
func (s *State) IncorrectLogin() {
	fmt.Println("current state not support this function")
}
func (s *State) IncorrectPin(max int) {
	fmt.Println("current state not support this function")
}
func (s *State) CorrectPinAboveMin() {
	fmt.Println("current state not support this function")
}
func (s *State) Logout() {
	fmt.Println("current state not support this function")
}
func (s *State) NoFunds() {
	fmt.Println("current state not support this function")
}
func (s *State) Suspend() {
	fmt.Println("current state not support this function")
}
func (s *State) Deposit() {
	fmt.Println("current state not support this function")
}
func (s *State) IncorrectLock() {
	fmt.Println("current state not support this function")
}
func (s *State) Lock() {
	fmt.Println("current state not support this function")
}
func (s *State) Withdraw() {
	fmt.Println("current state not support this function")
}
func (s *State) Balance() {
	fmt.Println("current state not support this function")
}
func (s *State) AboveMinBalance() {
	fmt.Println("current state not support this function")
}
func (s *State) BelowMinBalance() {
	fmt.Println("current state not support this function")
}
func (s *State) WithdrawBelowMinBalance() {
	fmt.Println("current state not support this function")
}
func (s *State) Unlock() {
	fmt.Println("current state not support this function")
}
func (s *State) IncorrectUnlock() {
	fmt.Println("current state not support this function")
}
func (s *State) CorrectPinBelowMin() {
	fmt.Println("current state not support this function")
}
func (s *State) Close() {
	fmt.Println("current state not support this function")
}
func (s *State) Activate() {
	fmt.Println("current state not support this function")
}

func (s *State) GetName() string {
	return "state"
}
