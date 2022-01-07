package CreationalDesignPatterns.AbstractFactoryPattern.Chair;

public class ChairFactory {

    public Chair chairFactory(ChairTypes type){
        switch (type){
            case BASIC: return new BasicChair();
            case FOLDABLE: return new FoldableChair();
            case ERGONOMIC: return new ErgonomicChair();
            default: return null;
        }
    }
}
