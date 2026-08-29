public class BatchBuffer {
    private int state;

    public BatchBuffer(int seed) {
        this.state = seed;
    }

    public int decode(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 83) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        BatchBuffer obj = new BatchBuffer(83);
        System.out.println(obj.decode(83));
    }
}
