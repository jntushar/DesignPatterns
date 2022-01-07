package CreationalDesignPatterns.AbstractFactoryPattern.Table;

public class TableFactory {
    public Table tableFactory(TableTypes type){
        switch (type){
            case FANCY: return new FancyTable();
            case STUDY: return new StudyTable();
            case DINING: return new DiningTable();
            default: return null;
        }
    }
}
