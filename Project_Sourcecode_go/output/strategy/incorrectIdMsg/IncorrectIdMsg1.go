package incorrectIdMsg

import "fmt"

type IncorrectIdMsg1 struct {
}

func (s *IncorrectIdMsg1) IncorrectIdMsg() {
	fmt.Println("Incorrect Id")
}
