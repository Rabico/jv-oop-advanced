package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private double secondside;
    public Circle(int radius, Color color){
        this.color = color;
        this.radius = radius;
         this.area = radius * radius * Math.PI ;
    }

    @Override
    public double GetArea() {
        return area;
    }

    @Override
    public String GetDraw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: circle, area ")
                .append(area).append(" sp. unit, firstside: ")
                .append(radius)
                .append(" units, color: ")
                .append(color);
        return builder.toString();
    }
}
