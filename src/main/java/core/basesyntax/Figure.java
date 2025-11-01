package core.basesyntax;

public abstract class Figure implements Behavior {
    protected Color color;

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String getDraw() {
        return "";
    }
}
