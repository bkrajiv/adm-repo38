import java.util.*;

class  LinkedList1
{
	public static void main(String[] args) 
	{
       LinkedList l= new LinkedList();
      l.add("rajiv");
      l.add("kumar");
//	  l.pop();

	  System.out.println(l);
	  l.addFirst("Mr.");
  	  l.addLast("Gupta");
	    System.out.println(l);
      l.removeFirst();
  	  l.removeLast();
  	  System.out.println(l);

	}
}
