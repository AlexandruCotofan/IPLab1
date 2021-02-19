public class Rectangle extends Shape{
    private double height;
    private double width;

    /**
     * Metoda este constructorul clasei Rectangle, setand inaltimea si latimea la 0
     */
    public Rectangle(){
        this.height = 0;
        this.width = 0;
    }

    /**
     * Metoda atribuie inaltimii, valoare privata, o noua valoare
     */
    public Rectangle setHeight(double height){
        this.height = height;
        return this;
    }

    /**
     * Metoda atribuie latimii, valoare privata, o noua valoare
     */
    public Rectangle setWidth(double width){
        this.width = width;
        return this;
    }

    /**
     * Metoda calculeaza aria formei geometrice.
     */
    public void onAreaChange(){
        this.area = height * width;
    }
}
