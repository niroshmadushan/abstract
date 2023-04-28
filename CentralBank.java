abstract class CentralBank {
    abstract  int interestRate();
}
class BOC extends CentralBank{
    @java.lang.Override
    int interestRate() {
        return 5;
    }
}
class NDB extends CentralBank{
    @java.lang.Override
    int interestRate() {
        return 10;
    }
}
class RUN {
    public static void main(String[] args) {
        CentralBank CB;
        CB = new BOC();
        System.out.println("Rate of interest Rate is :-"+ CB.interestRate()+"%");
        CB = new NDB();
        System.out.println("Rate of interest Rate is :-"+ CB.interestRate()+"%");

    }
}