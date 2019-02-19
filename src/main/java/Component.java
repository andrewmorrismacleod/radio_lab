public abstract class Component {

    protected int volume;
    protected String quality;



    public Component(){
        this.volume = 10;
        this.quality = "stereo";
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



}
