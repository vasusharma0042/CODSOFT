import java.util.Scanner;
public class CurrencyConverter {

  private static final double Exchange_rate = 1.20;
  public static double convertEurotoUSD(double euros) {
    return euros *  EXCHANGE_RATE;
  
}

public static void main(String[]arg){
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter Amount");
  double euros = Scanner.nextdouble();

  double usd = convertEurotoUSD(euros);
  System.out.println(euros + "Euros" + usd + "US Dollor");
  }
}  
