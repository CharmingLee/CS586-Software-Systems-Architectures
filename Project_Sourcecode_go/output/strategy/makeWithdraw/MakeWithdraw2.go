package makeWithdraw

import (
	"cs586_project/datastore"
	"fmt"
)

type MakeWithdraw2 struct {
}

func (s *MakeWithdraw2) MakeWithdraw(ds interface{}) {
	ds2 := ds.(*datastore.DS2)
	b := ds2.Balance
	w := ds2.Temp_w
	ds2.Balance = b - w
	fmt.Printf("Make Withdraw: %v\n", w)
}
