import java.io.*; 
import java.util.*; 
class ArrayListStrings
{ 
public static void main(String[] s) 
    {
	Scanner sc=new Scanner(System.in);
	int n,c,ch,i,d;
	String m,h,f;
	System.out.println("Enter the limit:");
	n=sc.nextInt();
    ArrayList<String> st= new ArrayList<>(n); 
	while(true)
	{
	System.out.print("****MENU****");
	System.out.print("\n1.Insert");
	System.out.print("\n2.Replace");
	System.out.print("\n3.Remove");
	System.out.print("\n4.Display");
	System.out.print("\n5.Exit");
	System.out.print("\nEnter your choice:");
	ch=sc.nextInt();
	switch(ch)
	{
		case 1:
	    System.out.print("Enter the elements:");
		for (i = 0; i <n; i++) 
		{
		 m=sc.next();	
		st.add(m); 
		}
        System.out.println(st); 
		break;
	
        case 2:
		System.out.print("Enter the element to replace:");
		h=sc.next();
		System.out.print("Enter the new element:");
		f=sc.next();
		for (i = 0; i < st.size(); i++) 
		{
			if(st.get(i).equalsIgnoreCase(h)) {
                st.set(i,f);
		}
		}
		  System.out.println(st);
		break;
		case 3:System.out.print("Enter the element to remove:");
		h=sc.next();
		st.remove(h);
		  System.out.println(st);
		break;
		case 4:System.out.println(st); 
		break;
		case 5:System.exit(0);
		break;
		}
	}
    }
  }
