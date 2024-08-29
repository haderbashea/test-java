import java.util.List;

public abstract class Order {
    private int id;
    private String name;
    private String deliveryAddress;
    private List<OrderItem> items;
    private Customer customer;
    private double totalPrice;
    private PaymentType paymentType;
    private String orderDate;

    public Order(Customer customer, String deliveryAddress, int id, List<OrderItem> items, String name, String orderDate, PaymentType paymentType) {
        this.customer = customer;
        this.deliveryAddress = deliveryAddress;
        this.id = id;
        this.items = items;
        this.name = name;
        this.orderDate = orderDate;
        this.paymentType = paymentType;
        this.totalPrice = calculateTotalPrice();
        updateCustomerFavorites();
    }


    protected abstract double calculateTotalPrice();


    private void updateCustomerFavorites() {
        if (customer != null && items != null) {
            for (OrderItem item : items) {
                customer.addFavoriteItem(item.getItemName());
            }
        }
    }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }
    public String getDeliveryAddress() { return deliveryAddress; }
    public void setDeliveryAddress(String deliveryAddress) { this.deliveryAddress = deliveryAddress; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public List<OrderItem> getItems() { return items; }
    public void setItems(List<OrderItem> items) { this.items = items; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getOrderDate() { return orderDate; }
    public void setOrderDate(String orderDate) { this.orderDate = orderDate; }
    public PaymentType getPaymentType() { return paymentType; }
    public void setPaymentType(PaymentType paymentType) { this.paymentType = paymentType; }
    public double getTotalPrice() { return totalPrice; }
    public void setTotalPrice(double totalPrice) { this.totalPrice = totalPrice; }
}
