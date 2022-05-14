package ua.edu.sumdu.j2se.bozhenko.tasks;

public class Task {
    private String title;
    private int time;
    private int start;
    private int end;
    private int interval;
    private boolean active;

    public Task(String title, int time) {
        this.title = title;
        this.time = time;
    }

    public Task(String title, int start, int end, int interval) {
        this.title = title;
        this.start = start;
        this.end = end;
        this.interval = interval;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getStartTime() {
        return start;
    }

    public int getEndTime() {
        return end;
    }

    public int getRepeatInterval() {
        return interval;
    }

    public void setTime(int start, int end, int interval) {
        this.start = start;
        this.end = end;

    }

    public boolean isRepeated(){
        return interval;
    }


}
