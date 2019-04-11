

public class App {

    //Array with index and wall heights
    private static final int[] wall = {2, 5, 1, 2, 3, 4, 7, 7, 6};

    public static void main(String[] args) {
        RainCounter rainCounter = new RainCounter();
        System.out.println(rainCounter.puddleMeter(wall));
    }
}

class RainCounter {

    public int puddleMeter(int[] wall) {

        int leftMax = 0;
        int counter = 0;
        int volume = 0;

        for (int index = 0; index < wall.length; index++) {
            if (wall[index] >= leftMax){
                leftMax = wall[index];
                volume = volume + counter;
                counter = 0;
            }
            else {
                counter = counter + leftMax - wall[index];
            }
        }
        return volume;
    }
}