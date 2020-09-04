public class Expressions 
{
  public static void main(String[] args)
  {
    int a = 3;
    int b = 4;
    int c = 5;
    int d = 17;

    System.out.println((a + b) / c);
// 3 and 4 are added with sum 7
// 7 is divided by 5 with 1 the result of integer division
// The value displayed is 1

    System.out.println(a + b / c);
// Because division has higher precedence, 4 is divided by 5 with 0 the result of integer division
// 3 is added to 0 with sum 3
// The value displayed is 3

    System.out.println(++a);
// Add 1 to the variable a then outputs the new value which is then saved as a's new value
// The value displayed is 4

    System.out.println(--a);
// Subtracts 1 from the variable then outputs the new value which is then saved as a's new value
// The value displayed is 3

    System.out.println(a++);
// Outputs the variable a then add 1 to the variable which is then saved as a's new value
// The value displayed is 3 but a's new value is 4      

    System.out.println(a--);
// Outputs the variable a then subtracts 1 from the variable which is then saved as a's new value
// The value displayed is 4 but a's new value is 3

    System.out.println(a + 1);
// Outputs the value of (a + 1)
// The value displayed is 4

    System.out.println(d % c);
// Outputs the value of (d % c) which is the remainder of d divided by c
// The value displayed is 2

    System.out.println(d / c);
// Outputs the value of d divided by c excluding the remainder
// The value displayed is 3

    System.out.println(d % b);
// Outputs the value of (d % b) which is the remainder of d divided by b
// The value displayed is 1

    System.out.println(d / b);
// Outputs the value of (d / b) excluding the remainder
// The value displayed is 4

    System.out.println(d + a / d + b);
// Outputs the value of a/d then d and b added to that value
// The value displayed is 21

    System.out.println((d + a) / (d + b));
// Outputs the value of d+a then d+b divided by one another 
// The value displayed is 0

    System.out.println(Math.sqrt(b));
// Outputs the square root of variable b
// The value displayed is 2

    System.out.println(Math.pow(a, b));
// Outputs variable a to the variable b power
// The value displayed is 81

    System.out.println(Math.abs(-a));
// Outsputs the absolute value of the variable -a 
// The value displayed is 3

    System.out.println(Math.max(a, b));
// Outputs the greater of the two values of a and b
// The value displayed is 4

  } 
} 