package contract.dto.ship;

import java.util.Date;

public class SmallShipDetail extends ShipDetail{
    
    public SmallShipDetail(long shipId, int passengerCapacity, String name, Date lastMaintenance) {
        super(shipId, passengerCapacity, name, lastMaintenance);
    }

    @Override
    public String getShipDescription() {
        return "Walking passengers";
    }
    
}
