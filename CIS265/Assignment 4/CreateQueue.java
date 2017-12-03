import java.util.*;

class CreateQueue<E> {
      
   private LinkedList<E> list = new LinkedList<E>();
   
   public void enqueue(E item){  //SAME AS PUSH IN STACK
      list.addLast(item);
   }
   
   public E dequeue() { //SAME AS POP IN STACK
      System.out.println("Passenger removed is: " + list.getFirst()); //lists the passenger's info when dequeued, this was not included in the original file
      return list.poll();
   }
   
   public boolean hasItems() {  //CHECKS IF THE QUEUE IS EMPTY OR NOT
      return !list.isEmpty();
   }

   public int size() { //DETERMINES THE SIZE OF QUEUE
      return list.size();
   }

   public void addItems(CreateQueue<? extends E> q) {  //ADDS ITEMS TO LINKED LIST
      while(q.hasItems())
         list.addLast(q.dequeue());
   }
   
   public String scanQueue(String name, int queueNumber){
      if(queueNumber >= size()){
         return "Passenger not found"; //returns "Passenger not found" if the passenger's name cannot be located in the queue
      }
      else if(list.get(queueNumber).toString().substring(0, name.length()).equals(name)){
         return list.get(queueNumber).toString(); //returns the passenger's info if the passenger at location queueNumber is the desired passenger
      }
      else{
         return scanQueue(name, queueNumber + 1); //calls scanQueue again if the passenger is not found at location queueNumber in the queue, queueNumber increments
      }
   }
   
   public void listAll(){
      System.out.println("Leaving queue with " + size() + " passengers");
      System.out.println("The passengers' names are:");
      for(int i = 0; i < size(); i++){
         System.out.println(list.get(i)); //lists all passengers' info
      }
   }
   
}