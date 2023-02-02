package incorrectUnlockMsg

import "fmt"

type IncorrectUnlockMsg1 struct {
}

func (s *IncorrectUnlockMsg1) IncorrectUnlockMsg() {
	fmt.Println("Incorrect Unlock")
}
