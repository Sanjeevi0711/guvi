package guviTask10;

public class PolymorpismTea {
	class Tea {
	    private String name;

	    public Tea(String name) {
	        this.name = name;
	    }

	    public void brew() {
	        System.out.println("Brewing a cup of " + name + " tea.");
	    }
	}

	class GreenTea extends Tea {
	    public GreenTea() {
	        super("Green Tea");
	    }

	    @Override
	    public void brew() {
	        System.out.println("Brewing a cup of Green Tea. Enjoy the health benefits!");
	    }
	}

	class BlackTea extends Tea {
	    public BlackTea() {
	        super("Black Tea");
	    }

	    @Override
	    public void brew() {
	        System.out.println("Brewing a cup of Black Tea. It's bold and flavorful!");
	    }
	}

	public class PolymorphismExample {
	    public static void main(String[] args) {
	        // Create an array of Tea objects
	        Tea[] teas = new Tea[3];
	        teas[0] = new Tea(Herbal Tea);
	        teas[1] = new GreenTea();
	        teas[2] = new BlackTea();

	        // Demonstrate polymorphism by calling the brew method on each object
	        for (Tea tea : teas) {
	            tea.brew();
	        }
	    }
	}


}
