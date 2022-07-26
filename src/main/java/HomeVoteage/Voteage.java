
package HomeVoteage;

public class Voteage
{

        public static void main(String[] args)
        {
            int age=12;

            if (age <=5)
            {
                System.out.println("pls register your bady");
            }
            else if (age <= 18)
            {
                System.out.println("You are not eligible for vote.");
            }
            else if(age<=75)
            {
            System.out.println("You are  eligible for vote.");
            }
            else
            {
                System.out.println("Person expries");
            }
        }

}
