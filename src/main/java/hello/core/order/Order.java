package hello.core.order;

public class Order {

    private Long memberId;
    private String iTemName;
    private int itemPrice;
    private int discountPrice;

    public Order(Long memberId, String iTemName, int itemPrice, int discountPrice) {
        this.memberId = memberId;
        this.iTemName = iTemName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }


    public int calculatePrice() {
        return itemPrice - discountPrice;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getiTemName() {
        return iTemName;
    }

    public void setiTemName(String iTemName) {
        this.iTemName = iTemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", iTemName='" + iTemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
