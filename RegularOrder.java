import java.util.List;

public class RegularOrder extends Order{
    public RegularOrder(Customer customer, String deliveryAddress, int id, List<OrderItem> items, String name, String orderDate, PaymentType paymentType) {
        super(customer, deliveryAddress, id, items, name, orderDate, paymentType); // Pass the items list directly
    }

    @Override
    protected double calculateTotalPrice() {
        return getItems().stream().mapToDouble(OrderItem::getItemPrice).sum();
    }
}


