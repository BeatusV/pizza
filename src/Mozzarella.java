// a Concrete Decorator
public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza newPizza) {
        
        super(newPizza);
        System.out.println("Adding Mozzarella");
    }
    
    public String getDescription(){
        
        return tempPizza.getDescription() + ", mozzarella";
    }
    
    public double getCost(){
        double multiplier = 1;
        if(tempPizza.getSize().equals("medium")){
            multiplier = 1.25;
        }
        if(tempPizza.getSize().equals("large")){
            multiplier = 1.55;
        }
        System.out.println("Cost of mozzarella: " + .50*multiplier);
        return tempPizza.getCost() + .50;
    }

}
