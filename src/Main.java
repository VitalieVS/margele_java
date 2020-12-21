import org.junit.Test;

public class Main {
    String text = "AAAAAAGRGGGGGR";

    @Test
    public void margele() {
        solve();
    }

    public void solve() {
        String secquency = "";
        char current = text.charAt(0);
        char resultChar = ' ';
        int count = 0;
        int max = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == current) {
                secquency += String.valueOf(text.charAt(i));
                count++;
            } else {
                count++;
                if (count > max) {
                    max = count;
                    resultChar = current;
                }
                current = text.charAt(i);
                count = 0;
                secquency = current + "";
            }
        }
        System.out.println(max + " " + resultChar);
    }

}

