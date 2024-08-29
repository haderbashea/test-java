
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String deliveryAddress;
    private CustomerType customerType;
    private Double discount;
    private Set<String> favoriteItems;
    private Gift gift;

    public Customer(CustomerType customerType, String deliveryAddress, Double discount, String email, Gift gift, String firstName, int id, String lastName) {
        this.customerType = customerType;
        this.deliveryAddress = deliveryAddress;
        this.discount = discount;
        this.email = email;
        this.gift = gift;
        this.firstName = firstName;
        this.id = id;
        this.lastName = lastName;
        this.favoriteItems = new HashSet<>();
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gift getGift() {
        return gift;
    }

    public void setGift(Gift gift) {
        this.gift = gift;
    }

    public void addFavoriteItem(String item) {
        favoriteItems.add(item);
    }

    public void updateFavoriteItems(List<OrderItem> newItems) {
        for (OrderItem item : newItems) {
            favoriteItems.add(item.getItemName());
        }
    }


    public void removeFavoriteItem(String itemName) {
        favoriteItems.remove(itemName);
    }

    public void takeGift(Gift gift) {
        this.gift = gift;
    }

    public void openGift() {
        if (gift != null) {
            gift.openGift();
        } else {
            System.out.println("No gift available to open.");
        }
    }
}



