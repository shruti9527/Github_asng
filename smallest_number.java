import java.util.Scanner;

public class smallest_number{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter first number");
int f_no = sc.nextInt();

System.out.println("Enter second number");
int s_no = sc.nextInt();

System.out.println("Enter third number");
int t_no = sc.nextInt();

if((f_no < s_no) && (f_no < t_no)){
System.out.println("First number is smallest " );
}

if((s_no < f_no) && (s_no < t_no)){
System.out.println("Second number is smallest " );

}

if((t_no < f_no) && (t_no < s_no)){
System.out.println("Third number is smallest " );
}


}

}
