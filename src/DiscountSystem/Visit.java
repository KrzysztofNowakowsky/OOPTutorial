package DiscountSystem;

import java.sql.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    Visit(String name, Date date){
        date = new Date()
        customer = new Customer(name)
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense
    {
        return productExpense + serviceExpense;
    }

    public String toString() {
        return "Visit=["
                + this.customer.toString()
                + ",date="
                + this.date
                + ",serviceExpense="
                + this.serviceExpense
                + ",productExpense="
                + this.productExpense;
    };
}
