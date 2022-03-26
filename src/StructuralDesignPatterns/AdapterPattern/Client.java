package StructuralDesignPatterns.AdapterPattern;

public class Client {
    public static void main(String[] args) {
        Figures figures = new Figures("XML");
        GraphsAdapter graphsAdapter = new GraphsAdapter();
        figures.setGraphs(graphsAdapter);
        figures.showFig();
    }
}
