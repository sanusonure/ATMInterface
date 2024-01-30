import java.util.*;
class bankAccount
{
    int amount;
    public bankAccount(int amt)
    {
        amount=amt;
    }
    public void checkBalance()
    {
        System.out.println("Availabe Balance : "+amount);
    }
    public void withdrawAmount(int wamt)
    {
        if(wamt>amount)
            System.out.println(" Withdraw amount is greater than available balance ");
        else
        {
            amount=amount-wamt;
            System.out.println(" Availabe Balance : "+amount);
        }
    }
    public void depositAmount(int damt)
    {
        if(damt<=0)
            System.out.println(" Please enter the correct amount ");
        else
        {
            amount=amount+damt;
            System.out.println(" Availabe Balance  : "+amount);
        }
        
    }
}
class ATMInterface
{
    bankAccount ba;
    int i;
    public ATMInterface(bankAccount ba)
    {
        this.ba=ba;
    }
    Scanner sc=new Scanner(System.in);
    int choice,deposit,withdraw;
   
    public void show()
    {
        System.out.println("1.Check Balance ");
        System.out.println("2.Witrhdraw Amount ");
        System.out.println("3.Deposit Amount ");
        System.out.println("4.Leave ");
    }
    
    public void run()
    {
        
        
            while(choice!=4)
            {
                show();
                choice=sc.nextInt();
                switch(choice)
                {
                    case 1:
                        ba.checkBalance();
                    break;
                    case 2:
                        System.out.println("Enter the withdraw amount ");
                        withdraw=sc.nextInt();
                        ba.withdrawAmount(withdraw);
                    break;
                    case 3:
                        System.out.println("Enter the deposite amount ");
                        deposit=sc.nextInt();
                        ba.depositAmount(deposit);
                    break;
                    case 4:
                        System.out.println(" Thank You !!.. ");
                    break;
                }
            }
    }
    public static void  main(String args[])
    {
        bankAccount ba=new bankAccount(300);
        ATMInterface ai=new ATMInterface(ba);
        ai.run();
    }
}