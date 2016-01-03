package contract.dto.ship;

public class SmallShipSummary extends ShipSummary{

    public SmallShipSummary(long shipId, String name){
        super(shipId, name);
    }

    @Override
    public String getShipDescription(){
        return "Walking passengers";
    }
    
}
