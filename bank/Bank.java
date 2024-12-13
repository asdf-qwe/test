package bank;



import java.io.*;

public class Bank {
    String name1;
    String id;
    String Id;


    void addCustomer(BufferedReader br, String id) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("등록할 이릉을 입력해주세요");
        bw.flush();
        Id = id;
        name1 = br.readLine();
    }


    public boolean checkId(Bank[] c, String id) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i;
        boolean flag = true;
        for (i = 0; i < c.length; i++) {
            if (id.equals(c[i].id)) {
                bw.write("이미 존재하는 이름입니다.");
                bw.flush();
                flag = false;
            }
        }

        return flag;
    }
}
