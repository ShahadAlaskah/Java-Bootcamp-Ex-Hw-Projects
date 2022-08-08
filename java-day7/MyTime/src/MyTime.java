public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        setHour((hour));
        setMinute(minute);
        setSecond(second);
    }
    public void setTime(int hour,int minute,int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 23) {
            this.hour = 0;
        }else {
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 60) {
            this.minute = minute-60;
            setHour(getHour()+1);
        }else {
            this.minute = minute;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 60) {

            this.second = second-60;
            setMinute(getMinute()+1);
        }else {
            this.second = second;
        }
    }
//---------------------------------------chan
    @Override
    public String toString() {
        return "MyTime{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
    public MyTime nextSecond(){
        this.setSecond(this.getSecond()+1);
        return this;
    }
    public MyTime nextMinute(){
        this.setMinute(this.getMinute()+1);
        return this;
    }
    public MyTime previousHour(){
        this.setHour(this.getHour()-1);
        return this;
    }
    public MyTime previousSecond(){
        this.setSecond(this.getSecond()-1);
        return this;
    }
    public MyTime previousMinute(){
        this.setMinute(this.getMinute()-1);
        return this;
    }
    public MyTime nextHour(){
        this.setHour(this.getHour()-1);
        return this;
    }


}
