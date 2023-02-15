package interfaces.example2;

class Calculator implements Calculatable {
    int first, second, thrid;
    public void setOprands(int first, int second, int thrid) {
        this.first = first;
        this.second = second;
        this.thrid = thrid;
    }
    public int sum() {
        return this.first + this.second + this.thrid;
    }
    public int avg() {
        return (this.first + this.second + this.thrid) / 3;
    }
}
