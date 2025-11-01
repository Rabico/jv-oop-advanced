package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Behavior[] figures = new Behavior[6];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int j = figures.length / 2; j < figures.length; j++) {
            figures[j] = figureSupplier.getDefaultFigure();
        }
        for (Behavior figure : figures) {
            System.out.println(figure.getDraw());
        }
    }
}
