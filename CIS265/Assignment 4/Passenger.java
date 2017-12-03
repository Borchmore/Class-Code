class Passenger {
   
   public String Name;
   public String ticket_type;
   public int seat_no;
   
   public Passenger() {
   }
   
   public Passenger(String name, String type, int num) {
      this.Name = name;
      this.ticket_type = type;
      this.seat_no = num;
   }
   
   public String toString() {
      return Name + " " + ticket_type + " " + seat_no; //the seat_no int was added here since it was missing from the original Passenger file
   }

}