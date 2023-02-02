package state

type Suspended struct {
	State
}

func (s *Suspended) Close() {
	s.M.ChangeState(8)
}

func (s *Suspended) Balance() {
	s.M.P.DisplayBalance()
}

func (s *Suspended) Activate() {
	s.M.ChangeState(3)
}
func (s *Suspended) GetName() string {
	return "Suspended"
}
