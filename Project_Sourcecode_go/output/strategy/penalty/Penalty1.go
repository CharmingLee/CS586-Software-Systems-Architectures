package penalty

import "fmt"

type Penalty1 struct {
}

func (s *Penalty1) Penalty() {
	fmt.Println("Penalty")
}
