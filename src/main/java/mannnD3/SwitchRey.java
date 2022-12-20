package mannnD3;

public class SwitchRey {
    public static void main(String[] args) {
        System.out.println(noOfDays(2,2025));


    }

    public static int noOfDays(int month, int year) {
        int days = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;

            case 2:
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                throw new IllegalArgumentException("eppudraaa");

        }
        return days;
    }

    public static boolean isLeapYear(int year) {
        if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }

    }
}

