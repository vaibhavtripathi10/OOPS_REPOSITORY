class Sig{
double magnitude;
double phase;
Sig(double magnitude,double phase){
this.magnitude = magnitude;
this.phase = phase;

}

Sig add(double magnitude,double phase){
double newMagnitude = this.magnitude+magnitude;
double newPhase = this.phase+phase;

return new Sig(newMagnitude, newPhase);

}
Sig scale(double factor){
double newMagnitude = this.magnitude*factor;
return new Sig(newMagnitude, phase); 


}

void display(){
    System.out.println("Magnitude:"+magnitude);
    System.out.println("Phase:"+phase);
    System.out.println("--------------------");
}
public static void main(String[] args) {
    Sig s1 = new Sig(4.5, 3.4);
    Sig s2 = new Sig(2.2, 3.3);
System.out.println("The Signal 1:");
s1.display();
System.out.println("The Signal 2");
s2.display();

Sig sum = s1.add(s2.magnitude,s2.phase);
System.out.println("The Addition of Signal:");
sum.display();
Sig scaled = s1.scale(4);


}



}