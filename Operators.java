class Operators{
int c;


public void Addition(){
int a=10;
int b=20;
c=a+b;
System.out.println("addition of a+b is: "+c);
 }

public void Substraction(){
int a=20;
int b=10;
c=a-b;
System.out.println("substraction of a-b is: "+c);

}
public void Multiplication(){
int a=20;
int b=10;
c=a*b;
System.out.println("Multiplication of a*b is: "+c);

}
public void Divsion(){
int a=20;
int b=10;
c=a/b;
System.out.println("Division of a/b is: "+c);
}
public void Modulous(){
int a=10;
int b=20;
c=a%b;
System.out.println("Modulous of a%b is : "+c);
}

public static void main (String args[]){
Operators Instance=new Operators();
Instance.Addition();
Instance.Substraction();
Instance.Multiplication();
Instance.Divsion();
Instance.Modulous();
}

}