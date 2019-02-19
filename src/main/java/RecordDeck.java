public class RecordDeck extends Component {

    private int playSpeed;


    public RecordDeck(String make, String model){
        super(make, model);
        this.playSpeed = 75;
    }

    public int getPlaySpeed() {
        return playSpeed;
    }

    public void setPlaySpeed(int speed){
        this.playSpeed = speed;
    }


}
