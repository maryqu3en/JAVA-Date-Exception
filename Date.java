public class Date {
    private int day;
    private int month;
    
    int getDay() {
        return day;
    }
    void setDay(int d) {
        day = d;
    }
    int getMonth() {
        return month;
    }
    void setMonth(int m) {
        month = m;
    }

    public Date(int day, int month) throws DException {
        if (!(1 <= month && month <= 12 && 1 <= day && day <= 30)) {
            throw new DException("Invalid date: Month should be between 1 and 12, and day should be between 1 and 30.");
        }
        this.day = day;
        this.month = month;
    }
}