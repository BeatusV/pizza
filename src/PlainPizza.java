// a Concrete Component
public class PlainPizza implements Pizza {
    private String size;
    public String getDescription() {
        
        return "Just a plain pizza";
    }

    public double getCost() {
        double multiplier = 1;
        if(getSize().equals("medium")){
            multiplier = 1.25;
        }
        if(getSize().equals("large")){
            multiplier = 1.55;
        }
        System.out.println("Cost of plain "+getSize()+ "pizza: " + 4.00*multiplier);
        return 4.00*multiplier;
    }

    @Override
    public String getSize() {

        return size;
    }

    @Override
    public void setSize(String size) {
        System.out.println("Pizza will be made in size: " + size);
        this.size = size;
    }
}
