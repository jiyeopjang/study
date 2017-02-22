public class StrategyPattern{

  public static void main(String[] args){
      Customer a= new Customer(new NormalStrategy());

      //Normal Bill
      a.add(1.0,1);

      //start Happy Hour
      a.setStrategy(new HappyHourStrategy());
      a.add(1.0,2);

      //New Customer
      Customer b = new Customer(new HappyHourStrategy());
      b.add(0.8,1);

      //The Customer pays
      a.printBill();

      //End Happy HappyHour
      b.setStrategy(new NormalStrategy);
      b.add(1.3,2);
      b.add(2.5,1);
      b.printBill();
  }
}
