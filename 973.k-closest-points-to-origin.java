import java.util.*;

/*
 * @lc app=leetcode id=973 lang=java
 *
 * [973] K Closest Points to Origin
 */

// @lc code=start
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> pq = new PriorityQueue<>();
        int[][] kPoints = new int[k][2];

        for (int i = 0; i < points.length; i++) {
            pq.add(new Point(points[i][0], points[i][1]));
        }

        for (int i = 0; i < k; i++) {
            Point p = pq.poll();
            kPoints[i][0] = p.x;
            kPoints[i][1] = p.y;
        }
        return kPoints;
    }
}

class Point implements Comparable<Point> {
    int x;
    int y;
    double distance;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.distance = getDistance();
    }

    public double getDistance() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public int compareTo(Point p) {
        if (distance > p.distance) {
            return 1;
        } else if (distance == p.distance) {
            return 0;
        } else {
            return -1;
        }
    }
}
// @lc code=end
