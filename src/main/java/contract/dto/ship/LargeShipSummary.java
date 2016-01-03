package contract.dto.ship;

import java.util.Date;

public class LargeShipSummary extends ShipSummary{

    public LargeShipSummary(long shipId, String name){
        super(shipId, name);
    }

    @Override
    public String getShipDescription(){
        return "Walking passengers, Small cars, Large vehicles, Changeable deck";
    }
}
