import java.util.*;
class Polymorphism{
void print(){
System.out.println("Welcome");
}
void print(String n){
System.out.println("Welcome "+n);
}
}
class PolymorphismTest{
public static void main(String args[]){
Polymorphism ob=new Polymorphism();
ob.print();
Scanner sc=new Scanner(System.in);
System.out.println("Please type your name: ");
String s=sc.next();
ob.print(s);
}
}