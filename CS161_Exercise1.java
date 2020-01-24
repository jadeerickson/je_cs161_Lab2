class Main {

    
  public static void main(String[] args)
    {
        int x = 16;

        if (x > 0)
        {
            if (x < 1)
            {
                System.out.println("Positive small number");
            }
            else if (x > 1000000)
            {
                System.out.println("Positive large number");
            }
            else
            {
                System.out.println("Positive number");
            }
        }
        else if (x < 0)
        {
            if (Math.abs(x) < 1)
            {
                System.out.println("Negative small number");
            }
            else if (Math.abs(x) > 1000000)
            {
                System.out.println("Negative large number");
            }
            else
            {
                System.out.println("Negative number");
            }
        }
        else
        {
            System.out.println("Zero");
        }
    }
}
