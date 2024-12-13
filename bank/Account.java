package bank;

import java.io.*;

public class Customer {
    Account ac = new Account(0);


    void addAccount(String id1, Bank[] b) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < b.length; i++) {
            if (id1.equals(b[i].Id)) {
                bw.write("계좌 번호를 입력해주세요");
                bw.flush();
                accountNum = new int[]{Integer.parseInt(br.readLine())};

            }


        }
    }


}
