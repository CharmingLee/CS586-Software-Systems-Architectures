package state

type Ready struct {
	State
}

func (s *Ready) Logout() {
	s.M.ChangeState(1)
}
func (s *Ready) NoFunds() {
	s.M.P.NoFundsMsg()
}
func (s *Ready) Suspend() {
	s.M.ChangeState(7)
}
func (s *Ready) Deposit() {
	s.M.P.MakeDeposit()
}
func (s *Ready) IncorrectLock() {
	s.M.P.IncorrectLockMsg()
}
func (s *Ready) Lock() {
	s.M.ChangeState(6)
}
func (s *Ready) Withdraw() {
	s.M.P.MakeWithdraw()
	s.M.ChangeState(4)
}
func (s *Ready) Balance() {
	s.M.P.DisplayBalance()
}

func (s *Ready) GetName() string {
	return "Ready"
}
