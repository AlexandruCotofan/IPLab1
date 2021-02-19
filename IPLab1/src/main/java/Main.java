public class Main {
    public static void main(String[] args) {
        Triangle triunghi1 = new Triangle();
        Triangle triunghi2 = new Triangle();

        Circle cerc = new Circle();

        Rectangle dreptunghi = new Rectangle();

        triunghi1.setBase(3.5);
        triunghi1.setHeight(4);
        triunghi1.onAreaChange();
        double arieTriunghi1 = triunghi1.getArea();
        System.out.println("Arie triunghi1 = " + arieTriunghi1);

        triunghi2.setBase(5);
        triunghi2.setHeight(10);
        triunghi2.onAreaChange();
        double arieTriunghi2 = triunghi2.getArea();
        System.out.println("Arie triunghi2 = " + arieTriunghi2);

        cerc.setRadius(5);
        cerc.onAreaChange();
        double arieCerc = cerc.getArea();
        System.out.println("Arie cerc = " + arieCerc);

        dreptunghi.setHeight(12);
        dreptunghi.setWidth(4.5);
        dreptunghi.onAreaChange();
        double arieDreptunghi = dreptunghi.getArea();
        System.out.println("Arie dreptunghi = " + arieDreptunghi);
    }
}
