package modern.challenge;

public class Main {

    public static void main(String[] args) {

        System.out.println(DateCheckers.firstDayOfYearV1(2020, false));
        System.out.println(DateCheckers.firstDayOfYearV1(2020, true));
        System.out.println(DateCheckers.lastDayOfYearV1(2020, false));
        System.out.println(DateCheckers.lastDayOfYearV1(2020, true));

        System.out.println();
        
        System.out.println(DateCheckers.firstDayOfYearV2(2020, false));
        System.out.println(DateCheckers.firstDayOfYearV2(2020, true));
        System.out.println(DateCheckers.lastDayOfYearV2(2020, false));
        System.out.println(DateCheckers.lastDayOfYearV2(2020, true));
    }
}
