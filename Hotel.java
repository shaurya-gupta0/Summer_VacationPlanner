public class Hotel {
    private String name;
    private double costPerNight;

    public Hotel(String name, double costPerNight) {
        this.name = name;
        this.costPerNight = costPerNight;
    }

    public String getName() {
        return name;
    }

    public double getCostPerNight() {
        return costPerNight;
    }

    public double getTotalHotelCost(int days) {
        return costPerNight * days;
    }

    public String toString() {
        return name + " ($" + costPerNight + " per night)";
    }
}
