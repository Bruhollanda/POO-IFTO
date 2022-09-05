import java.util.Scanner;

public class InvoiceTest {
    Scanner sc = new Scanner(System.in);
    Invoice invoice = new Invoice();
    public void getInformation() {
        System.out.print("Informe o número do produto comprado: ");
        invoice.setNumber(sc.next());
        System.out.print("Informe a descrição do produto comprado: ");
        invoice.setDescription(sc.next());
        System.out.print("Informe a quantidade do produto comprado: ");
        invoice.setQuantity(sc.nextInt());
        System.out.print("Informe o preço do produto comprado: ");
        invoice.setUnitPrice(sc.nextDouble());
    }// getInformation

    public void showInformation() {
        System.out.println(invoice);
        System.out.printf("O valor total do pedido é: R$ %.2f", invoice.getInvoiceAmount());
        System.out.println();
    }// showInformation
}// class
