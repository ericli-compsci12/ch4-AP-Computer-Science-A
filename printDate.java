public class printDate {

    public static void main(String[] args) {
        String day =  "Tuesday";
        int date = 16;
        String month = "September";
        int year = 2025;
        printDate(day,date,month,year);
    }

    public static void printDate(String day, int date, String month, int year) {
        printAmerican(day,date,month,year);
        printEuropean(day,date,month,year);
    }

    public static void printAmerican (String day, int date, String month, int year){
        System.out.printf("%s, %s %d, %s\n",day,month,date,year);
    }
    public static void printEuropean(String day, int date, String month, int year) {
        System.out.printf("%s %d %s %d\n",day,date,month,year);
    }
}