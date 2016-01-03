package contract.dto.ship;

import java.util.Date;

public class MediumShipDetail extends ShipDetail{
    
    private int carCapacity;

    public MediumShipDetail(long shipId, int passengerCapacity, String name, Date lastMaintenance, int carCapacity) {
        super(shipId, passengerCapacity, name, lastMaintenance);
        this.carCapacity = carCapacity;
    }

    @Override
    public String getShipDescription() {
        return "Walking passengers, Small cars";
    }

    public int getCarCapacity() {
        return carCapacity;
    }

    public void setCarCapacity(int carCapacity) {
        this.carCapacity = carCapacity;
    }
}
