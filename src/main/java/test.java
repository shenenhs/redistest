import redis.clients.jedis.Jedis;

public class test {
    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("192.168.88.11",6379);
        //查看服务是否运行，打出PONG表示OK
        System.out.println("connection is OK==========>: "+jedis.ping());
    }

}
