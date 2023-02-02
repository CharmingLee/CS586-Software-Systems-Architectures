package storeData

import "cs586_project/datastore"

type StoreData1 struct {
}

func (s *StoreData1) StoreData(ds interface{}) {
	d := ds.(*datastore.DS1)
	d.Id = d.Temp_y
	d.Pin = d.Temp_p
	d.Balance = d.Temp_a
}
