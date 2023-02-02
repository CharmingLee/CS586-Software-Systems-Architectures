package state

type S1 struct {
	State
}

func (s *S1) AboveMinBalance() {
	s.M.ChangeState(3)
}

func (s *S1) BelowMinBalance() {
	s.M.ChangeState(5)
}

func (s *S1) WithdrawBelowMinBalance() {
	s.M.P.Penalty()
	s.M.ChangeState(5)
}

func (s *S1) GetName() string {
	return "S1"
}
