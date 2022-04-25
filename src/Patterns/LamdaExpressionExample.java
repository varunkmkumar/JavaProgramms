package Patterns;

public class LamdaExpressionExample {

	public static void main(String[] args) {
		
		
		
		LamdaExpression lm=new LamdaExpression() {

			@Override
			public void add() {
				System.out.println("implimenation done");
				
			}
			
			
			
		};
		
		lm.add();
		
		
	}
}
