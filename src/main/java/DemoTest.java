import redis.clients.jedis.Jedis;

public class DemoTest {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.79.78",6379);
        jedis.auth("kala112003");
        String ping = jedis.ping();
        System.out.println(ping);
        System.out.println(ping);
        System.out.println(ping);
        System.out.println(ping);
        System.out.println("master");
        System.out.println("x1");
        System.out.println("hahaha");
        System.out.println("hahaha2222");
        System.out.println("2021年10月10日10:55:55");
    }

    private Jedis jedis;
}
