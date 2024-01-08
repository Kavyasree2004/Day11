//Groceries

import java.util.Vector;
class Vector2{
public static void main(String args[]){
Vector<String> groceries=new Vector<>();
groceries.add("Pulses");
groceries.add("Rice");
groceries.add("Dal");
groceries.add(2,"Oil");
System.out.println("Vector: "+groceries);
Vector<String> snacks=new Vector<>();
snacks.add("French fries");
snacks.add("Deserts");
snacks.addAll(groceries);
System.out.println("New Vector: "+snacks);
}
}