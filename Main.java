 public class Main {
    public static void main(String[] args) {
        New_wind n1 = new New_wind(01, 02, 2014);
        System.out.println(n1);


        n1.setDay(9);
        n1.setMonth(12);
        n1.setYear(2099);
        System.out.println(n1);
        System.out.println("Day:  " + n1.getDay());
        System.out.println("Month:  " + n1.getMonth());
        System.out.println("Year:  " + n1.getYear());


        n1.setDate(3,4,2016);
        System.out.println(n1);
    }
 }