public class Student {
    //    static変数
    public static String race;
    //    インスタンス変数
    public String name;
    public int age;

    public void Self(String mess) {
        System.out.println("名前は" + name);
        System.out.println("年齢は" + age);
        System.out.println("自己紹介" + mess);
        System.out.println("国籍" + race);
        System.out.println("-----------------------");
    }
}
