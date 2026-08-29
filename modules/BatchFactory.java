public class SimpleCache {
    private int state;

    public SimpleCache(int seed) {
        this.state = seed;
    }

    public int decode(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 33) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        SimpleCache obj = new SimpleCache(33);
        System.out.println(obj.decode(33));
    }
}
