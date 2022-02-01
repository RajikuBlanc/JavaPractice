/*
    カプセル化
    隠蔽されているメンバをメソッドを通してのみ参照や、更新ができるようにすること
    隠蔽されているメンバとはprivate修飾子がついているメンバのことをさす
    他クラスからメンバを操作するメソッドのことをアクセサといい、代表的なものとしてgetterとsetterがある
    getter・・隠蔽されているメンバを参照する
    setter・・隠蔽されているメンバを更新する

    Lombokを使用する場合はアノテーションで自動的に記述される
    他クラスでprivate修飾子がついているものを操作しようと思うとカプセル化をしなければならない
    またはメンバをpublicや他のクラスでも参照できる修飾子にする
*/

public class BankAccount {
    //    口座名義を定義
    private String myname;

    //    口座残高を定義
    private int balance;


    //    口座名義を参照
    public String getMyname() {
        return myname;
    }

    //    口座名義を更新
    public void setMyname(String sVal) {
        myname = sVal;
    }

    //    口座残高を参照
    public int getBalance() {
        return balance;
    }

    //    口座残高を更新
    public void setBalance(int val) {
        balance = val;
    }

    public void showAccount() {
        System.out.println("口座名義:" + myname);
        System.out.println("口座残高:" + balance + "円");
    }
}
