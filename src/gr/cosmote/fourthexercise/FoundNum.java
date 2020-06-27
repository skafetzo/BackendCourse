package gr.cosmote.fourthexercise;

public class FoundNum {
    private int num;
    private int numOfDivisors;

    public FoundNum(int num, int numOfDivisors) {
        this.num = num;
        this.numOfDivisors = numOfDivisors;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNumOfDivisors() {
        return numOfDivisors;
    }

    public void setNumOfDivisors(int numOfDivisors) {
        this.numOfDivisors = numOfDivisors;
    }
}
