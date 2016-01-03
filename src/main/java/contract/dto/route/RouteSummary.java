package contract.dto.route;

public class RouteSummary extends RouteIdentifier{
    private String description;

    public RouteSummary(String description, long id) {
        super(id);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
