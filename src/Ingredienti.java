import java.util.HashMap;
import java.util.Map;
public class Ingredienti{
    private static final Map<String, Double> ingredients = new HashMap<>();
    public static void addIng(String x, double y){
        ingredients.put(x,y);
    }
    public static Map<String, Double> getIngredients(){
        return ingredients;
    }
}