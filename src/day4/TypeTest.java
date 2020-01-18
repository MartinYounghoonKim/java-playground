package day4;

import java.util.Calendar;
import java.util.Objects;

class Time { // 접근제어자가 default
    protected int hour; // 접근제어자가 default
    private int minute; // 접근제어자가 default
    private int second; // 접근제어자가 default
    public Time() {
        this(0,0,0);
    }
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 24) return;
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }

    // Q1. equals를 적절히 오버라이딩 하시오.
    public boolean equals (Object object) {
        if (!(object instanceof Time)) {
            return false;
        }

        Time target = (Time)object;
        return this.hour == target.hour &&
                this.minute == target.minute &&
                this.second == target.second;
    }
}

class ChildTime extends Time {
    public int getHour () {
        return hour;
    }
}

public class TypeTest {
    public static void main(String[] args) {
        Time time = new Time();
        ChildTime childTime = new ChildTime();
        ChildTime nullableChildTime = null;
        System.out.println(childTime instanceof Object);
        System.out.println(childTime instanceof Time);
        System.out.println(childTime instanceof ChildTime);

        if (nullableChildTime instanceof ChildTime) {
            System.out.println("true");
        }


        time.setHour(2);
        System.out.println(time);
        System.out.println(childTime.getHour());
        // equals 테스트
        Time time1 = new Time(12, 34, 56);
        Time time2 = new Time(12, 34, 56);
        Time time3 = new Time(11, 57, 32);

        System.out.println(time1.equals(time2));
        System.out.println(time1.equals(time3));
        Calendar calendar = Calendar.getInstance();
    }
}