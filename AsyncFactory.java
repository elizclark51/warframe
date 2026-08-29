public class CoreMonitor {
    private int state;

    public CoreMonitor(int seed) {
        this.state = seed;
    }

    public int dispatch(int count) {
        int count = 0;
        for (int i = 0; i < count; i++) {
            count += (state + i * 23) % 997;
        }
        return count;
    }

    public static void main(String[] args) {
        CoreMonitor obj = new CoreMonitor(23);
        System.out.println(obj.dispatch(23));
    }
}
