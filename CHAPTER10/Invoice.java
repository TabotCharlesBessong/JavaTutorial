public class Invoice implements Payable {
  private final String partNum;
  // private final String partDes;
  private int quantity;
  private double pricePerItem;

  public Invoice(String partNum , String pastDes , int quantity, double pricePerItem){
    if(quantity <0 )
      throw new IllegalArgumentException("Quantity must be greater than  or equal to 0");
    if(pricePerItem < 0 )
      throw new IllegalArgumentException("Price of each item must be >= 0");

    this.quantity = quantity;
    this.partNum = partNum;
    // this.partDes = partDes;
    // this.partDes =  partDes;
    this.pricePerItem = pricePerItem;
  }
  public String getPartNum(){
    return partNum;
  }
  // public String getPartDes(){
    // return partDes;
  // }
  public void setQuantity(int quantity){
    if(quantity < 0)
      throw new IllegalArgumentException("Quantity cant be negative");
    this.quantity = quantity;
  }
  public int getQuantity(){
    return quantity;
  }
  public void setPricePerItem(double pricePerItem){
    if(pricePerItem < 0)
      throw new IllegalArgumentException("Price cant be negative");
    this.pricePerItem = pricePerItem;
  }
  public double getPricePerItem(){
    return pricePerItem;
  }
  @Override 
  public String toString(){
    return String.format("%s: %n%s: %n%s: %s: %d %n%s: $%,.2f","invoice","part number",getPartNum(),"quantity",getQuantity(),"price per  item",getPricePerItem());
  }
  @Override
  public double getPaymentAmount() {
    
    return getQuantity() * getPricePerItem(); 
  }
}
