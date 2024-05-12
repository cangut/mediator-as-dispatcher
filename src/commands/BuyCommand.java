package commands;

public class BuyCommand extends BaseCommand {
    private Long productType;
    private Double price;

    public BuyCommand(Long id, Long productType, Double price) {
        super(id);
        this.productType = productType;
        this.price = price;
    }

    public Long getProductType() {
        return productType;
    }

    public void setProductType(Long productType) {
        this.productType = productType;
    }

    public Double getPrice() {
        return price;
    }

    public void setAmount(Double price) {
        this.price = price;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
