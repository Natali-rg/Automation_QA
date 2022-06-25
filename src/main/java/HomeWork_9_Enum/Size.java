package HomeWork_9_Enum;

public enum Size {
    SMALL("S",10,38), MEDIUM("M",12,40)
    , LARGE("L",14,42), EXTRA_lARGE("XL",16,44);
    private String name;
    private int width;
    private int length;

    Size(String name, int width, int length) {
        this.name=name;
        this.width = width;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }


    @Override
    public String toString() {
        return getName()+" or "+super.toString()+" size: width="+getWidth()+" length="+getLength();
    }
}
