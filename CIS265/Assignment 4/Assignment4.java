import java.util.*;

public class Assignment4{
   
   public static void main(String args[]){
      
      CreateQueue<Passenger> queue = new CreateQueue<Passenger>(); //creates the queue from the CreateQueue class
      Scanner input = new Scanner(System.in);
      Scanner input2 = new Scanner(System.in);
      char choice;
      String name, type;
      int seatNumber;
      
      do{
         System.out.println("Enter A(dd), R(emove), S(can), or Q(uit)>");
         choice = input.nextLine().toUpperCase().charAt(0); //finds first letter in uppercase to record the user's choice
         switch(choice){
            case 'A': 
               System.out.println("Enter passenger name"); //from here...
               name = input.nextLine();
               System.out.println("Enter ticket type");
               type = input.nextLine();
               System.out.println("Enter seat number");
               seatNumber = input2.nextInt(); //...to here the passenger's data is asked for and then taken from the user's input
               PassengerData newPassenger = new PassengerData(name, type, seatNumber); //Passenger object created from PassengerData class
               queue.enqueue(newPassenger); //puts the passenger in the queue
               break;
            case 'R': 
               queue.dequeue(); //takes the passenger out of the queue
               break;
            case 'S':   
               System.out.println("Enter the passenger whose details are needed");
               name = input.nextLine(); //takes input for passenger's name
               System.out.println(queue.scanQueue(name, 0)); //scans for the passenger in the queue
               break;
            case 'Q':  
               queue.listAll(); //lists all passengers' info
               break;
            default:  System.out.println("Invalid choice ---try again\n");
         }
      } while (choice != 'Q');
   }
}