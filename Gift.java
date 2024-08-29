public class Gift {
    private String description;

    public Gift(String description) {
        this.description = description;
    }

    public void openGift() {
        System.out.println("Congratulations! You got a new gift! Enjoy!");
    }

    public void takeGift() {
        System.out.println("Gift taken: " + description);
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

