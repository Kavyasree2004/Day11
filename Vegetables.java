import java.util.Vector;
class Groceries{
public static void main(String args[]){
Vector<String> groceries=new Vector<>();
Vector<String> fruits=new Vector<>();
fruits.add("Mango");
fruits.add("Banana");
fruits.add("Grapes");
fruits.add("Berries");
fruits.add("Apples");
fruits.add("Citrus_fruits");
fruits.add("Peaches");
fruits.add("Coconut");
fruits.add("Pears");
fruits.add("Pineapples");
System.out.println("Fruits: "+fruits);
groceries.addAll(fruits);

Vector<String> vegetable=new Vector<>();
vegetable.add("Onion");
vegetable.add("Tomato");
vegetable.add("Chilies");
vegetable.add("Ginger");
vegetable.add("Garlic");
vegetable.add("Potato");
vegetable.add("Peppers");
vegetable.add("Broccoli");
vegetable.add("Carrots");
vegetable.add("Cabbage");
System.out.println("Vegetables: "+vegetable);
groceries.addAll(vegetable);
System.out.println("GROCERIES: "+groceries);

}
}