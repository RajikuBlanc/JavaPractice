/*
    継承のルール
    複数クラスから継承することはできない
    1つのクラスから複数のクラスに継承することは可能
    継承したクラスをさらに継承することも可能
 */
public class CheeseCurry extends Curry {
    void exCheeseShow() {
        System.out.println("チーズカレーの作り方");
    }
}
