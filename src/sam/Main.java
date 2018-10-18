
package sam;

import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;

public class Main {

		public static void main(String [] args) {
				BigInteger base = new BigInteger("113");
				BigInteger exponent = new BigInteger("12456");
		
				
				
				Instant s = Instant.now();
				BigInteger k = mod(base,exponent);
				
				Instant e = Instant.now();
				
				
				Duration d = Duration.between(s, e);
				Instant s1 = Instant.now();
				BigInteger l =  base.pow(12456);
				Instant e1 = Instant.now();
				Duration d1 = Duration.between(s1, e1);
				
				System.out.println(k);
				System.out.format(" biginteger's: %02dh:%02dm:%02ds.%04dms ", d1.toHours(), d1.toMinutes(), d1.getSeconds(), d1.toMillis());
				System.out.println();
			

				System.out.println("Bit Length : " + k.toString(2).length());
				System.out.format("our's: %02dh:%02dm:%02ds.%04dms ", d.toHours(), d.toMinutes(), d.getSeconds(), d.toMillis());
				System.out.println();
		}
		
		public static BigInteger mod(BigInteger base, BigInteger exponent) {
			String exponentBits = exponent.toString(2);
			BigInteger res = new BigInteger(base.toString());
	
			for (int i = 1; i < exponentBits.length(); i++) {
				res = res.multiply(res) ;
				if(exponentBits.charAt(i) == '1' ) {
					res = res.multiply(base);
				
				}
			
			}
			return res;
		}
}
