public class Circle extends Shape{
    private double radius;
    private double pi = 3.14159;

    /**
     * Metoda este constructorul clasei Circle, setand raza la 0
     */
    public Circle(){
        this.radius = 0;
    }

    /**
     * Metoda atribuie razei, valoare privata, o noua valoare
     */
    public Circle setRadius(double radius){
        this.radius = radius;
        return this;
    }

    /**
     * Metoda calculeaza aria formei geometrice.
     */
    public void onAreaChange() {
        this.area = pi * radius * radius;
    }
}
