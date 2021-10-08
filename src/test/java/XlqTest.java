import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

import java.util.Set;

public class XlqTest {

    private Jedis jedis;
    @BeforeEach
    public void connectRedis() {
        jedis = new Jedis("192.168.79.78",6379);
        jedis.auth("kala112003");
        String ping = jedis.ping();
        System.out.println(ping+".............................");
    }

    @Test
    public void test1() {
        String name = jedis.get("name");
        System.out.println(name);
        Set<String> keys = jedis.keys("*");
        for (String key : keys) {
            System.out.println(key);
        }
        String user = jedis.set("user", "name:xlq");
        System.out.println(user);
        String user1 = jedis.get("user");
        System.out.println(user1);
    }
}
