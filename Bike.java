abstract class Bike {
    abstract void ride();
}
class YamahaFZ extends bike{
    void ride(){
        System.out.println("Ride Safety");
    }
}
class run{
    public static void main(String[] args) {
        bike b = new YamahaFZ();
        b.ride();
    }
}