import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name, Date date) {
        this.customer = new Customer(name);
        this.date = date;
    }

    public String getName() {
        return customer.getName();
    }


    public Customer getCustomer() {
        return customer;
    }

    public double getServiceExpense() { return serviceExpense; }
    public void setServiceExpense(double ex) { this.serviceExpense = ex; }

    public double getProductExpense() { return productExpense; }
    public void setProductExpense(double ex) { this.productExpense = ex; }

    public double getTotalExpense() {
        double serviceRate = 0;
        double productRate = 0;


        if (customer.isMember()) {
            String type = customer.getMemberType();
            serviceRate = DiscountRate.getServiceDiscountRate(type);
            productRate = DiscountRate.getProductDiscountRate(type);
        }

        return serviceExpense * (1 - serviceRate)
                + productExpense * (1 - productRate);
    }

    @Override
    public String toString() {
        return "Visit[" + customer + ", date=" + date
                + ", serviceExpense=" + serviceExpense
                + ", productExpense=" + productExpense + "]";
    }
}
