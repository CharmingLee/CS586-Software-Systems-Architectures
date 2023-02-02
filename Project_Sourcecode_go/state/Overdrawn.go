package state

type Overdrawn struct {
	State
}

func (s *Overdrawn) Logout() {
	s.M.ChangeState(1)
}

func (s *Overdrawn) Deposit() {
	s.M.P.MakeDeposit()
	s.M.ChangeState(4)
}
func (s *Overdrawn) IncorrectLock() {
	s.M.P.IncorrectLockMsg()
}
func (s *Overdrawn) Lock() {
	s.M.ChangeState(6)
}
func (s *Overdrawn) Withdraw() {
	s.M.P.MakeWithdraw()
}
func (s *Overdrawn) Balance() {
	s.M.P.DisplayBalance()
}

func (s *Overdrawn) GetName() string {
	return "Overdrawn"
}
