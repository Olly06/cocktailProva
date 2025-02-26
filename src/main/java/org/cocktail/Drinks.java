package org.cocktail;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Drinks {
    private List<Cocktail> drinks; //Da creare con le liste

    // Getter and Setter -> Anche qua è necessario creare i getter e setter
    public List<Cocktail> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Cocktail> drinks) {
        this.drinks = drinks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Drinks List:\n");
        if (drinks != null) {
            for (Cocktail drink : drinks) {
                sb.append(drink).append("\n");
            }
        } else {
            sb.append("No drinks found.");
        }
        return sb.toString();
    }
}
