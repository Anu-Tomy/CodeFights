public class Main {

    public static void main(String[] args) {
        /*Given a year, return the century it is in. The first century spans from the year 1 up to and
        including the year 100, the second - from the year 101 up to and including the year 200, etc.
               Example
        For year = 1905, the output should be
        centuryFromYear(year) = 20;
        For year = 1700, the output should be
        centuryFromYear(year) = 17.
        */
        int year = 1700;
        System.out.println("Century = " + centuryFromYear(year));

    }
    public static int centuryFromYear(int year) {
        if(year % 100 == 0)
            return year / 100;
        else {
            return ((year / 100) + 1);
        }

    }
}
