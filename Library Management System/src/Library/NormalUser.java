package Library;

import java.util.Scanner;

public class NormalUser extends User {
	public NormalUser(String name) {
		super(name);
		this.operations = new IOOperation[] {
				new ViewBook(),
				new Search(),
				new PlaceOrder(),
				new BorrowBook(),
				new CaluculateFine(),
				new ReturnBook(),
				new Exit()
		};
		}
		public NormalUser(String name, String email, String phoneNumber)
		{
			super(name,email, phoneNumber);
			this.operations = new IOOperation[] {
					new ViewBook(),
					new Search(),
					new PlaceOrder(),
					new BorrowBook(),
					new CaluculateFine(),
					new ReturnBook(),
					new Exit()
			};
		}
		@Override
		public void menu(Database database, User user)
		{
			System.out.println("Normal user options ");
			System.out.println("1.View Books");
			System.out.println("2.Search");
			System.out.println("3.Place Order");
			System.out.println("4.Borrow Book");
			System.out.println("5.Caluculate Fine");
			System.out.println("6.Return Book");
			System.out.println("7.Exit");
			
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			this.operations[n-1].opr(database, user);
			sc.close();	
		}
		public String toString()
		{
				String text= name +"<N/>"+ email  +"<N/>"+phoneNumber  +"<N/>"+ "Normal User";
				return text;
		}
	
}
