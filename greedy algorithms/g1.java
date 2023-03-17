import java.util.*;

public class g1 {
    public static void main(String args[]) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int MaxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        MaxAct = 1;
        ans.add(activities[0][0]);
        int LastEnd = activities[0][2];
        for (int i = 1; i < activities.length; i++) {
            if (activities[i][1] >= LastEnd) {
                MaxAct++;
                ans.add(activities[i][0]);
                LastEnd = activities[i][2];
            }
        }
        System.out.println("Max activities " + MaxAct);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}