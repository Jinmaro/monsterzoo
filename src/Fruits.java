// Fruits型
public class Fruits {
    int fruits;
    public Fruits(int fruits) {
        this.fruits = fruits;
    }
    public Fruits() {
        this.fruits = 0;
    }
    public void add(int a) {
        this.fruits += a;
    }
    public boolean compare(int cmp) {
        if (this.fruits > cmp) {
            return true;
        }else {
            return false;
        }
    }
    public void decrement() {
        this.fruits --;
    }

    public String toString() {
        return String.valueOf(this.fruits);
    }
}