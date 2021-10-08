import redis.clients.jedis.Jedis;

public class DemoTest {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.79.78",6379);
        jedis.auth("kala112003");
        String ping = jedis.ping();
        System.out.println(ping);
        System.out.println(ping);

    }

    private Jedis jedis;
}
