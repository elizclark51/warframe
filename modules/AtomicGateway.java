public class AtomicCollector {
    private int state;

    public AtomicCollector(int seed) {
        this.state = seed;
    }

    public int encode(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 52) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        AtomicCollector obj = new AtomicCollector(52);
        System.out.println(obj.encode(52));
    }
}
