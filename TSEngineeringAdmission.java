
class NotEligibleForEngineering extends RuntimeException
{
    NotEligibleForEngineering(String s)
    {
        super(s);
    }
}

class NotEligibleForVJIT extends RuntimeException
{
    NotEligibleForVJIT(String s)
    {
        super(s);
    }
}

public class TSEngineeringAdmission
{
    public static void main(String[] args)
    {
        try
        {
            int score = Integer.parseInt(args[0]);

            if(score < 50)
            {
                throw new NotEligibleForEngineering("You are not eligible for Engineering admission");
            }

           
            else if(score < 70)
            {
                throw new NotEligibleForVJIT("You are eligible for Engineering but not eligible for VJIT");
            }

          
            else
            {
                System.out.println("Welcome to VJIT-Thanks For Your Registration!");
            }
        }

        
        catch(NotEligibleForEngineering | NotEligibleForVJIT e)
        {
            e.printStackTrace();      
            System.out.println(e.getMessage());  
            System.out.println(e.toString());    
        }

       
        System.out.println("Rest of the Code");
    }
}