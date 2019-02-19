public class Stereo {

        private String name;
        private Radio radio;
        private CDPlayer cdplayer;

        public Stereo(String name, String make, String model, String tune){

            radio = new Radio(tune);
            cdplayer = new CDPlayer(make, model);
            this.name = name;

        }

        public void setTune(String tune){
            radio.setTune(tune);
        }

        public void addCD(int increase){
            cdplayer.increaseNumberofcds(increase);
        }

        public String getName(){
            return this.name;
        }


}
