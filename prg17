import java.util.*;
public class Hash_Set_Compare
 {
  public static void main(String[] args) 
  {
	Scanner s=new Scanner(System.in);
	int n,c,ch,i;
	String m,h;
	HashSet<String> h_set = new HashSet<String>();
	System.out.print("Enter the size of Hashset1:");
	n=s.nextInt();
	HashSet<String>h_set2 = new HashSet<String>();
	System.out.print("Enter the size of Hashset1:");
	c=s.nextInt();
	while(true)
	{
	System.out.print("****MENU****");
	System.out.print("\n1.Hashset1");
	System.out.print("\n2.Hashset2");
	System.out.print("\n3.Compare");
	System.out.print("\n4.Exit");
	System.out.print("\nEnter your choice:");
	ch=s.nextInt();
	switch(ch)
	{
		case 1:
	    System.out.print("Enter the elements:");
		for(i=0;i<n;i++)
		{ 
	      m=s.next();
	      h_set.add(m);
		  }
		  System.out.println(h_set);
		break;
	
        case 2:
	    System.out.print("Enter the elements:");
		for(i=0;i<n;i++)
		{ 
	      h=s.next();
	      h_set2.add(h);
		  }
		  System.out.println(h_set2);
		break;
		case 3:System.out.println("Comparison= "+ h_set.equals(h_set2));
		break;
		case 4:System.exit(0);
		break;
		}
	}
    }
  }
