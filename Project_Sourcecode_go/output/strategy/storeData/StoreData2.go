package storeData

import "cs586_project/datastore"

type StoreData2 struct {
}

func (s *StoreData2) StoreData(ds interface{}) {
	d := ds.(*datastore.DS2)
	d.Id = d.Temp_y
	d.Pin = d.Temp_p
	d.Balance = d.Temp_a
}
