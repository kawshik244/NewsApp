public class Example1 {
    float headNum;
    String Heading;
    int price;
    char p;
    String mod;

    public Example1(float headNum, String heading, int price, char p, String mod) {
        this.headNum = headNum;
        Heading = heading;
        this.price = price;
        this.p = p;
        this.mod = mod;
    }

    public float getHeadNum() {
        return headNum;
    }

    public void setHeadNum(float headNum) {
        this.headNum = headNum;
    }

    public String getHeading() {
        return Heading;
    }

    public void setHeading(String heading) {
        Heading = heading;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public char getP() {
        return p;
    }

    public void setP(char p) {
        this.p = p;
    }

    public String getMod() {
        return mod;
    }

    public void setMod(String mod) {
        this.mod = mod;
    }
}
