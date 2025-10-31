package core.basesyntax;

public class RightTriangle extends Figure{
    private double firstLeg;
    private double secondLeg;
    public RightTriangle(int firstLeg, int secondLeg, Color color){
        this.color = color;
        this.firstLeg = firstLeg;
        this. secondLeg =  secondLeg;
        this.area = (double)(firstLeg * secondLeg)/2.0;
    }

    @Override
    public double GetArea() {
        return area;
    }

    @Override
    public String GetDraw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: Triangle, area ")
                .append(area).append(" sp. unit, firstleg: ")
                .append(firstLeg)
                .append(" , secondleg: ")
                .append(secondLeg)
                .append(" units, color: ")
                .append(color);
        return builder.toString();
    }

}
