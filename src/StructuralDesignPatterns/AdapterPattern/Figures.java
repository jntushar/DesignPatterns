package StructuralDesignPatterns.AdapterPattern;

public class Figures {

    private Graphs graphs;
    private String file;

    Figures(String file){
        this.file = file;
    }

    public Graphs getGraphs() {
        return graphs;
    }

    public void setGraphs(Graphs graphs) {
        this.graphs = graphs;
    }

    public void showFig(){
        graphs.generateGraphs(file);
    }
}
