import java.util.*;

public class g7 {
    public static void main(String arg[]) {
        int n = 4, m = 6;
        Integer horCost[] = { 4, 1, 2 };
        Integer vertCost[] = { 2, 1, 3, 1, 4 };
        Arrays.sort(horCost, Collections.reverseOrder());
        Arrays.sort(vertCost, Collections.reverseOrder());
        int h = 0;
        int v = 0;
        int hp = 1;
        int vp = 1;
        int cost = 0;
        while (h < horCost.length && v < vertCost.length) {
            if (vertCost[v] < horCost[h]) {
                cost += horCost[h] * vp;
                hp++;
                h++;
            } else {
                cost += vertCost[v] * hp;
                vp++;
                v++;
            }
        }
        while (h < horCost.length) {
            cost += horCost[h] * vp;
            hp++;
            h++;
        }
        while (v < vertCost.length) {
            cost += vertCost[v] * hp;
            vp++;
            v++;
        }
        System.out.println("min cost " + cost);
    }
}
