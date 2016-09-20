 
 public class solution2{
    public static void main(String args[]) {
 
System.out.println(solution2.maxBlock("hello"));
  }
 public static int maxBlock(String str) {
    int maxCounter = 1;
    int counter = 1;

    if (str.length() == 0) {
        return 0;
    }
    for (int i = 1; i < str.length()-1; i++) {
        if (str.charAt(i - 1) == str.charAt(i)) {
            counter++;
        } else {
            // end of a run
            if (counter > maxCounter) {
                maxCounter = counter;
            }

            counter = 1;
        }

    }

    return Math.max(maxCounter, counter);
 }
}

