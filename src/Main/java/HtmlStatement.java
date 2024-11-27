package Main.java;

public class HtmlStatement extends Statement {
    @Override
    String headerString(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() +
                "</EM></H1><P>\n";
    }

    @Override
    String rentalString(Rental aRental) {
        return aRental.getMovie().getTitle() + ": " +
                String.valueOf(aRental.getCharge()) + "<BR>\n";
    }

    @Override
    String footerString(Customer aCustomer) {
        return "<P>You owe <EM>" +
                String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n" +
                "On this rental you earned <EM>" +
                String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";
    }
}
//Commit 17 e 18 não tem diferença!