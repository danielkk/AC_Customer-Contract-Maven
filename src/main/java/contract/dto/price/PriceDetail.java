package contract.dto.price;

public class PriceDetail extends PriceIdentifier{
    private String passengerType;
    private int numberOfPassengers;
    private double price;

    public PriceDetail(long id, String passengerType, int numberOfPassengers, double price) {
        super(id);
        this.passengerType = passengerType;
        this.numberOfPassengers = numberOfPassengers;
        this.price = price;
    }

    public String getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(String passengerType) {
        this.passengerType = passengerType;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
