package contract.dto.ship;

public class MediumShipSummary extends ShipSummary{

    public MediumShipSummary(long shipId, String name){
        super(shipId, name);
    }

    @Override
    public String getShipDescription(){
        return "Walking passengers, Small cars";
    }
    
}
