package tooManyAttemptsMsg

import "fmt"

type TooManyAttemptsMsg2 struct {
}

func (s *TooManyAttemptsMsg2) TooManyAttemptsMsg() {
	fmt.Println("Too Many Attempts")
}
