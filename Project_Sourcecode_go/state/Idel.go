package state

type Idel struct {
	State
}

func (s *Idel) Login() {
	s.M.Attempts = 0
	s.M.P.PromptForPin()
	s.M.ChangeState(2)
}

func (s *Idel) IncorrectLogin() {
	s.M.P.IncorrectIdMsg()
	s.M.ChangeState(1)
}

func (s *Idel) GetName() string {
	return "Idel"
}
