package makeWithdraw

import (
	"cs586_project/datastore"
	"fmt"
)

type MakeWithdraw1 struct {
}

func (s *MakeWithdraw1) MakeWithdraw(ds interface{}) {
	ds1 := ds.(*datastore.DS1)
	b := ds1.Balance
	w := ds1.Temp_w
	if b-w <= 100 {
		ds1.Balance = b - w - 15
	} else {
		ds1.Balance = b - w
	}
	fmt.Printf("Make Withdraw: %v\n", w)
}
