package org.cocktail;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Cocktail {
    private String idDrink;
    private String strDrink;
    private String strDrinkAlternate;
    private String strTags;
    private String strVideo;
    private String strCategory;
    private String strIBA;
    private String strAlcoholic;
    private String strGlass;
    private String strInstructions;
    private String strInstructionsES;
    private String strInstructionsDE;
    private String strInstructionsFR;
    private String strInstructionsIT;
    @JsonProperty("strInstructionsZH-HANS")
    private String strInstructionsZH_HANS;
    @JsonProperty("strInstructionsZH-HANT")
    private String strInstructionsZH_HANT;

    private String strDrinkThumb;


    private String[] strIngredients = new String[15];
    // Custom mapping to populate the array
    @JsonProperty("strIngredient1")
    public void setIngredient1(String ingredient) { strIngredients[0] = ingredient; }
    @JsonProperty("strIngredient2")
    public void setIngredient2(String ingredient) { strIngredients[1] = ingredient; }
    @JsonProperty("strIngredient3")
    public void setIngredient3(String ingredient) { strIngredients[2] = ingredient; }
    @JsonProperty("strIngredient4")
    public void setIngredient4(String ingredient) { strIngredients[3] = ingredient; }
    @JsonProperty("strIngredient5")
    public void setIngredient5(String ingredient) { strIngredients[4] = ingredient; }
    @JsonProperty("strIngredient6")
    public void setIngredient6(String ingredient) { strIngredients[5] = ingredient; }
    @JsonProperty("strIngredient7")
    public void setIngredient7(String ingredient) { strIngredients[6] = ingredient; }
    @JsonProperty("strIngredient8")
    public void setIngredient8(String ingredient) { strIngredients[7] = ingredient; }
    @JsonProperty("strIngredient9")
    public void setIngredient9(String ingredient) { strIngredients[8] = ingredient; }
    @JsonProperty("strIngredient10")
    public void setIngredient10(String ingredient) { strIngredients[9] = ingredient; }
    @JsonProperty("strIngredient11")
    public void setIngredient11(String ingredient) { strIngredients[10] = ingredient; }
    @JsonProperty("strIngredient12")
    public void setIngredient12(String ingredient) { strIngredients[11] = ingredient; }
    @JsonProperty("strIngredient13")
    public void setIngredient13(String ingredient) { strIngredients[12] = ingredient; }
    @JsonProperty("strIngredient14")
    public void setIngredient14(String ingredient) { strIngredients[13] = ingredient; }
    @JsonProperty("strIngredient15")
    public void setIngredient15(String ingredient) { strIngredients[14] = ingredient; }


    private String[] strMeasures = new String[15];
    // Custom mapping for Measures
    @JsonProperty("strMeasure1")
    public void setStrMeasure1(String value) { this.strMeasures[0] = value; }
    @JsonProperty("strMeasure2")
    public void setStrMeasure2(String value) { this.strMeasures[1] = value; }
    @JsonProperty("strMeasure3")
    public void setStrMeasure3(String value) { this.strMeasures[2] = value; }
    @JsonProperty("strMeasure4")
    public void setStrMeasure4(String value) { this.strMeasures[3] = value; }
    @JsonProperty("strMeasure5")
    public void setStrMeasure5(String value) { this.strMeasures[4] = value; }
    @JsonProperty("strMeasure6")
    public void setStrMeasure6(String value) { this.strMeasures[5] = value; }
    @JsonProperty("strMeasure7")
    public void setStrMeasure7(String value) { this.strMeasures[6] = value; }
    @JsonProperty("strMeasure8")
    public void setStrMeasure8(String value) { this.strMeasures[7] = value; }
    @JsonProperty("strMeasure9")
    public void setStrMeasure9(String value) { this.strMeasures[8] = value; }
    @JsonProperty("strMeasure10")
    public void setStrMeasure10(String value) { this.strMeasures[9] = value; }
    @JsonProperty("strMeasure11")
    public void setStrMeasure11(String value) { this.strMeasures[10] = value; }
    @JsonProperty("strMeasure12")
    public void setStrMeasure12(String value) { this.strMeasures[11] = value; }
    @JsonProperty("strMeasure13")
    public void setStrMeasure13(String value) { this.strMeasures[12] = value; }
    @JsonProperty("strMeasure14")
    public void setStrMeasure14(String value) { this.strMeasures[13] = value; }
    @JsonProperty("strMeasure15")
    public void setStrMeasure15(String value) { this.strMeasures[14] = value; }


    private String strImageSource;
    private String strImageAttribution;
    private String strCreativeCommonsConfirmed;
    private String dateModified;

    public Cocktail() {} //Serve per la classe ObjectMapper dove salvare tutti i dati

    public String getIdDrink() {
        return idDrink;
    }//La classe ObjectMapper Richiede che tutte le variabili abbiano costruttori
    public void setIdDrink(String idDrink) {
        this.idDrink = idDrink;
    }

    public String getStrDrink() {
        return strDrink;
    }
    public void setStrDrink(String strDrink) {
        this.strDrink = strDrink;
    }

    public String getStrDrinkAlternate() {
        return strDrinkAlternate;
    }
    public void setStrDrinkAlternate(String strDrinkAlternate) {
        this.strDrinkAlternate = strDrinkAlternate;
    }

    public String getStrTags() {
        return strTags;
    }
    public void setStrTags(String strTags) {
        this.strTags = strTags;
    }

    public String getStrVideo() {
        return strVideo;
    }
    public void setStrVideo(String strVideo) {
        this.strVideo = strVideo;
    }

    public String getStrCategory() {
        return strCategory;
    }
    public void setStrCategory(String strCategory) {
        this.strCategory = strCategory;
    }

    public String getStrIBA() {
        return strIBA;
    }
    public void setStrIBA(String strIBA) {
        this.strIBA = strIBA;
    }

    public String getStrAlcoholic() {
        return strAlcoholic;
    }
    public void setStrAlcoholic(String strAlcoholic) {
        this.strAlcoholic = strAlcoholic;
    }

    public String getStrGlass() {
        return strGlass;
    }
    public void setStrGlass(String strGlass) {
        this.strGlass = strGlass;
    }

    public String getStrInstructions() {
        return strInstructions;
    }
    public void setStrInstructions(String strInstructions) {
        this.strInstructions = strInstructions;
    }

    public String getStrInstructionsES() {
        return strInstructionsES;
    }
    public void setStrInstructionsES(String strInstructionsES) {
        this.strInstructionsES = strInstructionsES;
    }

    public String getStrInstructionsDE() {
        return strInstructionsDE;
    }
    public void setStrInstructionsDE(String strInstructionsDE) {
        this.strInstructionsDE = strInstructionsDE;
    }

    public String getStrInstructionsFR() {
        return strInstructionsFR;
    }
    public void setStrInstructionsFR(String strInstructionsFR) {
        this.strInstructionsFR = strInstructionsFR;
    }

    public String getStrInstructionsIT() {
        return strInstructionsIT;
    }
    public void setStrInstructionsIT(String strInstructionsIT) {
        this.strInstructionsIT = strInstructionsIT;
    }

    public String getStrInstructionsZH_HANS() {
        return strInstructionsZH_HANS;
    }
    public void setStrInstructionsZH_HANS(String strInstructionsZH_HANS) {
        this.strInstructionsZH_HANS = strInstructionsZH_HANS;
    }

    public String getStrInstructionsZH_HANT() {
        return strInstructionsZH_HANT;
    }
    public void setStrInstructionsZH_HANT(String strInstructionsZH_HANT) {
        this.strInstructionsZH_HANT = strInstructionsZH_HANT;
    }

    public String getStrDrinkThumb() {
        return strDrinkThumb;
    }
    public void setStrDrinkThumb(String strDrinkThumb) {
        this.strDrinkThumb = strDrinkThumb;
    }

    // Getter for strIngredients
    public String[] getIngredients() {
        return strIngredients;
    }
    // Getter for strMeasures
    public String[] getMeasures() {
        return strMeasures;
    }


    public String getStrImageSource() { return strImageSource; }
    public void setStrImageSource(String strImageSource) { this.strImageSource = strImageSource; }

    public String getStrImageAttribution() { return strImageAttribution; }
    public void setStrImageAttribution(String strImageAttribution) { this.strImageAttribution = strImageAttribution; }

    public String getStrCreativeCommonsConfirmed() { return strCreativeCommonsConfirmed; }
    public void setStrCreativeCommonsConfirmed(String strCreativeCommonsConfirmed) { this.strCreativeCommonsConfirmed = strCreativeCommonsConfirmed; }

    public String getDateModified() { return dateModified; }
    public void setDateModified(String dateModified) { this.dateModified = dateModified; }

    @Override
    public String toString() {
        return "Drink {" +
                "idDrink=" + idDrink +
                ", strDrink='" + strDrink + '\'' +
                ", strDrinkAlternate='" + strDrinkAlternate + '\'' +
                ", strTags='" + strTags + '\'' +
                ", strVideo='" + strVideo + '\'' +
                ", strCategory='" + strCategory + '\'' +
                ", strIBA='" + strIBA + '\'' +
                ", strAlcoholic='" + strAlcoholic + '\'' +
                ", strGlass='" + strGlass + '\'' +
                ", strInstructions='" + strInstructions + '\'' +
                ", strInstructionsES='" + strInstructionsES + '\'' +
                ", strInstructionsDE='" + strInstructionsDE + '\'' +
                ", strInstructionsFR='" + strInstructionsFR + '\'' +
                ", strInstructionsIT='" + strInstructionsIT + '\'' +
                ", strInstructionsZHHANS='" + strInstructionsZH_HANS + '\'' +
                ", strInstructionsZHHANT='" + strInstructionsZH_HANT + '\'' +
                ", strDrinkThumb='" + strDrinkThumb + '\'' +
                ", strIngredients=" + Arrays.toString(strIngredients) + '\'' +
                ", strMeasures=" + Arrays.toString(strMeasures) + '\'' +
                ", strImageSource='" + strImageSource + '\'' +
                ", strImageAttribution='" + strImageAttribution + '\'' +
                ", strCreativeCommonsConfirmed='" + strCreativeCommonsConfirmed + '\'' +
                ", dateModified='" + dateModified + '\'' +
                '}';
    }

}
