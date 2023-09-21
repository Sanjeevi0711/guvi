package guviTask10;

public class Tea {
	private boolean isPrepared;
    private boolean hasMilk;
    private boolean hasSugar;

    public Tea() {
        isPrepared = false;
        hasMilk = false;
        hasSugar = false;
    }

    public void prepareTea() {
        if (isPrepared) {
            System.out.println("Tea is already prepared.");
        } else {
            System.out.println("Tea is prepared.");
            isPrepared = true;
        }
    }

    public void addMilk() {
        if (hasMilk) {
            System.out.println("Milk is already added.");
        } else {
            System.out.println("Milk is added to the tea.");
            hasMilk = true;
        }
    }

    public void addSugar() {
        if (hasSugar) {
            System.out.println("Sugar is already added.");
        } else {
            System.out.println("Sugar is added to the tea.");
            hasSugar = true;
        }
    }

    public static void main(String[] args) {
        Tea myTea = new Tea();

        myTea.prepareTea();
        myTea.addMilk();
        myTea.addSugar();
        myTea.addSugar(); 

        System.out.println("Final Tea Status:");
        System.out.println("Basic Tea with Hot water and Tea leaves  " + myTea.isPrepared);
        System.out.println("Add Milk: " + myTea.hasMilk);
        System.out.println("Add Sugar: " + myTea.hasSugar);
    }
}


