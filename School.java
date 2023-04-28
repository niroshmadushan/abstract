abstract class School {
    void teaching(){
        System.out.println("Teaching");
    }
    abstract void learning ();
}
class grade11 extends School {
    void learning(){
        System.out.println("Grade 11 student Learning well ");
    }
    void teaching(){
        super.teaching();
        System.out.println("Teacher Teaching well");
    }
}class runschool{
    public static void main(String[] args) {
        School s =new grade11();
        s.learning();
        s.teaching();
    }
}