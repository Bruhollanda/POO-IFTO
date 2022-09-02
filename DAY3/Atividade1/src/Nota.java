public class Nota {
    int itemNumber, itemQuantity;
    String itemDescription;
    double itemUnityPrice;

    public Nota(int itemNumber, int itemQuantity, String itemDescription, double itemUnityPrice) {
        this.itemNumber = itemNumber;
        this.itemQuantity = itemQuantity;
        this.itemDescription = itemDescription;
        this.itemUnityPrice = itemUnityPrice;
    }

    public double getNoteValue() {
        System.out.print("Valor total da nota: R$");
        return itemQuantity * itemUnityPrice;
    }// getNoteValue

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public double getItemUnityPrice() {
        return itemUnityPrice;
    }

    public void setItemUnityPrice(double itemUnityPrice) {
        this.itemUnityPrice = itemUnityPrice;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "itemNumber=" + itemNumber +
                ", itemQuantity=" + itemQuantity +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemUnityPrice=" + itemUnityPrice +
                '}';
    }
}// Nota
