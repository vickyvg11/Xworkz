class Student{


String name;
String city;
String ID;


void developer(){
System.out.println(city+" "+name+" "+ID+"  developer at xzworkz!!!");
}


public static void main(String args[]){
Student vikrant= new Student();
vikrant.name="vikrant";
vikrant.city="Gadag";
vikrant.ID="XZ200";
vikrant.developer();


Student abhishek=new Student();
abhishek.name="abhishek";
abhishek.city="Bangalore";
abhishek.ID="XZ201";
abhishek.developer();


Student surya=new Student();
surya.name="surya";
surya.city="Bellary";
surya.ID="XZ202";
surya.developer();


Student sachin=new Student();
sachin.name="sachin";
sachin.city="Mysore";
sachin.ID="XZ204";
sachin.developer();

Student priya=new Student();
priya.name="priya";
priya.city="Shimoga";
priya.ID="XZ205";
priya.developer();

}

}