public class Palidrome2
{
public static void main(String args[])
{
int n=5421;
int num=n;
int reverse=0;
while(n>0){
int remainder =n%10;
reverse =(reverse*10)+remainder;
n=n/10;}
if (num==reverse){
System.out.println(n+"is a palidrome number");
}else{
System.out.println(n+"is not a palidrome number");
}
}
}
