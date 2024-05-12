package commands;

public class SellCommand extends BaseCommand {
    private Long item;
    private Double price;

    public SellCommand(Long id, Long item, Double price) {
        super(id);
        this.item = item;
        this.price = price;
    }

    public Long getItem() {
        return item;
    }

    public void setItem(Long item) {
        this.item = item;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }
}
