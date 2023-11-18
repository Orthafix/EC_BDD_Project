package common;

public class Calculator {

    private int first;
    private int second;
    private int result;

    public Calculator(int first, int second)
    {
        this.first = first;
        this.second = second;
    }

    public void add(){
        this.result = this.first + this.second;
    }

    public void subtract(){
        this.result = this.first - this.second;
    }

    public int getResult()
    {
        return this.result;
    }
}
