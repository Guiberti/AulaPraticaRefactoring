package Main.java;

import java.util.Enumeration;

public abstract class Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = headerString(aCustomer);

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += rentalString(each);
        }

        result += footerString(aCustomer);
        return result;
    }

    abstract String headerString(Customer aCustomer);
    abstract String rentalString(Rental aRental);
    abstract String footerString(Customer aCustomer);
}