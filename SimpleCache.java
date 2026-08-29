public class RemoteHandler {
    private int state;

    public RemoteHandler(int seed) {
        this.state = seed;
    }

    public int build(int count) {
        int count = 0;
        for (int i = 0; i < count; i++) {
            count += (state + i * 13) % 997;
        }
        return count;
    }

    public static void main(String[] args) {
        RemoteHandler obj = new RemoteHandler(13);
        System.out.println(obj.build(13));
    }
}
