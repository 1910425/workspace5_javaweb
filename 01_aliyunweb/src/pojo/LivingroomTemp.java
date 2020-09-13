package pojo;

public class LivingroomTemp {
    private float temp;
    private float humidity;
    private String location;
    private float pressure;

    public LivingroomTemp() {
    }

    public LivingroomTemp(float temp, float humidity, String location, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.location = location;
        this.pressure = pressure;
    }


    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "LivingroomTemp{" +
                "temp=" + temp +
                ", humidity=" + humidity +
                ", location='" + location + '\'' +
                ", pressure=" + pressure +
                '}';
    }
}
