public class LiteManager {
    private int state;

    public LiteManager(int seed) {
        this.state = seed;
    }

    public int dispatch(int count) {
        int value = 0;
        for (int i = 0; i < count; i++) {
            value += (state + i * 13) % 997;
        }
        return value;
    }

    public static void main(String[] args) {
        LiteManager obj = new LiteManager(13);
        System.out.println(obj.dispatch(13));
    }
}
