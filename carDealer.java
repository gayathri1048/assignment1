import java.util.*;
public class carDealer{
        public String Carmodel;
		public String isInsurance;
		public String isAcc;
		public long discount=0;
		public long RTO=113990;
		public long insurance=47300;
		public long TCSCharges=11000;
		public long Additional=15000;
		public String discount_amt;
		public void getCarModel()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("select car model: ");
			Carmodel=sc.nextLine();
			System.out.println("Do you need insurance");
			isInsurance=sc.nextLine();
			System.out.println("Do you need Additional Accessories: ");
			isAcc=sc.nextLine();
			System.out.println("Dealer Discount: ");
			discount_amt=sc.nextLine();
        	sc.close();
		}
			
		public long getCost(String carName,long cost)
		
		{
			 if(discount_amt.endsWith("%"))
		        {
		        	discount_amt=discount_amt.replace("%", "");
		        	discount=Integer.valueOf(discount_amt)*cost/100;
		        }
		        else
		        {
		        	discount=Integer.valueOf(discount_amt);
		        }
				if(discount>=30000)
				{
					System.out.println("Maximum discount should not cross 30000!");
					discount=0;
				}


			if(isInsurance.equalsIgnoreCase("yes") && isAcc.equalsIgnoreCase("yes"))
			{
				
				return cost+RTO+insurance+TCSCharges+Additional-discount;
				
			}
			if(isInsurance.equalsIgnoreCase("yes") && isAcc.equalsIgnoreCase("no"))
			{
				return cost+RTO+insurance+TCSCharges-discount;
			}
			if(isInsurance.equalsIgnoreCase("no") && isAcc.equalsIgnoreCase("yes"))
			{
				return cost+RTO+TCSCharges+Additional-discount;
			}
//			System.out.println("yes");
			if((isInsurance.equalsIgnoreCase("no") && isAcc.equalsIgnoreCase("no")))
			{
				discount=0;
				System.err.println("any one of the additional faetures have to be added");
				return cost+RTO+TCSCharges-discount;
	         }
			return cost+RTO+TCSCharges-discount;
			
		}

	}

