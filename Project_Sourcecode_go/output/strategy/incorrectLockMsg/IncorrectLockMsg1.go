package incorrectLockMsg

import "fmt"

type IncorrectLockMsg1 struct {
}

func (s *IncorrectLockMsg1) IncorrectLockMsg() {
	fmt.Println("Incorrect Lock")
}
