/*
    オーバーロード・・同一クラス内でメソッド名が同一で、引数の型、数、並び順が異なるメソッドを複数定義すること
    つまり、同じメソッド名でも引数によって異なるメソッドとして扱えるということ
 */
/*
    オーバーロードができない場合
    1,引数の変数名が異なる場合
    void status(String name) {
        System.out.println("名前は" + name);
    }
    void status(String text) {
        System.out.println("名前は" + text);
    }
    2,戻り値だけが異なる場合
    void status(String text) {
        System.out.println("名前は" + text);
    }

    String status(String text) {
        System.out.println("名前は" + text);
    }
 */
public class ExClass {
    public static void main(String[] args) {
        ExClass ins1 = new ExClass();
        ins1.status("田中太郎");
    }

    void status(String name, String country) {
        System.out.println("名前は" + name);
        System.out.println("国は" + country);
    }

    void status(String name) {
        System.out.println("名前は" + name);
        System.out.println("国は日本です。");
    }
}
