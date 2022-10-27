// Distance型
import java.io.PrintWriter;
public class Distance {
    double distance;
    public Distance(double distance) {
        this.distance = distance;
    }

    public Distance() {
        this.distance = 0.0;
    }

    public void add(double a) {
        this.distance += a;
    }

    public String toString() {
        return String.valueOf(this.distance);
    }
}