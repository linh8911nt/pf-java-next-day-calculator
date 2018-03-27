public class NextDayCalculator {
    public static boolean checkLeapYear(int year) {
        boolean cheackLeapYear = true;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return cheackLeapYear = true;
                } else
                    return cheackLeapYear = false;
            } else
                return cheackLeapYear = false;
        } else
            return cheackLeapYear = false;
    }

    public static String nextDayCalculator(int day, int month, int year) {
        int nextDay = day + 1;
        switch (month) {
            case 2:
                if (checkLeapYear(year) == true && nextDay > 29) {
                    nextDay = 1;
                    month += 1;
                } else if (checkLeapYear(year) == false && nextDay > 28) {
                    nextDay = 1;
                    month += 1;
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (nextDay > 31) {
                    nextDay = 1;
                    month += 1;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (nextDay > 30) {
                    nextDay = 1;
                    month += 1;
                }
                break;
            case 12:
                if (nextDay > 31) {
                    nextDay = 1;
                    month = 1;
                    year += 1;
                }
                break;
        }

        String date = nextDay + "/" + month + "/" + year;
        return date;
    }
}
