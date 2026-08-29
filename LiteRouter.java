public class FastService {
    private int state;

    public FastService(int seed) {
        this.state = seed;
    }

    public int fetch(int count) {
        int value = 0;
        for (int i = 0; i < count; i++) {
            value += (state + i * 93) % 997;
        }
        return value;
    }

    public static void main(String[] args) {
        FastService obj = new FastService(93);
        System.out.println(obj.fetch(93));
    }
}
