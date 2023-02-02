package makeDeposit

import (
	"cs586_project/datastore"
	"fmt"
)

type MakeDeposit1 struct {
}

func (s *MakeDeposit1) MakeDeposit(ds interface{}) {
	ds1 := ds.(*datastore.DS1)
	d := ds1.Temp_d
	b := ds1.Balance
	ds1.Balance = d + b
	fmt.Printf("Make Deposit: %v\n", d)
}
