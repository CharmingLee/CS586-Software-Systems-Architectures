package displayBalance

import (
	"cs586_project/datastore"
	"fmt"
)

type DisplayBalance2 struct {
}

func (s *DisplayBalance2) DisplayBalance(ds interface{}) {
	fmt.Printf("Balance: %v\n", ds.(*datastore.DS2).Balance)
}
