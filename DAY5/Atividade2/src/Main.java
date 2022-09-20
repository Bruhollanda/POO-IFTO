public class Main {
    public static void main(String[] args) {
        InvoiceTest invoiceTest1 = new InvoiceTest();
        InvoiceTest invoiceTest2 = new InvoiceTest();

        System.out.println("Objeto 1: ");
        invoiceTest1.getInformation();
        invoiceTest1.showInformation();

        System.out.println("Objeto 2: ");
        invoiceTest2.getInformation();
        invoiceTest2.showInformation();
    }
}