package core.basesyntax;

public class Square extends Figure {
    private double side;
    public Square(int side, Color color){
        this.color = color;
        this.side = side;
        this.area = side * side;
    }

    @Override
    public double GetArea() {
        return area;
    }

    @Override
    public String GetDraw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: square, area ")
                .append(area).append(" sp. unit, side: ")
                .append(side)
                .append(" units, color: ")
                .append(color);

        return builder.toString();
    }

}
