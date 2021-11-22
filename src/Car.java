public class Car extends Vehicle {
    boolean isAutomatic;
    public String bodyType;
    public String driveTrain;
    public String steeringType;

    public Car(String make, String plate, String model, int year, int mileage,
            boolean isAutomatic, String bodyType, String driveTrain, String steeringType) {
        super(make, plate, model, year, mileage);
        this.isAutomatic=isAutomatic;
        this.bodyType=bodyType;
        this.driveTrain=driveTrain;
        this.steeringType=steeringType;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getDriveTrain() {
        return driveTrain;
    }

    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }

    public String getSteeringType() {
        return steeringType;
    }

    public void setSteeringType(String steeringType) {
        this.steeringType = steeringType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "isAutomatic=" + isAutomatic +
                ", bodyType='" + bodyType + '\'' +
                ", driveTrain='" + driveTrain + '\'' +
                ", steeringType='" + steeringType + '\'' +
                '}';
    }
}
