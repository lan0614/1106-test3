import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	//米字方形
    int counter=1;
    while (counter<=100){
     System.out.print("*");
     counter=counter+1;
     if(counter%10==1){
         System.out.println();
     }
     }
    }
}
