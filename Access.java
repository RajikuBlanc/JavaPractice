public class Access {
    /*
        修飾子について
        クラスとメンバにはアクセス修飾子というものがつけられる
        その名の通りどこからアクセスできるかを制限できる

        アクセス修飾子・・public,protected,private,指定なし
        その他の修飾子・・static、abstract、final

        このうちクラスにつけられるのは、publicと指定なしだけ

        publicはどこからでもアクセスすることができる
        指定なしの場合は、同じクラス・パッケージから参照可能
        protectedは、指定なしの条件に加えサブクラスでも参照可能
        privateは、同じクラス内からのみ参照可能
        staticは、クラス変数やクラスメソッドの宣言(クラス内で1つだけ)
        abstractは、インスタンス生成不可
        finalは、定数の宣言(上書きできない)
     */
    private final int A;

    //    コンストラクタ
    public Access(int num) {
        A = num;
    }

    public int getB() {
        return A;
    }
}
