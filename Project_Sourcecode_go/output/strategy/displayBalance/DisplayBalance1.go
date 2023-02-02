package displayBalance

import (
	"cs586_project/datastore"
	"fmt"
)

type DisplayBalance1 struct {
}

func (s *DisplayBalance1) DisplayBalance(ds interface{}) {
	fmt.Printf("Balance: %v\n", ds.(*datastore.DS1).Balance)
}
