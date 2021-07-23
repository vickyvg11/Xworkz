class Flower{
	
String name;
String color;
int noOfPetals;

void blomming(){
System.out.println(noOfPetals +color+" "+name+" is blomming..!");

}
void shedfragrance(){
System.out.println(noOfPetals +color+" "+name+" is sheddingfragrance..!");
}

public static void main(String args[]){
Flower rose=new Flower();
rose.name= "Rose";
rose.color="Red";
rose.noOfPetals=15;
rose.blomming();
rose.shedfragrance();

}


}
