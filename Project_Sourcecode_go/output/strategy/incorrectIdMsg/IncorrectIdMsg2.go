package incorrectIdMsg

import "fmt"

type IncorrectIdMsg2 struct {
}

func (s *IncorrectIdMsg2) IncorrectIdMsg() {
	fmt.Println("Incorrect Id")
}
