// Balls型
public class Balls {
    int balls;
    public Balls(int balls) {
        this.balls = balls;
    }
    public Balls() { 
        this.balls = 0;
    }
    public void add(int a) {
        this.balls += a;
    }
    public void decrement() {
        this.balls --;
    }
    public boolean compare(int cmp) {
        if (this.balls > cmp) {
            return true;
        }else {
            return false;
        }
    }
    public String toString() {
        return String.valueOf(this.balls);
    }
}