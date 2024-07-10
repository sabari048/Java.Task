public class Event {
    
        private String eventName;
        private Date eventDate;
        private Time eventTime;
        private String venueName;
        private int totalSeats;
        private int availableSeats;
        private BigDecimal ticketPrice;
        private EventType eventType;
    
        public enum EventType {
            MOVIE, SPORTS, CONCERT
        }
        public Event(String eventName, Date eventDate, Time eventTime, String venueName, int totalSeats, BigDecimal ticketPrice, EventType eventType) {
            this.eventName = eventName;
            this.eventDate = eventDate;
            this.eventTime = eventTime;
            this.venueName = venueName;
            this.totalSeats = totalSeats;
            this.availableSeats = totalSeats;
            this.ticketPrice = ticketPrice;
            this.eventType = eventType;
        }   
         public String getEventName() {
            return eventName;
        }
    
        public void setEventName(String eventName) {
            this.eventName = eventName;
        }
    
        public Date getEventDate() {
            return eventDate;
        }
    
        public void setEventDate(Date eventDate) {
            this.eventDate = eventDate;
        }
    
        public Time getEventTime() {
            return eventTime;
        }
    
        public void setEventTime(Time eventTime) {
            this.eventTime = eventTime;
        }
    
        public String getVenueName() {
            return venueName;
        }
    
        public void setVenueName(String venueName) {
            this.venueName = venueName;
        }
    
        public int getTotalSeats() {
            return totalSeats;
        }
    
        public void setTotalSeats(int totalSeats) {
            this.totalSeats = totalSeats;
        }
        public int getAvailableSeats() {
            return availableSeats;
        }
    
        public void setAvailableSeats(int availableSeats) {
            this.availableSeats = availableSeats;
        }
    
        public BigDecimal getTicketPrice() {
            return ticketPrice;
        }
    
        public void setTicketPrice(BigDecimal ticketPrice) {
            this.ticketPrice = ticketPrice;
        }      
        public EventType getEventType() {
            return eventType;
        }
    
        public void setEventType(EventType eventType) {
            this.eventType = eventType;
        } 
        