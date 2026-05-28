public class Destination {
    private String name;
    private String description;
    private double travelCost;

    public Destination(String name, String description, double travelCost) {
        this.name = name;
        this.description = description;
        this.travelCost = travelCost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getTravelCost() {
        return travelCost;
    }

    public String toString() {
        return name + " - " + description + " Travel Cost: $" + travelCost;
    }
}
