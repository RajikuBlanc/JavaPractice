public class StudentMain {
    public static void main(String[] args) {
        Student.race = "日本";

        Student tanaka = new Student();
        Student suzuki = new Student();

        tanaka.name = "田中";
        tanaka.age = 29;

        suzuki.name = "鈴木";
        suzuki.age = 25;

        tanaka.Self("田中です");
        suzuki.Self("田中です");
    }
}
