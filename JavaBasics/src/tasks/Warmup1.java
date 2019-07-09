package tasks;

public class Warmup1 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday || vacation);
    }
    public int diff21(int n) {
        return n < 21 ? Math.abs(21 - n) : Math.abs(21 - n) * 2;
    }
    public boolean nearHundred(int n) {
        return ((n >= 100 - 10) && (n  <= 100 + 10) || (n >= 200 - 10) && (n  <= 200 + 10));
    }
    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }
    public String backAround(String str) {
        return str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1);
    }
    public boolean or35(int n) {
        return ((n % 3 == 0) || (n % 5 == 0));
    }
    public String front22(String str) {
        return (str.length() >= 2) ? str.substring(0, 2) + str + str.substring(0, 2) : str + str + str;
    }
    public boolean startHi(String str) {
        return ((str.length() >= 2) && (str.substring(0, 2).equals("hi")));
    }
}
