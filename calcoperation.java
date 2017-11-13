import java.util.Scanner;
import java.io.*;
     
public class Calculator {
    
public int add(int num1, int num2)
{
	int sum;
	sum = num1 + num2;
	return sum;
}
     
public int sub(int num1, int num2)
{
	int sum;
	sum = num1 - num2;
	return sum;
}

public int multi(int num1, int num2)
{
	int sum;
	sum = num1 * num2;
	return sum;
}

public int div(int num1, int num2)
{
	int sum = 0;
	if (num2 == 0)
	{
		System.out.println("ERROR: Can't divide by 0");
	}
	else
	{
		sum = num1 / num2;
	}
	return sum;
}

public int mod(int num1, int num2)
{
	int sum;
	sum = num1 % num2;
	
	return sum;
}

public int pow(int base, int exp)
{
	int sum = 1;
	if (exp == 0)
	{
		sum = 1;
	}
	while (exp > 0)
	{
		sum = sum * base;
		exp--;
	}
	return sum;
	}

 public static void main(String[] args) 
{
	int choice;
        	int x;
        	int y;
        	int sum;
        	PrintStream out;
     
        	Calculator calc = new Calculator();
     
        	try
        	{
        		out = new PrintStream ("calcdata.txt");
        		do
        		{
        			System.out.println("Basic Calculator Program");
        			System.out.println("1.  Add");
        			System.out.println("2.  Subtract");
        			System.out.println("3.  Multiply");
        			System.out.println("4.  Divide");
        			System.out.println("5.  Mod");
        			System.out.println("6.  Power");
        			System.out.println("0. End Program\n");
        			System.out.println("Enter Choice: ");
     
       			Scanner input = new Scanner(System.in);
        			choice = input.nextInt();

			while ((choice < 1 || choice > 6) && choice != 0)
 			{
        				System.out.println("Please enter your choice : " );
        				choice = input.nextInt();
        			}
 			System.out.println("Please enter 2 numbers : ");
        			x = input.nextInt();
        			y = input.nextInt();

			switch (choice)
			{

			case 1: 
				sum = calc.add(x,y);
				System.out.printf("The Sum is %d\n\n",sum);
				out.println(x + "+" + y + "=" + sum);
				break;
			case 2:
				sum = calc.sub(x,y);
				System.out.printf("The Subtraction is %d\n\n",sum);
				out.println(x + "-" + y + "=" + sum);
				break;
			case 3:
				sum = calc.multi(x,y);
				System.out.printf("The Multiplication is %d\n\n",sum);
				out.println(x + "*" + y + "=" + sum);
				break;
			case 4:
				sum = calc.div(x,y);
				if(sum==0){
					System.out.print("Please check the number.");
					break;
				}
				else{
				System.out.printf("The Division is %d\n\n",sum);
				out.println(x + "/" + y + "=" + sum);
				}
				break;
			case 5:
				sum = calc.mod(x,y);
				System.out.printf("The Mod is %d\n\n",sum);
				out.println(x + "%" + y + "=" + sum);
				break;
			case 6:
				sum = calc.pow(x,y);
				System.out.printf("The Power is %d\n\n",sum);
				out.println(x + "^" + y + "=" + sum);
				break;
			}

		}while (choice != 0);

        		System.out.println("Ending program...");
	}

	catch(Exception e)
	{
		System.out.println("ERROR: Could not open file!");
	}
	}
}
