package com.atguigu;

/**
 * Created by 渝B on 2020/2/10.
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(0);
        Customer customer = new Customer(account);
        Customer customer1 = new Customer(account);

        customer.setName("甲");
        customer1.setName("乙");

        customer.start();
        customer1.start();
    }
}

class Account{
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public synchronized void deposit(int amt){
        if (amt>0){
            balance += amt;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" 存钱ok,余额 "+balance);
        }
    }
}

class Customer extends Thread{
    private Account acc;

    public Customer(Account acc) {
        this.acc = acc;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            acc.deposit(1000);
        }
    }
}
