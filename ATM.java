import java.util.Scanner;
public class ATM 
{
    public static void lines()
    {
        System.out.println("======================");
    }
    public static void main(String ar[])
    {
        System.out.println("Welcome to Ranjith ATM");
        lines();
        Scanner sc = new Scanner(System.in);
        int pin_number = 1234;         // default for comparing
        float Account_Balance = 5000f;
        for(int attempt = 3; attempt>0; )
        {
            int pin = sc.nextInt();        // getting from user
            lines();
            if(pin == pin_number)
            {
                System.out.println("Welcome user");
                lines();
                for(int x = 1 ;x==1 ; )
                {
                    System.out.println("1. Credit\n2. Debit\n3. Check Balance\n4. change PIN number\n0.Exit");
                    lines();
                    int choice = sc.nextInt();
                    switch(choice)
                    {
                        case 1: 
                          {
                             System.out.print("Enter the amount to be credited: ");
                             int amount = sc.nextInt(); // reading from the user
                             lines();
                             Account_Balance =  Account_Balance + amount;
                             System.out.printf("Current Balance: %.2f\n",Account_Balance);
                             lines();
                             break;
                          }
                        case 2: 
                          {
                             System.out.print("Enter the amount to be debited: ");
                             int amount = sc.nextInt(); // reading from the user
                             lines();
                             if(amount <= Account_Balance)
                             {
                                 Account_Balance =  Account_Balance - amount;
                                 System.out.printf("Current Balance : %.2f\n",Account_Balance);
                                 lines();
                             }
                             else 
                             {
                                 System.out.println("Insufficient Balance");
                                 lines();
                             }
                             break;
                          }
                         case 3:
                             {
                                 System.out.printf("Current Balance: %.2f\n",Account_Balance);
                                 lines();
                                 break;
                             }
                            case 0:
                                {
                                    x = 0;
                                    break;
                                }
                    }
                }
                break;
            }
            else 
            {
                --attempt;
                if(attempt>0)
                System.out.println("Enter the Correct PIN number only " + attempt + ((attempt>1)?" attempts left":" attempt left"));
                lines();
            }
        }
    }
}