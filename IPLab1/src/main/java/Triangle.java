public class Triangle extends Shape{
    private double base;
    private double height;

    /**
     * Metoda este constructorul clasei Triangle, setand baza si inaltimea la 0
     */
    public Triangle(){
        this.base = 0;
        this.height = 0;
    }

    /**
     * Metoda atribuie bazei, valoare privata, o noua valoare
     */
    public Triangle setBase(double base){
        this.base = base;
        return this;
    }

    /**
     * Metoda atribuie inaltimii, valoare privata, o noua valoare
     */
    public Triangle setHeight(double height){
        this.height = height;
        return this;
    }

    /**
     * Metoda calculeaza aria formei geometrice.
     */
    public void onAreaChange(){
        this.area = (height * base) / 2;
    }
}
