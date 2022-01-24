public class ConstructorMain {
    public static void main(String[] args) {
//        引数を渡しているため、コンストラクタ1が呼び出される
        Constructor numA = new Constructor(1000);
//        引数を渡していないため、コンストラクタ2が呼び出される
        Constructor numB = new Constructor();

        numA.getNumber();
        numB.getNumber();
    }
}
