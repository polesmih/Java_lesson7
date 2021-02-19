package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Еды в тарелке: " + food);
    }

    public int getFood() {
        return food;
    }

    // Task 6.
    public void putFood(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite) {
        if (appetite < food)
            food -= appetite;
    }
}
