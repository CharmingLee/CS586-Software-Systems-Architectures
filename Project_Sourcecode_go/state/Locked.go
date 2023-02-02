package state

type Locked struct {
	State
}

func (s *Locked) Unlock() {
	s.M.ChangeState(4)
}

func (s *Locked) IncorrectUnlock() {
	s.M.P.IncorrectUnlockMsg()
}

func (s *Locked) GetName() string {
	return "Locked"
}
