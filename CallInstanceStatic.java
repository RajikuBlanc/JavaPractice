public class CallInstanceStatic {
    public static void main(String[] args) {
//    InstanceStaticクラスのstatic変数を呼び出し
        System.out.println(InstanceStatic.staticVal);

//    InstanceStaticクラスのstaticメソッドを呼び出し
        InstanceStatic.staticMethod();

//    InstanceStaticクラスをインスタンス化し、xに代入
        InstanceStatic x = new InstanceStatic();

//    xのインスタンス変数を呼び出し
        System.out.println(x.instanceVal);

//    xのインスタンスメソッドを呼び出し
        x.instanceMethod();
    }
}
