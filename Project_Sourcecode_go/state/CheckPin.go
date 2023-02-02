package state

type CheckPin struct {
	State
}

func (s *CheckPin) IncorrectPin(max int) {
	if s.M.Attempts < max {
		s.M.Attempts++
		s.M.P.IncorrectPinMsg()
	} else {
		s.M.P.TooManyAttemptsMsg()
		s.M.ChangeState(1)
	}
}

func (s *CheckPin) CorrectPinAboveMin() {
	s.M.P.DisplayMenu()
	s.M.ChangeState(3)
}

func (s *CheckPin) CorrectPinBelowMin() {
	s.M.P.DisplayMenu()
	s.M.ChangeState(5)
}

func (s *CheckPin) Logout() {
	s.M.ChangeState(1)
}

func (s *CheckPin) GetName() string {
	return "CheckPin"
}
