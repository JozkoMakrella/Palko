package model;

import java.sql.Timestamp;

public class Test {

    private int teacherId;
    private int studentIds[];
    private int periodOfTestInMinutes = 60;

    private Timestamp endTime;

    public void startTest(){
        this.startTime = new Timestamp(System.currentTimeMillis());
        this.endTime = new Timestamp(this.startTime.getNanos() + this.periodOfTestInMinutes * 60 * 1000);
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    private Timestamp startTime;

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getPeriodOfTestInMinutes() {
        return periodOfTestInMinutes;
    }

    public void setPeriodOfTestInMinutes(int periodOfTestInMinutes) {
        this.periodOfTestInMinutes = periodOfTestInMinutes;
    }

    public Timestamp getEndTime() {
        return endTime;
    }
}
