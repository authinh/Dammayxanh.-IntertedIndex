package dammayxanh.com.intertedindex.example.bean;

public class EventTime {
    private String event;
    private String time;

    public EventTime() {

    }

    public EventTime(String event, String time) {
        this.event = event;
        this.time = time;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "EventTime{" +
                "event='" + event + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
