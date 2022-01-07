package CreationalDesignPatterns.AbstractFactoryPattern.Sofa;

public class SofaFactory {
    public Sofa sofaFactory(SofaType type){
        switch (type){
            case SOFABED: return new SofaBed();
            case VINTAGE: return new VintageSofa();
            default: return null;
        }
    }
}
