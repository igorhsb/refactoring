import java.util.Enumeration;

public class TextStatement extends Statement {
    public String value(Customer aCustomer) {
        return getText(aCustomer);
    }
    
    private String getText(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = "Rental Record for " + aCustomer.getName() +
        "\n";
        while (rentals.hasMoreElements()) {
           Rental each = (Rental) rentals.nextElement();
           //show figures for this rental
           result += "\t" + each.getMovie().getTitle()+ "\t" +
           String.valueOf(each.getCharge()) + "\n";
        }
        //add footer lines
        result += "Amount owed is " +
        String.valueOf(aCustomer.getTotalCharge()) + "\n";
        result += "You earned " +
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        " frequent renter points";
        return result;
    }

    private String getText(int p) {
        return "text";
    }
}