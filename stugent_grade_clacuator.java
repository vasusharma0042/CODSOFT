import java.util.Scanner;

class stugent_grade_clacuator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Studrnt Grade claculator");
        System.out.println("Enter number if Subject");
        int num = sc.nextInt();
        int total = 0;
        for(int i =1;i<=num;i++){
            System.out.println("Enter marks obtain in"+ i+": ");
            int marks = sc.nextInt();
            total+=marks;
        }

        
        double averPer=(double)total/num;
    char Grade;
    if(averPer>=90){
        Grade='A';
    }
    else if(averPer>=80){
        Grade='B';
    }
    else if(averPer>=60){
        Grade='C';
    }
    else if(averPer>=40){
        Grade='E';
    }else{
        Grade='F';
    }
    System.out.println("Total Marks Scored is"+total);
    System.out.println("Average Percentage Gained is"+averPer+"%");
    System.out.println("Grade"+Grade);
    
    }
}
