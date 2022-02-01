/*
    インターフェース・・オブジェクトを利用する際に、共通の使用をまとめたもの
        ・リモコンでいう音量の増減やチャンネル、電源ボタンのこと。機種が違えど、どのリモコンにもついている機能
    ポリモフィズム・・共通のインターフェースを持っているがオブジェクトごとに異なる操作ができること
        ・共通のものは必ずどのリモコンにもあるが、あるリモコンにしかついていない機能もある。一発録画といったような機能

    インターフェースの宣言方法
    アクセス修飾子 abstract(省略可能) interface インターフェース名 {}
    ・ 抽象化はできない
    ・ 変数は定数しか定義できない
    ・ メソッドは抽象メソッドしか定義できない
    ・インターフェースで定義する変数と抽象メソッドは抽象クラスとはことなり、それぞれ初期化する必要がある
    ・暗黙的に変数と抽象メソッドには以下の修飾子がつく
        ・変数：public static final
        ・抽象メソッド：public abstract

     インターフェース実装方法
     インターフェースはこのままでは使用できないため、クラスに継承するような感じで使用する

     アクセス修飾子 class クラス名 implements インターフェース名 {}
     アクセス修飾子 class クラス名 implements インターフェース名,インターフェース名 {}

     * [,]で区切ることで、複数指定可能
     * 抽象クラスと同じように、インターフェースで定義したメソッドは使用しているクラス内で全てオーバーライドする必要がある
     * オーバーライドする際にpublic修飾子をつける決まりがある

 */
interface Interface {
    public static final int x = 10;

    public abstract void method();
}