//Example for Composition of "HAS A" Relationship in Abstraction
class Battery{
    public void powersupply(){
        System.out.println("Still has 7% power");
    }
}

class Remote{
    Battery miniBattery;// HAS A relationship
    Remote(){
        miniBattery = new Battery();
    }
    public void changeChannel(){
        miniBattery.powersupply();
        System.out.println("Channel Changed");
    }
    public void changeVolume(){
        System.out.println("Volume Changed");
    }
}
class Tv{
    Remote tvRemote;
    Tv(Remote tvRemote){
        this.tvRemote = tvRemote;
    }
    public void increaseVolume(){
        tvRemote.changeVolume();
    }
}
public class Relationship {
    public static void main(String[] args){
        Remote sonyRemote = new Remote();
        Tv sony = new Tv(sonyRemote);
        sony.increaseVolume();
        //Remote tvRemote = new Remote();
        //tvRemote.changeChannel();
    }
}
