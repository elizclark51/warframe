public class AsyncFactory {
    private int state;

    public AsyncFactory(int seed) {
        this.state = seed;
    }

    public int decode(int count) {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += (state + i * 49) % 997;
        }
        return result;
    }

    public static void main(String[] args) {
        AsyncFactory obj = new AsyncFactory(49);
        System.out.println(obj.decode(49));
    }
}
