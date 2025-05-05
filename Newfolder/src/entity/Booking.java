package entity;

import java.util.Date;

public class Booking {
    private User user;
    private Resource resource;
    private Date startTime;
    private Date endTime;
    private double cost;

    public Booking(User user, Resource resource, Date startTime, Date endTime, double cost) {
        this.user = user;
        this.resource = resource;
        this.startTime = startTime;
        this.endTime = endTime;
        this.cost = cost;
    }
}