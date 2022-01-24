public class InstanceStatic {
    //    static変数の宣言と初期化
    static int staticVal = 100;
    //    インスタンス変数の宣言と初期化
    int instanceVal = 10;

    //    staticメソッドの宣言
    static void staticMethod() {
        System.out.println(staticVal);
    }

    //    staticメソッドの中でインスタンス変数を使用する場合はインスタンス化が必要
    static int A() {
        InstanceStatic y = new InstanceStatic();
        return y.instanceVal;
    }

    //    インスタンスメソッドの宣言
    void instanceMethod() {
        System.out.println(instanceVal);
    }
}
