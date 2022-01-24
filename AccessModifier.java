public class AccessModifier {
    /*
        Accessをインスタンス化

        acc.とつなげることでAccessで定義されているメソッドやメンバが参照可能
        今回メンバにはprivateがついているため参照することができないが、このprivateがpublicに変わった場合は参照することが可能になる
     */
    public static void main(String[] args) {
        Access acc = new Access(10);
        System.out.println(acc.getB());
    }
}
