public class mp3Player extends Component implements IConnect {

    public mp3Player(String make, String model){
        super(make, model);
    }


    @Override
    public String connect(Stereo stereo){
        return stereo.getName();
    }
}
