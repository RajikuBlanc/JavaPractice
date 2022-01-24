public class Main {
    public static void main(String[] args) {
/*
        Curryクラスのインスタンス化
        クラス名 変数名 = new クラス名(引数名)

        使用方法
        インスタンス化時の変数名.メンバ変数
        インスタンス化時の変数名.メソッド名(引数)
 */
//      Curryクラスのインスタンス化
//        Curry curry = new Curry();

//      Curryクラスのフィールドの値を参照
//        System.out.println(curry.name);

//      Curryクラスのメソッドを実行
//        System.out.println(curry.taste());

//        CheeseCurryクラスのインスタンスの生成
        CheeseCurry ins1 = new CheeseCurry();
        ins1.exShow(); // スーパークラスのメソッドの呼び出し
        ins1.exCheeseShow(); // サブクラスのメソッドの呼び出し
    }
}
