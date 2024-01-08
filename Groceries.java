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
System.out.println("FRUITS: \n"+fruits);
groceries.addAll(fruits);
System.out.println("GROCERIES:\n"+groceries);

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
System.out.println("VEGETABLES: \n"+vegetable);
groceries.addAll(vegetable);
System.out.println("GROCERIES:\n"+groceries);

Vector<String> anipro=new Vector<>();
anipro.add("Chicken");
anipro.add("Meat");
anipro.add("Fish");
anipro.add("Eggs");
System.out.println("ANIMAL_PRODUCTS: \n"+anipro);
groceries.addAll(anipro);
System.out.println("GROCERIES:\n"+groceries);

Vector<String> dairypro=new Vector<>();
dairypro.add("Milk");
dairypro.add("Cheese");
dairypro.add("Butter");
dairypro.add("Yogurt");
dairypro.add("Ghee");
System.out.println("DAIRY_PRODUCTS:\n"+dairypro);
groceries.addAll(dairypro);
System.out.println("GROCERIES:\n"+groceries);

Vector<String> bakery = new Vector<>();
bakery.add("Whole_wheat_bread");
bakery.add("Kulchas");
bakery.add("Bakery_buns");
bakery.add("Biscuits");
bakery.add("Cakes");
System.out.println("BAKERY_PRODUCTS:\n"+bakery);
groceries.addAll(bakery);
System.out.println("GROCERIES:\n"+groceries);

Vector<String> condiments=new Vector<>();
condiments.add("Salt");
condiments.add("Pepper");
condiments.add("Sugar");
System.out.println("CONDIMENTS:\n"+condiments);
groceries.addAll(condiments);
System.out.println("GROCERIES:\n"+groceries);

Vector<String> indspe=new Vector<>();
indspe.add("Cardamom");
indspe.add("Cinnamon");
indspe.add("Nutmeg");
indspe.add("Zeera");
indspe.add("Ajwain");
indspe.add("Turmeric");
System.out.println("INDIAN_SPECIES:\n"+indspe);
groceries.addAll(indspe);
System.out.println("GROCERIES:\n"+groceries);

Vector<String> oilsauce=new Vector<>();
oilsauce.add("Olive_oil");
oilsauce.add("Mustard_oil");
oilsauce.add("Sunflower_oil");
oilsauce.add("Soya_sauce");
oilsauce.add("Fish_sauce");
oilsauce.add("Vinegar");
oilsauce.add("Tomato_ketchup");
System.out.println("OIL_AND_SAUCES:\n"+oilsauce);
groceries.addAll(oilsauce);
System.out.println("GROCERIES:\n"+groceries);

Vector<String> grainlegu=new Vector<>();
grainlegu.add("Atta");
grainlegu.add("Rice");
grainlegu.add("Pasta");
System.out.println("GRAINS_LEGUMES:\n"+grainlegu);
groceries.addAll(grainlegu);
System.out.println("GROCERIES:\n"+groceries);

Vector<String> legumes=new Vector<>();
legumes.add("Chickpeas");
legumes.add("Kidney_beans");
legumes.add("Lentils");
legumes.add("Beans");
System.out.println("LEGUMES:\n"+legumes);
groceries.addAll(legumes);
System.out.println("GROCERIES:\n"+groceries);

Vector<String> snacks=new Vector<>();
snacks.add("Walnuts");
snacks.add("Almonds");
snacks.add("Raisins");
snacks.add("Papad");
snacks.add("Honey");
System.out.println("SNACKS:\n"+snacks);
groceries.addAll(snacks);
System.out.println("GROCERIES:\n"+groceries);

Vector<String> clean=new Vector<>();
clean.add("Dishwasher_soap");
clean.add("Detergent_powder");
clean.add("Shaving_cream");
clean.add("Toilet_cleaner");
clean.add("Floor_cleaner");
clean.add("Soap");
clean.add("Shampoo");
clean.add("Toilet_roll");
clean.add("Tissue_paper");
clean.add("Toothpaste_and_brush");
clean.add("Broom_and_mopper");
System.out.println("CLEANING_SUPPLIES:\n"+clean);
groceries.addAll(clean);
System.out.println("GROCERIES:\n"+groceries);
}
}


