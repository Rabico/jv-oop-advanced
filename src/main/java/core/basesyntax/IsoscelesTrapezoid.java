package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    public IsoscelesTrapezoid(int firstBase, int secondBase, Color color){
        this.color = color;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.area = (double)firstBase * secondBase/2.0;
    }

    @Override
    public double GetArea() {
        return area;
    }

    @Override
    public String GetDraw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: square, area ")
                .append(area).append(" sp. unit, firstbase: ")
                .append(firstBase)
                .append(" , secondbase: ")
                .append(secondBase)
                .append(" units, color: ")
                .append(color);
        return builder.toString();
    }
}
