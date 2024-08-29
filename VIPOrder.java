import java.util.List;

public class VIPOrder extends Order{
    public VIPOrder(Customer customer, String deliveryAddress, int id, List<OrderItem> items, String name, String orderDate, PaymentType paymentType) {
        super(customer, deliveryAddress, id, items, name, orderDate, paymentType);
        if (customer.getCustomerType() != CustomerType.VIP) {
            throw new IllegalArgumentException("Customer is not a VIP but placed a VIP order!");
        }
        setTotalPrice(calculateTotalPrice()); // Calculate and set the total price
    }

    @Override
    protected double calculateTotalPrice() {
        double originalPrice = getItems().stream().mapToDouble(OrderItem::getItemPrice).sum();
        return originalPrice * (1 - getCustomer().getDiscount());
    }
}
