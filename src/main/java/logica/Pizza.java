/*
package logica;

public class Pizza {

    String pizzaGrote;
    String [] pizzaToppings;

    public Pizza (String pizzaGrote, String [] pizzaToppings){

     this.pizzaGrote = pizzaGrote;
     this.pizzaToppings = pizzaToppings;

    }

    public String toString(){

        if (pizzaToppings.length >= 3 ) {
            return "Een " + pizzaGrote + " pizza met " + pizzaToppings[0] + " en " + pizzaToppings[1] + " en " + pizzaToppings[2];
        } else {
            return "Een " + pizzaGrote + " pizza met " + pizzaToppings[0] + " en " + pizzaToppings[1];
        }

    }
    public Pizza add(Pizza otherPizza) {

        String combinedSize;
        if (this.pizzaGrote.equals("large") || otherPizza.pizzaGrote.equals("large")) {
            combinedSize = "large";
        } else {
            combinedSize = "medium";
        }


        String[] combinedToppings = new String[this.pizzaToppings.length + otherPizza.pizzaToppings.length];
        int index = 0;

        for (String topping : this.pizzaToppings) {
            combinedToppings[index++] = topping;
        }


        for (String topping : otherPizza.pizzaToppings) {
            boolean alreadyExists = false;
            for (String existingTopping : this.pizzaToppings) {
                if (topping.equals(existingTopping)) {
                    alreadyExists = true;
                    break;
                }
            }
            if (!alreadyExists) {
                combinedToppings[index++] = topping;
            }
        }


        if (index < combinedToppings.length) {
            String[] temp = new String[index];
            System.arraycopy(combinedToppings, 0, temp, 0, index);
            combinedToppings = temp;
        }


        return new Pizza(combinedSize, combinedToppings);
    }


    public int geefAantalToppings(){

        int toppings = pizzaToppings.length;

        return toppings;
    }
}
*/