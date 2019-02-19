public abstract class Component {

    protected int volume;
    protected String quality;
    protected String make;
    protected String model;



    public Component(String make, String model){
        this.volume = 10;
        this.quality = "stereo";
        this.make = make;
        this.model = model;
    }

    public void changeVolume(int increase){
        this.volume += increase;
    }

    public void setQuality(String quality){
        this.quality = quality;
    }

    public int getVolume() {
        return volume;
    }

    public String getQuality() {
        return quality;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
