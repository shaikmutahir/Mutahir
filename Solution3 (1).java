 import java.util.*;
 import java.util.regex.*;
 public class Solution3 {
   int count =0;
   String str=new String();
   /*public Solution3(String s)
   this.str=s;
   */
      public boolean containsE(String s)
      {
			boolean b;
			//Pattern p=new Pattern("e");
			System.out.println(""+s);
			b=Pattern.matches("(.*)e(.*)|(.*)ee(.*)",s);
			System.out.println(""+b);
			return b;
      }
     }
