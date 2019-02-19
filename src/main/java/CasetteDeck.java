public class CasetteDeck extends Component {

    private boolean writeprotected;

    public CasetteDeck(String make, String model){
        super(make, model);
        this.writeprotected = false;
    }

    public boolean isWriteprotected() {
        return this.writeprotected;
    }

    public void setWriteProtect(Boolean newwriteprotect){
        this.writeprotected = newwriteprotect;
    }
}
