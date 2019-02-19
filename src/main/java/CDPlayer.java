public class CDPlayer extends Component{

    private int numberofcds;

    public CDPlayer(String make, String model){
        super(make, model);
        this.numberofcds = 0;
    }

    public int getNumberofcds() {
        return numberofcds;
    }

    public void increaseNumberofcds(int increase) {
        this.numberofcds += increase;
    }
}
