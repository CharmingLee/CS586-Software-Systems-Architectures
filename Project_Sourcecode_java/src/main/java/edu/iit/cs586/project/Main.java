package edu.iit.cs586.project;

import edu.iit.cs586.project.abstractfactory.ConcreteFactory1;
import edu.iit.cs586.project.abstractfactory.ConcreteFactory2;
import edu.iit.cs586.project.input.Account1;
import edu.iit.cs586.project.input.Account2;
import edu.iit.cs586.project.output.OP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author CharmingLee <charminglee@jieztech.com>
 * @date 2022/5/1 20:20
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Spring 2022 CS586 Project Qiming Lyu A()");
        System.out.println("1 Account1");
        System.out.println("2 Account2");
        System.out.println("Q quit");
        System.out.println("enter your choice:");
        String input = reader.readLine();
        while (!input.equalsIgnoreCase("Q")) {
            if (input.equals("1")) {
                ConcreteFactory1 cf1 = new ConcreteFactory1();
                OP p = new OP(cf1);
                MDA_EFSM m = new MDA_EFSM(p);
                Account1 a1 = new Account1(cf1, m);
                processA1(a1, reader);
            } else if (input.equals("2")) {
                ConcreteFactory2 cf2 = new ConcreteFactory2();
                OP p = new OP(cf2);
                MDA_EFSM m = new MDA_EFSM(p);
                Account2 a2 = new Account2(cf2, m);
                processA2(a2, reader);
            } else {
                System.out.println("1 Account1");
                System.out.println("2 Account2");
                System.out.println("Q quit");
                System.out.println("enter your choice:");
            }
        }


    }

    private static void processA1(Account1 account1, BufferedReader reader) throws IOException {
        while (true) {
            System.out.println("0. open(int,int,int)");
            System.out.println("1. login(int)");
            System.out.println("2. pin(int)");
            System.out.println("3. deposit(int)");
            System.out.println("4. withdraw(int)");
            System.out.println("5. balance()");
            System.out.println("6. lock(int)");
            System.out.println("7. unlock(int)");
            System.out.println("8. logout()");
            System.out.println("Q. Quit");
            System.out.println("enter your choice:");

            String input = reader.readLine();
            switch (input.toUpperCase()) {
                case "0": {
                    System.out.println("Enter id:");
                    int y = Integer.parseInt(reader.readLine());

                    System.out.println("Enter PIN:");
                    int p = Integer.parseInt(reader.readLine());

                    System.out.println("Enter Balance:");
                    int a = Integer.parseInt(reader.readLine());

                    account1.open(p, y, a);
                    break;
                }

                case "1": {
                    System.out.println("Enter id:");
                    int y = Integer.parseInt(reader.readLine());

                    account1.login(y);
                    break;
                }

                case "2": {
                    System.out.println("Enter PIN:");
                    int x = Integer.parseInt(reader.readLine());

                    account1.pin(x);
                    break;
                }

                case "3": {
                    System.out.println("Enter deposit amount:");
                    int d = Integer.parseInt(reader.readLine());

                    account1.deposit(d);
                    break;
                }

                case "4": {
                    System.out.println("Enter withdraw amount:");
                    int w = Integer.parseInt(reader.readLine());

                    account1.withdraw(w);
                    break;
                }

                case "5": {
                    account1.balance();
                    break;
                }

                case "6": {
                    System.out.println("Enter PIN to lock account:");
                    int x = Integer.parseInt(reader.readLine());

                    account1.lock(x);
                    break;
                }

                case "7": {
                    System.out.println("Enter PIN to unlock account:");
                    int x = Integer.parseInt(reader.readLine());

                    account1.unlock(x);
                    break;
                }

                case "8": {
                    account1.logout();
                    break;
                }

                case "Q": {
                    System.out.println("Quit!!");
                    System.exit(0);
                }

                default: {
                    System.out.println("Unsupported operation, please choose again:");
                    break;
                }
            }
        }
    }

    private static void processA2(Account2 account2, BufferedReader reader) throws IOException {
        while (true) {
            System.out.println("0. OPEN(int,int,float)");
            System.out.println("1. LOGIN(int)");
            System.out.println("2. PIN(int)");
            System.out.println("3. DEPOSIT(float)");
            System.out.println("4. WITHDRAW(float)");
            System.out.println("5. BALANCE()");
            System.out.println("6. LOGOUT()");
            System.out.println("7. suspend()");
            System.out.println("8. activate()");
            System.out.println("9. close()");
            System.out.println("Q. Quit");
            System.out.println("enter your choice:");

            String input = reader.readLine();
            switch (input.toUpperCase()) {
                case "0": {
                    System.out.println("Enter id:");
                    int y = Integer.parseInt(reader.readLine());

                    System.out.println("Enter PIN:");
                    int p = Integer.parseInt(reader.readLine());

                    System.out.println("Enter Balance:");
                    float a = Integer.parseInt(reader.readLine());

                    account2.OPEN(p, y, a);
                    break;
                }

                case "1": {
                    System.out.println("Enter id:");
                    int y = Integer.parseInt(reader.readLine());

                    account2.LOGIN(y);
                    break;
                }

                case "2": {
                    System.out.println("Enter PIN:");
                    int x = Integer.parseInt(reader.readLine());

                    account2.PIN(x);
                    break;
                }

                case "3": {
                    System.out.println("Enter deposit amount:");
                    float deposit = Float.parseFloat(reader.readLine());

                    account2.DEPOSIT(deposit);
                    break;
                }

                case "4": {
                    System.out.println("Enter withdraw amount:");
                    float w = Float.parseFloat(reader.readLine());

                    account2.WITHDRAW(w);
                    break;
                }

                case "5": {
                    account2.BALANCE();
                    break;
                }

                case "6": {
                    account2.LOGOUT();
                    break;
                }

                case "7": {
                    account2.suspend();
                    break;
                }

                case "8": {
                    account2.activate();
                    break;
                }

                case "9": {
                    account2.close();
                    break;
                }

                case "Q": {
                    System.out.println("Quit!!");
                    System.exit(0);
                }

                default: {
                    System.out.println("Unsupported operation, please choose again:");
                    break;
                }
            }
        }
    }
}
