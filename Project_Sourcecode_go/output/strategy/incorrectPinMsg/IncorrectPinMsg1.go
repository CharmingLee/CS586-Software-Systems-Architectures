package incorrectPinMsg

import "fmt"

type IncorrectPinMsg1 struct {
}

func (s *IncorrectPinMsg1) IncorrectPinMsg() {
	fmt.Println("Incorrect Pin")
}
