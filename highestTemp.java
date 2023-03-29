import java.util.Scanner;

public class highestTemp {
  public static void main(String[] args){

  Scanner scan = new Scanner(System.in);
  

    
    int degree = 0;
    int[] highTemp = new int[12];
    String[] month ={"January", "Feburary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

   for(int i=0; i<highTemp.length; i++){
      System.out.println("Enter highest temperature for month "+ (i+1)+ ":");  //adding 1 to i to start the month at Month 1.
       highTemp[i] = scan.nextInt();
   
   }
   for(int i=0; i<highTemp.length; i++){
     if(degree < highTemp[i])     //compared degree to highTemp[i]
       degree = highTemp[i] ;      //assigned degree to highTemp[i]
     }

     for(int j=0; j<highTemp.length; j++){
     if(highTemp[j] == degree){     //comparing highTemp[i] to degree to see if they equal to determine the highest temp. 

           System.out.println("Highest temperature is "+highTemp[j]+ ". It was in the month of "+month[j]+ ".");
           System.out.println();
     }
   }
  }
}


