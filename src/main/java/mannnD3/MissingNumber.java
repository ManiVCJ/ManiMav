package mannnD3;

import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] sender, int[] recever) {
        Arrays.sort(sender);
        Arrays.sort(recever);
        for (int i = 0; i < sender.length - 1; i++) {
            if (sender[i] != recever[i]) {
                return sender[i];
            }
        }

        return sender[sender.length - 1];
    }
}
