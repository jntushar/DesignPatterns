package StructuralDesignPatterns.AdapterPattern;

import StructuralDesignPatterns.AdapterPattern.AnalyticLib.JSONGraphs;

public class GraphsAdapter implements Graphs{

    JSONGraphs jsonGraphs = new JSONGraphs();

    @Override
    public void generateGraphs(String file) {
        // converting xml to json
        file  = "JSON";
        jsonGraphs.getGraphs(file);
    }
}
