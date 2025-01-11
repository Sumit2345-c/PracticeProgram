package interviewsquestions;

public class ArmstrongNumber {

    public static void main(String[] args){
        int n=153;
        int sum=0;
        int temp=n;
        while(n!=0)
        {
            int r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println(temp +"is a armstrong number");
        }
        else
        {
            System.out.println(temp +"is not armstrong number");
        }
        
    }
}
