package com.nit.interface_factorymethod;



public class Anonymous {
	public static void main(String[] args) {
		PrintDemo pd = new PrintDemo();
		pd.getPrinter();
		
		
	}

}
interface printer{
	void Print();
	
}
class PrintDemo{
    public printer getPrinter(){
    	
    	printer p = new printer() {

			@Override
			public void Print() {
				System.out.println("override");
				
			}
    		
    		
    	};
    	p.Print();
    	return p;
    }

	
}
