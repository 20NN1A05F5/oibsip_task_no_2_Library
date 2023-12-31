package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewOrders implements  IOOperation{

	@Override
	public void opr(Database database, User user) {
		// TODO Auto-generated method stub
		System.out.println("Enter book name: ");
		Scanner s = new Scanner(System.in);
		String bookname = s.next();
		int i=database.getBook(bookname);
		if(i>-1)
		{
			System.out.println("Book\t\tUser\t\tQty\t\tPrice");
			
			//ArrayList<Order> orders = new ArrayList<Order>();
			for(Order order: database.getAllOrders()) {
				if(order.getBook().getName().matches(bookname)){
					//orders.add(order);
					System.out.println(order.getBook().getName()+"\t\t"+
					order.getUser().getName()+"\t\t"+order.getQty()+"\t"+order.getPrice());
				}
			}
				System.out.println();
			
			
		}else {
			System.out.println("\nBook does not exist\n");
		}
		user.menu(database, user);
	}
	

}
