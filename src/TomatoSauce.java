// a Concrete Decorator
public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza newPizza) {

        super(newPizza);
        System.out.println("Adding sauce");
    }
    
    public String getDescription(){
        
        return tempPizza.getDescription() + ", tomato sauce";
    }
    public double getCost(){
        double multiplier = 1;
        if(tempPizza.getSize().equals("medium")){
            multiplier = 1.25;
        }
        if(tempPizza.getSize().equals("large")){
            multiplier = 1.55;
        }
        System.out.println("Cost of sauce on "+tempPizza.getSize()+" pizza: " + .35*multiplier);
        return tempPizza.getCost() + .35;
    }
}