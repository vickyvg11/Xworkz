class Mobile{

String name;
String storage;
int battery;
String RAM;

void Mindblowing(){
System.out.println(storage+" "+name+" "+battery+" is mindblowing mobile ..!");


}

public static void main(String args[]){

Mobile realme=new Mobile();
realme.name="realme";
realme.storage="256GB";
realme.battery=6000;
realme.Mindblowing();

}

}