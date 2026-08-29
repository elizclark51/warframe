public class BatchCache {
    private int state;

    public BatchCache(int seed) {
        this.state = seed;
    }

    public int flush(int count) {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += (state + i * 44) % 997;
        }
        return result;
    }

    public static void main(String[] args) {
        BatchCache obj = new BatchCache(44);
        System.out.println(obj.flush(44));
    }
}
