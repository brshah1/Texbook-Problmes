  public class Counter{
	  
		  public static void main(String[] args){
			  Counter tally = new Counter();
			  //tally.count();
			  tally.count();
			  int result = tally.getValue();
			  System.out.println("The value is: "+result);
			 // tally.count();
			  tally.count();
			  result = tally.getValue();
			  System.out.println(result);
		  }

		private void count() {
		
			
			
		}

		private int getValue() {
			// TODO Auto-generated method stub
			return 1;
		}
  }