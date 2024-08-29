import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating some order items
        OrderItem item1 = new OrderItem(1, "Pizza", 10.0);
        OrderItem item2 = new OrderItem(2, "Pasta", 15.0);
        OrderItem item3 = new OrderItem(3, "Burger", 8.0);

        // Creating a regular customer
        Customer regularCustomer = new Customer(CustomerType.REGULAR,"haifa",null,
                "hader@gmail.com",null,"hader",2535,"bashea");
        // Creating a VIP customer
        Customer vipCustomer = new Customer(CustomerType.VIP,"tel-aviv",0.10,
                "nour@gmail.com",null,"nour",9861,"bashea");
        // Creating orders
        List<OrderItem> orderItems1 = new ArrayList<>();
        orderItems1.add(item1);
        orderItems1.add(item2);

        Order regularOrder = new RegularOrder(regularCustomer,"haifa",
                5588,orderItems1,"order1","29-08-2024",PaymentType.CREDIT_CARD);

        List<OrderItem> orderItems2 = new ArrayList<>();
        orderItems2.add(item1);
        orderItems2.add(item3);

        Order vipOrder = new VIPOrder(vipCustomer,"tel-aviv",4545,orderItems2,
                "order2","29-08-2024",PaymentType.CASH);
        // Output details of the orders
        System.out.println("Regular Order Total Price: " + regularOrder.getTotalPrice());
        System.out.println("VIP Order Total Price: " + vipOrder.getTotalPrice());

        // Adding a gift to a customer
        Gift gift = new Gift("Surprise Gift");
        vipCustomer.takeGift(gift);

        // Opening the gift
        vipCustomer.openGift();

    }}