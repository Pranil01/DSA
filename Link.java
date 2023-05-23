package Day1;

public class Link {Node head ;


public void insertBeg(int x) {
	Node nn=new Node(x);
	if(head!=null)
		nn.next=head;
	head=nn;

}
public void removel(){
	//Node nn=new Node();
	Node curr=head;
	while(curr.next.next!=null) 
		curr=curr.next;
		curr.next=null;
	
		
		
	}
	



public void display() {

	Node temp=head;
	System.out.println("\nList Elements  -");
	while(temp!=null) {
		System.out.print("\t"+temp.data);
		temp=temp.next;
		
	}
	
	}
public void insertlast(int y) {
	Node n=new Node(y);
	Node d=head;
	while(d.next!=null) {
		d=d.next;
	}d.next=n;
		
     

}
public void removef(){
	//Node nn=new Node();
	//Node r =head;
	head=head.next;
	
		
		
		
	
		
		
	}
	

	
	public static void main(String[] args) {
	

		// TODO Auto-generated method stub
				Link l1=new Link();
				l1.insertBeg(23); //call to insert function will create 1st node in memory
				l1.insertBeg(56);
				l1.insertBeg(6);
				l1.insertBeg(8);
				l1.insertBeg(16);
				l1.insertBeg(88);
		l1.display();
		l1.removel();
		l1.display();
		l1.insertlast(99);
		l1.display();
		l1.removef();
		l1.display();
		
	}

}
