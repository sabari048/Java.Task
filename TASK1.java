import java.util.*;
enum EventType 
{
   MOVIE, SPORTS, CONCERT
}
 private String event_name;
 private Date event_date;
 private Time event_time;
 private String venue_name;
 private int total_seats;
 private int available_seats;
 private double ticket_price;
 private EventType event_type;
 public Event ()
 {

 }
 Public Event(String event_name, Date event_date, Time event_time, String venue_name, int total_seats, int available_seats, double ticket_price);
 {
    this.event_name = event_name;
    this.event_date = event_date;
    this.event_time = event_time;
    this.venue_name = venue_name;
    this.total_seats = total_seats;
    this.available_seats = available_seats;
    this.ticket_price = ticket_price;
    this.event_type = event_type;
}
public String getEventName()
 { 
 return event_name;
 }
 public void setEventName(string event_name)
{
this.event_name = event_name;
}
public Date getEventDate()
{
return event_date;
}
public void setEventDate(string event_date)
{
this.event_date = event_date;
}
public String getEventTime()
{
return event_time;
}
public void setEventTime(string event_time)
{
this.event_time = event_time;
}
public String getVenueName()
{
return venue_name;
}
public void setVenueName(String venue_name)
{
this.venue_name = venue_name;
}
public String getTotalSeats()
{
return total_seats;
}
public void setTotalSeats(String total_seats)
{
this.total_seats = total_seats;
}
public String getEventTime()
{
return event_time;
}
public void setEventTime(string event_time)
{
this.event_time = event_time;
}
public String getEventTime()
{
return event_time;
}
public void setEventTime(string event_time)
{
this.event_time = event_time;
}




