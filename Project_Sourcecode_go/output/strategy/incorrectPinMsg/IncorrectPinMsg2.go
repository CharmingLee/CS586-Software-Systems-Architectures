package incorrectPinMsg

import "fmt"

type IncorrectPinMsg2 struct {
}

func (s *IncorrectPinMsg2) IncorrectPinMsg() {
	fmt.Println("Incorrect Pin")
}
