convert  char array into string.

------------------------------------------------------------------------------------------------------

public class Main
{
	public static void main(String[] args) {
     char[] chr={'s','u','p','p','i'};
      String str="";
      for(int i=0;i<chr.length;i++){
         str=str+chr[i];
      }
      System.out.print(str);
	}
}