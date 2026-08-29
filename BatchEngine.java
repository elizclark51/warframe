public class SimpleFactory {
    private int state;

    public SimpleFactory(int seed) {
        this.state = seed;
    }

    public int resolve(int count) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += (state + i * 77) % 997;
        }
        return total;
    }

    public static void main(String[] args) {
        SimpleFactory obj = new SimpleFactory(77);
        System.out.println(obj.resolve(77));
    }
}
