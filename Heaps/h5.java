import java.util.PriorityQueue;

public class h5 {
    static class Row implements Comparable<Row> {
        int soilders;
        int i;

        public Row(int soilders, int i) {
            this.soilders = soilders;
            this.i = i;
        }

        public int compareTo(Row r2) {
            if (this.soilders == r2.soilders) {
                return this.i - r2.i;
            } else {
                return this.soilders - r2.soilders;
            }
        }
    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 0, 0, 0 }, { 1, 1, 1, 1 }, { 1, 0, 0, 0 }, { 1, 0, 0, 0 } };
        int k = 2;
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            pq.add(new Row(count, i));
        }
        for (int i = 0; i < k; i++) {
            System.out.println("ROW" + pq.remove().i);
        }
    }
}