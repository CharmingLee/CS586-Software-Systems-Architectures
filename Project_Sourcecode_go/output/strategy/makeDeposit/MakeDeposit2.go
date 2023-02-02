package makeDeposit

import (
	"cs586_project/datastore"
	"fmt"
)

type MakeDeposit2 struct {
}

func (s *MakeDeposit2) MakeDeposit(ds interface{}) {
	ds2 := ds.(*datastore.DS2)
	d := ds2.Temp_d
	b := ds2.Balance
	ds2.Balance = d + b
	fmt.Printf("Make Deposit: %v\n", d)
}
