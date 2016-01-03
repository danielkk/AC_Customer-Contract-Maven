package contract.dto.departure;

public class DepartureIdentifier {
    private final long id;
    
    public DepartureIdentifier(long id){
        this.id = id;
    }
    
    public long getId(){
        return id;
    }
}
