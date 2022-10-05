public class Invoice {
    String number, description;
    double unitPrice;
    int quantity;

    public Invoice(String number, String description, int quantity, double unitPrice) {
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }// Constructor

    public Invoice () {}// Constructor

    public double getInvoiceAmount () {
        return quantity*unitPrice;
    }// getInvoiceAmount - calcula o valor da fatura

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = (int) quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "Número do produto: '" + number + '\'' +
                ", Descrição: '" + description + '\'' +
                ", Quantidade: " + quantity +
                ", Preço unitário: " + unitPrice +
                '}';
    }
}// class
