public enum Camisa {
    CAMISA1(1, "Camisa manga corta", 190f),
    CAMISA2(2, "camisa casual manga larga", 230f),
    CAMISA3(3, "camisa formal managa larga", 310f);

    private final int id;
    private String description;
    private Float price;

    Camisa(int id, String description, Float price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Camisa{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
