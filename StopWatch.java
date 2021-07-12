import java.util.Scanner;
public class StopWatch
{
        public static void main(String[] args)
        {
                Scanner scan =new Scanner(System.in);
                System.out.println("Press any value to start :- ");
                double startTimer = scan.nextDouble();

                System.out.println("Press any value to stop :- ");
                double stopTimer = scan.nextDouble();

                double elapsed=stopTimer-startTimer;
                double a =elapsed-0.4;
                if (elapsed<0)
                {
                        double Elapsed = 24 + elapsed;
                        System.out.println("Time elaspsed is :- " + Elapsed);
                }
                else
                {
                        System.out.println("Time elaspsed is :- " + a);

                }
                        //System.out.println("Time elaspsed is :- " + elapsed);

        }
}
