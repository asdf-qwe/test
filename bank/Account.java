package bank;

import java.io.*;

public class Account {
    int money1;
    public Account(int money) {

        this.money1 = money;
    }

    void deposit(String id1, Bank[] b) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < b.length; i++) {
            if (id1.equals(b[i].Id)) {
                bw.write("입금할 금액을 입력해주세요");
                bw.flush();
                int money = Integer.parseInt(br.readLine());
                this.money1 += money;
                System.out.println(STR."\{money}원 입금되었습니다.");
                System.out.println(STR."현재 잔고: \{this.money1}");
            }
        }
    }


    void withDraw(String id1, Bank[] b) throws IOException, BankException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < b.length; i++) {
            if (id1.equals(b[i].Id)) {
                bw.write("출금할 금액을 입력해주세요");
                bw.flush();
                int money = Integer.parseInt(br.readLine());
                this.money1 -= money;
                if(this.money1-money < 0){
                    throw new BankException("잔액이 부족합니다. 다시 선택해주세요.");
                }
                System.out.println(STR."\{money}원 출금되었습니다.");
                System.out.println(STR."현재 잔고: \{this.money1}");

            }
        }
    }

    void check(String id1, Bank[] b) {
        for (int i = 0; i < b.length; i++) {
            if (id1.equals(b[i].Id)) {
                System.out.println(STR."현재 잔고: \{this.money1}");
            }
        }
    }
}

