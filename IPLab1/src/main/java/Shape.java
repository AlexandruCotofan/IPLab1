public abstract class Shape {
    public double area;

    /**
     * Metoda e constructorul clasei, initializand-o prin setarea ariei la 0
     */
    public Shape(){
        area = 0;
    }

    /**
     * Metoda returneaza aria calculata a formei geometrice
     */
    public double getArea(){
        return this.area;
    }

    /**
     *  Metoda abstracta: implementarea ei este in fiecare subclasa
     */
    public abstract void onAreaChange();
}
