package core.basesyntax;

public class Rectangle extends Figure {
    private double firstside;
    private double secondside;
    public Rectangle(int firstside, int secondside, Color color){
        this.color = color;
        this.firstside = firstside;
        this. secondside =  secondside;
        this.area = firstside * secondside;
    }

    @Override
    public double GetArea() {
        return area;
    }

    @Override
    public String GetDraw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: square, area ")
                .append(area).append(" sp. unit, firstside: ")
                .append(firstside)
                .append(" , secondside: ")
                .append(secondside)
                .append(" units, color: ")
                .append(color);
        return builder.toString();
    }
}
