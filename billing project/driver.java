public class driver {

    public static void main(String[] args) {
     // dish and cost are in same order
     String[] dish = {"Sandwich", "Coffee", "French Fries", "Salad", "Pizza"};
     double[] cost = {30.0, 25.0, 35.0, 20.0, 100};
     Bill myBill = new Bill();
     // pass copies of array references
     myBill.add("Sandwich", 2, dish, cost);
     myBill.add("Coffee", 2, dish, cost);
     myBill.add("French Fries", 1, dish, cost);
     myBill.add("Salad", 1, dish, cost);
     myBill.add("Pizza", 3, dish, cost);
     myBill.getOrder();
     System.out.println(myBill.getTotal());
    }
   }