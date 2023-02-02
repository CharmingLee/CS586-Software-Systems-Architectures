package state

type Start struct {
	State
}

func (s *Start) Open() {
	s.M.P.StoreData()
	s.M.ChangeState(1)
}

func (s *Start) GetName() string {
	return "Start"
}
