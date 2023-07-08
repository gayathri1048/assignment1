public class carDealerUse extends carDealer {
        public static void main(String[] args) {
            carDealerUse m=new carDealerUse();
            String[] arr= new String[]{"Polo Trendline","Polo Highline","Virtus Trendline","Virtus Highline","Taigun Trendline","Taigun Highline","Taigun Topline"};
            for(int i=0;i<arr.length;i++)
            {
                System.out.println(arr[i]);
            }
            
            long[] cost=new long[]{870000,1009000,1105000,1308000,1489000,1542000,1771000};
            m.getCarModel();
    //	   System.out.println(m.Carmodel);
            for(int i=0;i<arr.length;i++)
              {
                
                if(arr[i].equals(m.Carmodel))
                {
                    System.out.println("Total cost "+m.getCost(arr[i],cost[i])+"("+arr[i]+" "+cost[i]+" + "+m.RTO+"(RTO)"+" + "+m.insurance+"(Insurance)"+"+"+m.TCSCharges+"(TCS)"+" + "+m.Additional+"(Additional Accessories)"+"-"+m.discount+"(Dealer Discount))");
                    
                }
                
            }
        }
    
    }
    

