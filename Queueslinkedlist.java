
package queueslinkedlist;

public class Queueslinkedlist {

    public static void main(String[] args) {
        queue q = new queue(); 
        q.enqueue(10); 
        q.enqueue(20); 
        q.enqueue(30); 
        q.enqueue(40); 
        q.enqueue(50); 
    
        q.display();
            q.peek();
        q.dequeue(); 
        q.dequeue(); 
        q.dequeue(); 
  
    }
    
}
class node{
    int data;
    node next;
    node( int data ){
        this.data = data;
        this.next=null;
    }   
}
class queue{
    node rear, front;
    public queue() 
    { 
        this.front = this.rear = null; 
    } 
   public void enqueue(int key){
    node temp = new node(key);
    if(rear==null){
        rear=front=temp;
        return;
    }
    rear.next = temp; 
    rear = temp;  
   }
   void dequeue() 
    { 
        
        if (this.front == null) 
            return; 
  
        node temp = this.front; 
        this.front = this.front.next; 
  
        if (this.front == null) 
            this.rear = null; 
    } 
  public void peek()
{
    // check for empty queue
    if (front != null)
        System.out.println(""+ front.data);
    else{
        System.exit(1);
    }
   
}
  public void display() {
      node temp = front;
      while(temp.next!= null)
      {
          System.out.println("  "+temp.data);
          temp=temp.next;
      } 
      System.out.println("  "+temp.data);
  }   
  
}