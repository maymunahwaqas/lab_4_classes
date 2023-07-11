public class Rectangle {

    private int length;
    private int  width;
    private int area;
    private boolean isSquare = false;

    public Rectangle(int inputwidth, int inputlength){
        this.width = inputwidth;
        this.length = inputlength;
        this.isSquare = false;

    }

    public int areaCalculator(){
        area = this.length * this.width;
        return area;
    }

    public boolean isSquare(){
        if (length== width) { // note do shift 9 once highlighted text you want to bracket
            isSquare = true;
        }
        return isSquare;
    }
    public int getWidth(){
        return this.width;
    }

}
