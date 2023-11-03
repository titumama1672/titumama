abstract class Book{
abstract void display();
}

class magazine_book extends Book{
void display(){
System.out.println("Publisher of the book is Manish Attar");
System.out.println("Name of Book is Headfirst");
}
}

class reference_book extends Book{
void display(){
System.out.println("The publisher of the book is Yash Attar");
System.out.println("Name of Book is EBalance");
}
}

class demobook{
public static void main(String[] args){
reference_book r = new reference_book();
magazine_book m = new magazine_book();
r.display();
m.display();
}
}