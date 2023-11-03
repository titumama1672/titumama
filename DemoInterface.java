interface Dipak{
static final double pi = 3.14;
public void display();
}
class Man{
double Z = 200;

void Man2(){
System.out.println("I am Dipak here");
System.out.println("This is the new method");
}
}
class DemoInterface extends Man implements Dipak{
public void display(){
System.out.println("I am Manish here");
System.out.println("This is override method");
}
public static void main(String [] args){
DemoInterface dr = new DemoInterface();
dr.display();
dr.Man2();
}
}