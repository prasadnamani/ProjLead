//$Id$
package jedis;

import redis.clients.jedis.Jedis;

public class JedisMain {
	public static void main(String[] args) {
		try {
			Jedis jedis=new Jedis("localhost");
			System.out.println(jedis.get("age"));
		}
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
		
	}

}
