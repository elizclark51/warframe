public class LiteManager {
    private int state;

    public LiteManager(int seed) {
        this.state = seed;
    }

    public int resolve(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 20) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        LiteManager obj = new LiteManager(20);
        System.out.println(obj.resolve(20));
    }
}
