public class SmartCache {
    private int state;

    public SmartCache(int seed) {
        this.state = seed;
    }

    public int render(int count) {
        int count = 0;
        for (int i = 0; i < count; i++) {
            count += (state + i * 51) % 997;
        }
        return count;
    }

    public static void main(String[] args) {
        SmartCache obj = new SmartCache(51);
        System.out.println(obj.render(51));
    }
}
