 class Test1{

    double Evaluate(double Aptitudemarks, double Technicaltest){
 return Aptitudemarks+Technicaltest;
    }

double Evaluate(double Aptitudemarks,double Technicaltest,double Gradesheet){
return Aptitudemarks+Technicaltest+Gradesheet;

}

double Evaluate(double Aptitudemarks,double Technicaltest,double Gradesheet,double interview){
return Aptitudemarks+Technicaltest+Gradesheet+interview;

}
public static void main(String[] args) {
    Test1 t1 = new Test1();
    double passed = t1.Evaluate(40.5, 23.4, 0, 54.0);


    if (passed > 80) {
        System.out.println("Candidate is passed:");
    }
}
 }



