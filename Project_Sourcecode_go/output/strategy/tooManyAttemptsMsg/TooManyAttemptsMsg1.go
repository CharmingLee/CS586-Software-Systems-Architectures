package tooManyAttemptsMsg

import "fmt"

type TooManyAttemptsMsg1 struct {
}

func (s *TooManyAttemptsMsg1) TooManyAttemptsMsg() {
	fmt.Println("Too Many Attempts")
}
