import java.util.Scanner;

public class Main {

    public static void Avg(){
        Scanner In = new Scanner(System.in);
        int tot=0,count=-1,n=0;
        //count set to -1 because the first count++ will set the count to 1 from 0
        //The first run is not the first time a number is added to the total though
        //This code was created to remove repeition of the input line n = In.nextInt() before starting a loop

        do {

            tot+=n;
            System.out.print("Enter Number:");
            n = In.nextInt();
            count++;
        }while(n>0);

        System.out.println("Average is " + tot/count);

        In.close();
    }

	//General Method
	public static void nAvg(){
        Scanner In = new Scanner(System.in);
        int tot,count=0;
		System.out.print("Enter Number:");
        int n = In.nextInt();
            
        
        while(n<0) {

            
            System.out.print("Enter Number:");
            n = In.nextInt();
            tot+=n;
			count++;
        };

        System.out.println("Average is " + tot/count);

        In.close();
    }

    
    public static void main(String args[]){

        Avg();

    }
}
