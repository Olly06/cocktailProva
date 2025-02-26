package org.cocktail;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


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

    public Cocktail() {}

    public String getIdDrink() {
        return idDrink;
    }
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

    public String getStrIngredient1() {
        return strIngredient1;
    }
    public void setStrIngredient1(String strIngredient1) {
        this.strIngredient1 = strIngredient1;
    }

    public String getStrIngredient2() {
        return strIngredient2;
    }
    public void setStrIngredient2(String strIngredient2) {
        this.strIngredient2 = strIngredient2;
    }

    public String getStrIngredient3() {
        return strIngredient3;
    }
    public void setStrIngredient3(String strIngredient3) {
        this.strIngredient3 = strIngredient3;
    }

    public String getStrIngredient4() {
        return strIngredient4;
    }
    public void setStrIngredient4(String strIngredient4) {
        this.strIngredient4 = strIngredient4;
    }

    public String getStrIngredient5() {
        return strIngredient5;
    }
    public void setStrIngredient5(String strIngredient5) {
        this.strIngredient5 = strIngredient5;
    }

    public String getStrIngredient6() {
        return strIngredient6;
    }
    public void setStrIngredient6(String strIngredient6) {
        this.strIngredient6 = strIngredient6;
    }

    public String getStrIngredient7() {
        return strIngredient7;
    }
    public void setStrIngredient7(String strIngredient7) {
        this.strIngredient7 = strIngredient7;
    }

    public String getStrIngredient8() {
        return strIngredient8;
    }
    public void setStrIngredient8(String strIngredient8) {
        this.strIngredient8 = strIngredient8;
    }

    public String getStrIngredient9() {
        return strIngredient9;
    }
    public void setStrIngredient9(String strIngredient9) {
        this.strIngredient9 = strIngredient9;
    }

    public String getStrIngredient10() {
        return strIngredient10;
    }
    public void setStrIngredient10(String strIngredient10) {
        this.strIngredient10 = strIngredient10;
    }

    public String getStrIngredient11() {
        return strIngredient11;
    }
    public void setStrIngredient11(String strIngredient11) {
        this.strIngredient11 = strIngredient11;
    }

    public String getStrIngredient12() {
        return strIngredient12;
    }
    public void setStrIngredient12(String strIngredient12) {
        this.strIngredient12 = strIngredient12;
    }

    public String getStrIngredient13() {
        return strIngredient13;
    }
    public void setStrIngredient13(String strIngredient13) {
        this.strIngredient13 = strIngredient13;
    }

    public String getStrIngredient14() {
        return strIngredient14;
    }
    public void setStrIngredient14(String strIngredient14) {
        this.strIngredient14 = strIngredient14;
    }

    public String getStrIngredient15() {
        return strIngredient15;
    }
    public void setStrIngredient15(String strIngredient15) {
        this.strIngredient15 = strIngredient15;
    }

    public String getStrMeasure1() { return strMeasure1; }
    public void setStrMeasure1(String strMeasure1) { this.strMeasure1 = strMeasure1; }

    public String getStrMeasure2() { return strMeasure2; }
    public void setStrMeasure2(String strMeasure2) { this.strMeasure2 = strMeasure2; }

    public String getStrMeasure3() { return strMeasure3; }
    public void setStrMeasure3(String strMeasure3) { this.strMeasure3 = strMeasure3; }

    public String getStrMeasure4() { return strMeasure4; }
    public void setStrMeasure4(String strMeasure4) { this.strMeasure4 = strMeasure4; }

    public String getStrMeasure5() { return strMeasure5; }
    public void setStrMeasure5(String strMeasure5) { this.strMeasure5 = strMeasure5; }

    public String getStrMeasure6() { return strMeasure6; }
    public void setStrMeasure6(String strMeasure6) { this.strMeasure6 = strMeasure6; }

    public String getStrMeasure7() { return strMeasure7; }
    public void setStrMeasure7(String strMeasure7) { this.strMeasure7 = strMeasure7; }

    public String getStrMeasure8() { return strMeasure8; }
    public void setStrMeasure8(String strMeasure8) { this.strMeasure8 = strMeasure8; }

    public String getStrMeasure9() { return strMeasure9; }
    public void setStrMeasure9(String strMeasure9) { this.strMeasure9 = strMeasure9; }

    public String getStrMeasure10() { return strMeasure10; }
    public void setStrMeasure10(String strMeasure10) { this.strMeasure10 = strMeasure10; }

    public String getStrMeasure11() { return strMeasure11; }
    public void setStrMeasure11(String strMeasure11) { this.strMeasure11 = strMeasure11; }

    public String getStrMeasure12() { return strMeasure12; }
    public void setStrMeasure12(String strMeasure12) { this.strMeasure12 = strMeasure12; }

    public String getStrMeasure13() { return strMeasure13; }
    public void setStrMeasure13(String strMeasure13) { this.strMeasure13 = strMeasure13; }

    public String getStrMeasure14() { return strMeasure14; }
    public void setStrMeasure14(String strMeasure14) { this.strMeasure14 = strMeasure14; }

    public String getStrMeasure15() { return strMeasure15; }
    public void setStrMeasure15(String strMeasure15) { this.strMeasure15 = strMeasure15; }

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
                ", strIngredient1='" + strIngredient1 + '\'' +
                ", strIngredient2='" + strIngredient2 + '\'' +
                ", strIngredient3='" + strIngredient3 + '\'' +
                ", strIngredient4='" + strIngredient4 + '\'' +
                ", strIngredient5='" + strIngredient5 + '\'' +
                ", strIngredient6='" + strIngredient6 + '\'' +
                ", strIngredient7='" + strIngredient7 + '\'' +
                ", strIngredient8='" + strIngredient8 + '\'' +
                ", strIngredient9='" + strIngredient9 + '\'' +
                ", strIngredient10='" + strIngredient10 + '\'' +
                ", strIngredient11='" + strIngredient11 + '\'' +
                ", strIngredient12='" + strIngredient12 + '\'' +
                ", strIngredient13='" + strIngredient13 + '\'' +
                ", strIngredient14='" + strIngredient14 + '\'' +
                ", strIngredient15='" + strIngredient15 + '\'' +
                ", strMeasure1='" + strMeasure1 + '\'' +
                ", strMeasure2='" + strMeasure2 + '\'' +
                ", strMeasure3='" + strMeasure3 + '\'' +
                ", strMeasure4='" + strMeasure4 + '\'' +
                ", strMeasure5='" + strMeasure5 + '\'' +
                ", strMeasure6='" + strMeasure6 + '\'' +
                ", strMeasure7='" + strMeasure7 + '\'' +
                ", strMeasure8='" + strMeasure8 + '\'' +
                ", strMeasure9='" + strMeasure9 + '\'' +
                ", strMeasure10='" + strMeasure10 + '\'' +
                ", strMeasure11='" + strMeasure11 + '\'' +
                ", strMeasure12='" + strMeasure12 + '\'' +
                ", strMeasure13='" + strMeasure13 + '\'' +
                ", strMeasure14='" + strMeasure14 + '\'' +
                ", strMeasure15='" + strMeasure15 + '\'' +
                ", strImageSource='" + strImageSource + '\'' +
                ", strImageAttribution='" + strImageAttribution + '\'' +
                ", strCreativeCommonsConfirmed='" + strCreativeCommonsConfirmed + '\'' +
                ", dateModified='" + dateModified + '\'' +
                '}';
    }

}
