public class OverrideSub extends Override {
    public void increase(int num) {
        int x = num * 1000;
        System.out.println(x);
    }

    /*
        上書き前のスーパークラスのメソッドを呼び出したい場合は、super.メソッド名で呼び出すことが可能
     */
    public void increase2(int num) {
        super.increase(num);
    }
}
