package bank;

import java.io.*;

public class BankManager {
    public static void main(String[] args) throws IOException, BankException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Bank ba = new Bank();
        Customer c = new Customer();
        Account a = new Account(0);
        Bank[] bank = new Bank[5];
        String id;
        int i =0;
        int count = 0;
        for ( i = 0; i < bank.length; i++) {
            bank[i] = new Bank();
        }

        while (true) {
            bw.write("---------라이온 은행 시스템----------------\n");
            bw.write("1.고객 등록\n2.계좌 생성\n3.입금\n4.출금\n5.잔액 조회\n6.종료");
            bw.write("\n번호를 입력해주세요:");
            bw.flush();
            int select = Integer.parseInt(br.readLine());
            switch (select){
                case 1 :
                    bw.write("사용하실 Id를 입력해주세요");
                    bw.flush();
                    id = br.readLine();
                    if(ba.checkId(bank,id)){
                        bank[count].addCustomer(br,id);
                        count++;
                    }
                    break;
                case 2 :
                    bw.write("Id를 입력해주세요");
                    bw.flush();
                    id = br.readLine();
                    c.addAccount(id,bank);
                    break;

                case 3 :
                    bw.write("Id를 입력해주세요");
                    bw.flush();
                    id = br.readLine();
                    a.deposit(id,bank);
                    break;

                case 4:
                    bw.write("Id를 입력해주세요");
                    bw.flush();
                    id = br.readLine();
                    try {
                        a.withDraw(id, bank);
                    }catch (BankException e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5 :
                    bw.write("Id를 입력해주세요");
                    bw.flush();
                    id = br.readLine();
                    a.check(id,bank);
                    break;
            }


        }
    }
}

