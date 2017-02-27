package ProxyPattern;

/**
 * Created by Xiaojun YU on 2017-02-27.
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
    @Override
    public void display() {
        System.out.println("Dispalying" + fileName);
    }

    private  void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
