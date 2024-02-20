class Plate {
    int length;
    int width;

    public Plate(int l, int w) {
        length = l;
        width = w;
        System.out.println("Plate constructor");
    }
}

class Box extends Plate {
    int height;

    public Box(int l, int w, int h) {
        super(l, w);
        height = h;
        System.out.println("Box constructor");
    }
}

class WoodBox extends Box {
    int thickness;

    public WoodBox(int l, int w, int h, int t) {
        super(l, w, h);
        thickness = t;
        System.out.println("WoodBox constructor");
    }
}

public class lab_7_2{
    public static void main(String[] args) {
        WoodBox wb = new WoodBox(10, 10, 10, 2);
        System.out.println("Dimensions: " + wb.length + " x " + wb.width + " x " + wb.height + " x " + wb.thickness);
    }
}