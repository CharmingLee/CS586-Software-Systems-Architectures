package main

import (
	"cs586_project/abstractfactory"
	"cs586_project/client"
	"cs586_project/output"
	"cs586_project/state"
	"fmt"
	"strings"
)

func main() {
	fmt.Println("Spring 2022 CS586 Project")
	fmt.Println("1 Account1")
	fmt.Println("2 Account2")
	fmt.Println("Q quit")
	fmt.Println("enter your choice:")
	var input string
	fmt.Scanln(&input)
	for strings.ToLower(input) != "q" {
		if input == "1" {
			f1 := new(abstractfactory.AbstractFactory1)
			p := new(output.OP)
			p.Init(f1)
			efsm := new(state.MdaEfsm)
			efsm.Init(p)
			a1 := client.Account1{}
			a1.Init(efsm, f1)
			processA1(a1)
			return
		} else if input == "2" {
			f2 := new(abstractfactory.AbstractFactory2)
			p := new(output.OP)
			p.Init(f2)
			efsm := new(state.MdaEfsm)
			efsm.Init(p)
			a2 := client.Account2{}
			a2.Init(efsm, f2)
			processA2(a2)
			return
		} else {
			fmt.Println("1 Account1")
			fmt.Println("2 Account2")
			fmt.Println("Q quit")
			fmt.Println("enter your choice:")
			fmt.Scanln(&input)
		}
	}
}

func processA2(a2 client.Account2) {
	for {
		fmt.Println("0. OPEN(int,int,float)")
		fmt.Println("1. LOGIN(int)")
		fmt.Println("2. PIN(int)")
		fmt.Println("3. DEPOSIT(float)")
		fmt.Println("4. WITHDRAW(float)")
		fmt.Println("5. BALANCE()")
		fmt.Println("6. LOGOUT()")
		fmt.Println("7. suspend()")
		fmt.Println("8. activate()")
		fmt.Println("9. close()")
		fmt.Println("Q. Quit")
		fmt.Println("enter your choice:")
		var input string
		fmt.Scanln(&input)
		switch strings.ToLower(input) {
		case "0":
			var id int
			fmt.Println("Enter id:")
			fmt.Scanln(&id)
			var pin int
			fmt.Println("Enter PIN:")
			fmt.Scanln(&pin)
			var b float64
			fmt.Println("Enter Balance:")
			fmt.Scanln(&b)
			a2.OPEN(pin, id, b)
			break
		case "1":
			var y int
			fmt.Println("Enter Id:")
			fmt.Scanln(&y)
			a2.LOGIN(y)
			break
		case "2":
			var x int
			fmt.Println("Enter PIN:")
			fmt.Scanln(&x)
			a2.PIN(x)
			break
		case "3":
			var d float64
			fmt.Println("Enter deposit amount:")
			fmt.Scanln(&d)
			a2.DEPOSIT(d)
			break
		case "4":
			var w float64
			fmt.Println("Enter withdraw amount:")
			fmt.Scanln(&w)
			a2.WITHDRAW(w)
			break
		case "5":
			a2.BALANCE()
			break
		case "6":
			a2.LOGOUT()
			break
		case "7":
			a2.Suspend()
			break
		case "8":
			a2.Activate()
			break
		case "9":
			a2.Close()
			break
		case "q":
			fmt.Println("Quit!!")
			return
		}
	}
}

func processA1(a1 client.Account1) {
	for {
		fmt.Println("0. open(int,int,int)")
		fmt.Println("1. login(int)")
		fmt.Println("2. pin(int)")
		fmt.Println("3. deposit(int)")
		fmt.Println("4. withdraw(int)")
		fmt.Println("5. balance()")
		fmt.Println("6. lock(int)")
		fmt.Println("7. unlock(int)")
		fmt.Println("8. logout()")
		fmt.Println("Q. Quit")
		fmt.Println("enter your choice:")
		var input string
		fmt.Scanln(&input)
		switch strings.ToLower(input) {
		case "0":
			var id int
			fmt.Println("Enter id:")
			fmt.Scanln(&id)
			var pin int
			fmt.Println("Enter PIN:")
			fmt.Scanln(&pin)
			var b int
			fmt.Println("Enter Balance:")
			fmt.Scanln(&b)
			a1.Open(pin, id, b)
			break
		case "1":
			var y int
			fmt.Println("Enter Id:")
			fmt.Scanln(&y)
			a1.Login(y)
			break
		case "2":
			var x int
			fmt.Println("Enter PIN:")
			fmt.Scanln(&x)
			a1.Pin(x)
			break
		case "3":
			var d int
			fmt.Println("Enter deposit amount:")
			fmt.Scanln(&d)
			a1.Deposit(d)
			break
		case "4":
			var w int
			fmt.Println("Enter withdraw amount:")
			fmt.Scanln(&w)
			a1.Withdraw(w)
			break
		case "5":
			a1.Balance()
			break
		case "6":
			var x int
			fmt.Println("Enter PIN to lock account:")
			fmt.Scanln(&x)
			a1.Lock(x)
			break
		case "7":
			var x int
			fmt.Println("Enter PIN to unlock account:")
			fmt.Scanln(&x)
			a1.Unlock(x)
			break
		case "8":
			a1.Logout()
			break
		case "q":
			fmt.Println("Quit!!")
			return
		}
	}
}
