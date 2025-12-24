public class TvSelling{

public static void main(String [] p){
  
    int buyPrice = Integer.parseInt(p[0]);
    
    int sells = (buyPrice+(buyPrice*27)/100);
    
    int withGst = (sells+(sells*5)/100);


    System.out.println("buys a TV set for " +buyPrice);
    System.out.println(" total selling price" +withGst);
}
}