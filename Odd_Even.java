public class Odd_Even
{
        public static void main(String args[])
        {
            System.out.println("Odd Numbers:");
            for(int i=0;i<20;i++)
            {
                if(i%2!=0)
                {
                    System.out.println(i);
                }
            }
            System.out.println("Even Numbers:");
            for(int i=0;i<20;i++)
            {
                if(i%2==0)
                {
                    System.out.println(i);
                }
            }
        }
}

